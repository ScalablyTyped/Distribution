package typings
package atIonicCoreLib.distTypesComponentsMenuMenuDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuChangeEventDetail extends js.Object {
  var disabled: scala.Boolean
  var open: scala.Boolean
}

object MenuChangeEventDetail {
  @scala.inline
  def apply(disabled: scala.Boolean, open: scala.Boolean): MenuChangeEventDetail = {
    val __obj = js.Dynamic.literal(disabled = disabled, open = open)
  
    __obj.asInstanceOf[MenuChangeEventDetail]
  }
}

