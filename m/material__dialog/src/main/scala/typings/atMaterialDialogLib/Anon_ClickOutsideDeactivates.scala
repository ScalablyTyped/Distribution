package typings
package atMaterialDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClickOutsideDeactivates extends js.Object {
  var clickOutsideDeactivates: scala.Boolean
  var initialFocus: stdLib.Element
}

object Anon_ClickOutsideDeactivates {
  @scala.inline
  def apply(clickOutsideDeactivates: scala.Boolean, initialFocus: stdLib.Element): Anon_ClickOutsideDeactivates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clickOutsideDeactivates")(clickOutsideDeactivates)
    __obj.updateDynamic("initialFocus")(initialFocus)
    __obj.asInstanceOf[Anon_ClickOutsideDeactivates]
  }
}

