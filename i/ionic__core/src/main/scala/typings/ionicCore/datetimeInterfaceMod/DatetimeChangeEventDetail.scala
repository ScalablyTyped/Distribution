package typings.ionicCore.datetimeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeChangeEventDetail extends js.Object {
  var value: js.UndefOr[String | Null] = js.undefined
}

object DatetimeChangeEventDetail {
  @scala.inline
  def apply(value: js.UndefOr[Null | String] = js.undefined): DatetimeChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeChangeEventDetail]
  }
}

