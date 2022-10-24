package typings.ink

import typings.ink.anon.readonlymarginnumberundef
import typings.ink.buildComponentsNewlineMod.Props
import typings.ink.buildDomMod.DOMElement
import typings.ink.buildHooksUseFocusMod.Input
import typings.ink.buildHooksUseInputMod.Handler
import typings.ink.buildHooksUseInputMod.Options
import typings.ink.buildMeasureElementMod.Output
import typings.ink.buildRenderMod.RenderFunction
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `<Box>` is an essential Ink component to build your layout. It's like `<div style="display: flex">` in the browser.
    */
  @JSImport("ink", "Box")
  @js.native
  val Box: ForwardRefExoticComponent[readonlymarginnumberundef] = js.native
  
  /**
    * Adds one or more newline (\n) characters. Must be used within <Text> components.
    */
  @JSImport("ink", "Newline")
  @js.native
  val Newline: FC[Props] = js.native
  
  /**
    * A flexible space that expands along the major axis of its containing layout.
    * It's useful as a shortcut for filling all the available spaces between elements.
    */
  @JSImport("ink", "Spacer")
  @js.native
  val Spacer: FC[js.Object] = js.native
  
  /**
    * `<Static>` component permanently renders its output above everything else.
    * It's useful for displaying activity like completed tasks or logs - things that
    * are not changing after they're rendered (hence the name "Static").
    *
    * It's preferred to use `<Static>` for use cases like these, when you can't know
    * or control the amount of items that need to be rendered.
    *
    * For example, [Tap](https://github.com/tapjs/node-tap) uses `<Static>` to display
    * a list of completed tests. [Gatsby](https://github.com/gatsbyjs/gatsby) uses it
    * to display a list of generated pages, while still displaying a live progress bar.
    */
  object Static {
    
    inline def apply[T](props: typings.ink.buildComponentsStaticMod.Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("ink", "Static")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink", "Static.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * This component can display text, and change its style to make it colorful, bold, underline, italic or strikethrough.
    */
  @JSImport("ink", "Text")
  @js.native
  val Text: FC[typings.ink.buildComponentsTextMod.Props] = js.native
  
  /**
    * Transform a string representation of React components before they are written to output.
    * For example, you might want to apply a gradient to text, add a clickable link or create some text effects.
    * These use cases can't accept React nodes as input, they are expecting a string.
    * That's what <Transform> component does, it gives you an output string of its child components and lets you transform it in any way.
    */
  @JSImport("ink", "Transform")
  @js.native
  val Transform: FC[typings.ink.buildComponentsTransformMod.Props] = js.native
  
  inline def measureElement(node: DOMElement): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("measureElement")(node.asInstanceOf[js.Any]).asInstanceOf[Output]
  
  /**
    * Mount a component and render the output.
    */
  @JSImport("ink", "render")
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
