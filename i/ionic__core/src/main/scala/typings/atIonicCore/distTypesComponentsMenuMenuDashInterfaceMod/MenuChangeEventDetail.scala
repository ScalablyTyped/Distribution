package typings.atIonicCore.distTypesComponentsMenuMenuDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuChangeEventDetail extends js.Object {
  var disabled: Boolean
  var open: Boolean
}

object MenuChangeEventDetail {
  @scala.inline
  def apply(disabled: Boolean, open: Boolean): MenuChangeEventDetail = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuChangeEventDetail]
  }
}

