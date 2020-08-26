package typings.ink.useFocusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink/build/hooks/use-focus", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Component that uses `useFocus` hook becomes "focusable" to Ink,
    * so when user presses <kbd>Tab</kbd>, Ink will switch focus to this component.
    * If there are multiple components that execute `useFocus` hook, focus will be
    * given to them in the order that these components are rendered in.
    * This hook returns an object with `isFocused` boolean property, which
    * determines if this component is focused or not.
    */
  def apply(): Output = js.native
  def apply(hasIsActiveAutoFocus: Input): Output = js.native
}

