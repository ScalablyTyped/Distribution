package typings.materialDom.focusTrapMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom/focus-trap", "FocusTrap")
@js.native
class FocusTrap protected () extends js.Object {
  def this(root: HTMLElement) = this()
  def this(root: HTMLElement, options: FocusOptions) = this()
  /**
    * Releases focus from `root`. Also restores focus to the previously focused
    * element.
    */
  def releaseFocus(): Unit = js.native
  /**
    * Traps focus in `root`. Also focuses on either `initialFocusEl` if set;
    * otherwises sets initial focus to the first focusable child element.
    */
  def trapFocus(): Unit = js.native
}

