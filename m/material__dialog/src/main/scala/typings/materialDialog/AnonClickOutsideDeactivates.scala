package typings.materialDialog

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClickOutsideDeactivates extends js.Object {
  var clickOutsideDeactivates: Boolean
  var initialFocus: Element
}

object AnonClickOutsideDeactivates {
  @scala.inline
  def apply(clickOutsideDeactivates: Boolean, initialFocus: Element): AnonClickOutsideDeactivates = {
    val __obj = js.Dynamic.literal(clickOutsideDeactivates = clickOutsideDeactivates.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClickOutsideDeactivates]
  }
}

