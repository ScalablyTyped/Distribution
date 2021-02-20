package typings.ink

import typings.ink.anon.readonlymarginnumberundef
import typings.ink.domMod.DOMElement
import typings.ink.measureElementMod.Output
import typings.ink.newlineMod.Props
import typings.ink.renderMod.RenderFunction
import typings.ink.useFocusMod.Input
import typings.ink.useInputMod.Handler
import typings.ink.useInputMod.Options
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    
    @JSImport("ink", "Static")
    @js.native
    def apply[T](props: typings.ink.staticMod.Props[T]): Element = js.native
    @JSImport("ink", "Static")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink", "Static.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * This component can display text, and change its style to make it colorful, bold, underline, italic or strikethrough.
    */
  @JSImport("ink", "Text")
  @js.native
  val Text: FC[typings.ink.textMod.Props] = js.native
  
  /**
    * Transform a string representation of React components before they are written to output.
    * For example, you might want to apply a gradient to text, add a clickable link or create some text effects.
    * These use cases can't accept React nodes as input, they are expecting a string.
    * That's what <Transform> component does, it gives you an output string of its child components and lets you transform it in any way.
    */
  @JSImport("ink", "Transform")
  @js.native
  val Transform: FC[typings.ink.transformMod.Props] = js.native
  
  @JSImport("ink", "measureElement")
  @js.native
  def measureElement(node: DOMElement): Output = js.native
  
  /**
    * Mount a component and render the output.
    */
  @JSImport("ink", "render")
  @js.native
  val render: RenderFunction = js.native
  
  @JSImport("ink", "useApp")
  @js.native
  def useApp(): typings.ink.appContextMod.Props = js.native
  
  /**
    * Component that uses `useFocus` hook becomes "focusable" to Ink,
    * so when user presses <kbd>Tab</kbd>, Ink will switch focus to this component.
    * If there are multiple components that execute `useFocus` hook, focus will be
    * given to them in the order that these components are rendered in.
    * This hook returns an object with `isFocused` boolean property, which
    * determines if this component is focused or not.
    */
  @JSImport("ink", "useFocus")
  @js.native
  def useFocus(): typings.ink.useFocusMod.Output = js.native
  @JSImport("ink", "useFocus")
  @js.native
  def useFocus(hasIsActiveAutoFocus: Input): typings.ink.useFocusMod.Output = js.native
  
  /**
    * This hook exposes methods to enable or disable focus management for all
    * components or manually switch focus to next or previous components.
    */
  @JSImport("ink", "useFocusManager")
  @js.native
  def useFocusManager(): typings.ink.useFocusManagerMod.Output = js.native
  
  /**
    * This hook is used for handling user input.
    * It's a more convienient alternative to using `StdinContext` and listening to `data` events.
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
  @JSImport("ink", "useInput")
  @js.native
  def useInput(inputHandler: Handler): Unit = js.native
  @JSImport("ink", "useInput")
  @js.native
  def useInput(inputHandler: Handler, options: Options): Unit = js.native
  
  @JSImport("ink", "useStderr")
  @js.native
  def useStderr(): typings.ink.stderrContextMod.Props = js.native
  
  @JSImport("ink", "useStdin")
  @js.native
  def useStdin(): typings.ink.stdinContextMod.Props = js.native
  
  @JSImport("ink", "useStdout")
  @js.native
  def useStdout(): typings.ink.stdoutContextMod.Props = js.native
}
