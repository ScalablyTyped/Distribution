package typings.ionicCore.toggleInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleChangeEventDetail extends js.Object {
  var checked: Boolean
  var value: js.Any
}

object ToggleChangeEventDetail {
  @scala.inline
  def apply(checked: Boolean, value: js.Any): ToggleChangeEventDetail = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleChangeEventDetail]
  }
}

