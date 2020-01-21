package typings.ionicCore.checkboxInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxChangeEventDetail extends js.Object {
  var checked: Boolean
  var value: js.Any
}

object CheckboxChangeEventDetail {
  @scala.inline
  def apply(checked: Boolean, value: js.Any): CheckboxChangeEventDetail = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckboxChangeEventDetail]
  }
}

