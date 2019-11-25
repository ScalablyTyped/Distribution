package typings.atIonicCore.distTypesComponentsDatetimeDatetimeDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeChangeEventDetail extends js.Object {
  var value: js.UndefOr[String | Null] = js.undefined
}

object DatetimeChangeEventDetail {
  @scala.inline
  def apply(value: String = null): DatetimeChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeChangeEventDetail]
  }
}

