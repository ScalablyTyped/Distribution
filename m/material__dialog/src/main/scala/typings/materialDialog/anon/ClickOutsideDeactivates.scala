package typings.materialDialog.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickOutsideDeactivates extends js.Object {
  var clickOutsideDeactivates: Boolean
  var initialFocus: Element
}

object ClickOutsideDeactivates {
  @scala.inline
  def apply(clickOutsideDeactivates: Boolean, initialFocus: Element): ClickOutsideDeactivates = {
    val __obj = js.Dynamic.literal(clickOutsideDeactivates = clickOutsideDeactivates.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickOutsideDeactivates]
  }
}

