package typings.ink

import typings.ink.anon.Children
import typings.ink.buildComponentsBoxMod.Props
import typings.ink.buildDomMod.DOMElement
import typings.ink.buildHooksUseFocusMod.Input
import typings.ink.buildHooksUseInputMod.Handler
import typings.ink.buildHooksUseInputMod.Options
import typings.ink.buildMeasureElementMod.Output
import typings.ink.buildRenderMod.RenderFunction
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("ink/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `<Box>` is an essential Ink component to build your layout. It's like `<div style="display: flex">` in the browser.
    */
  @JSImport("ink/build", "Box")
  @js.native
  val Box: ForwardRefExoticComponent[Props & Children & RefAttributes[DOMElement]] = js.native
  
  inline def Newline(param0: typings.ink.buildComponentsNewlineMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Newline")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Spacer(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Spacer")().asInstanceOf[Element]
  
  inline def Static[T](props: typings.ink.buildComponentsStaticMod.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Static")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Text(param0: typings.ink.buildComponentsTextMod.Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Text")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Transform(param0: typings.ink.buildComponentsTransformMod.Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  /**
    * Measure the dimensions of a particular `<Box>` element.
    */
  inline def measureElement(node: DOMElement): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("measureElement")(node.asInstanceOf[js.Any]).asInstanceOf[Output]
  
  /**
    * Mount a component and render the output.
    */
  @JSImport("ink/build", "render")
  @js.native
  val render: RenderFunction = js.native
  
  inline def useApp(): typings.ink.buildComponentsAppContextMod.Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useApp")().asInstanceOf[typings.ink.buildComponentsAppContextMod.Props]
  
  /**
    * Component that uses `useFocus` hook becomes "focusable" to Ink,
    * so when user presses <kbd>Tab</kbd>, Ink will switch focus to this component.
    * If there are multiple components that execute `useFocus` hook, focus will be
    * given to them in the order that these components are rendered in.
    * This hook returns an object with `isFocused` boolean property, which
    * determines if this component is focused or not.
    */
  inline def useFocus(): typings.ink.buildHooksUseFocusMod.Output = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocus")().asInstanceOf[typings.ink.buildHooksUseFocusMod.Output]
  inline def useFocus(param0: Input): typings.ink.buildHooksUseFocusMod.Output = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocus")(param0.asInstanceOf[js.Any]).asInstanceOf[typings.ink.buildHooksUseFocusMod.Output]
  
  /**
    * This hook exposes methods to enable or disable focus management for all
    * components or manually switch focus to next or previous components.
    */
  inline def useFocusManager(): typings.ink.buildHooksUseFocusManagerMod.Output = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")().asInstanceOf[typings.ink.buildHooksUseFocusManagerMod.Output]
  
  /**
    * This hook is used for handling user input.
    * It's a more convenient alternative to using `StdinContext` and listening to `data` events.
    * The callback you pass to `useInput` is called for each character when user enters any input.
    * However, if user pastes text and it's more than one character, the callback will be called only once and the whole string will be passed as `input`.
    *
    * ```
    * import {useInput} from 'ink';
    *
    * const UserInput = () => {
    *   useInput((input, key) => {
    *     if (input === 'q') {
    *       // Exit program
    *     }
    *
    *     if (key.leftArrow) {
    *       // Left arrow key pressed
    *     }
    *   });
    *
    *   return …
    * };
    * ```
    */
  inline def useInput(inputHandler: Handler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(inputHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useInput(inputHandler: Handler, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(inputHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useStderr(): typings.ink.buildComponentsStderrContextMod.Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useStderr")().asInstanceOf[typings.ink.buildComponentsStderrContextMod.Props]
  
  inline def useStdin(): typings.ink.buildComponentsStdinContextMod.Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useStdin")().asInstanceOf[typings.ink.buildComponentsStdinContextMod.Props]
  
  inline def useStdout(): typings.ink.buildComponentsStdoutContextMod.Props = ^.asInstanceOf[js.Dynamic].applyDynamic("useStdout")().asInstanceOf[typings.ink.buildComponentsStdoutContextMod.Props]
}
