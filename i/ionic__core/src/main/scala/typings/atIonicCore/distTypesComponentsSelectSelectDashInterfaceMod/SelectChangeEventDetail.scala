package typings.atIonicCore.distTypesComponentsSelectSelectDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChangeEventDetail extends js.Object {
  var value: js.UndefOr[js.Any | js.Array[_] | Null] = js.undefined
}

object SelectChangeEventDetail {
  @scala.inline
  def apply(value: js.Any | js.Array[_] = null): SelectChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEventDetail]
  }
}

