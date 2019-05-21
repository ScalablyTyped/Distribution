package typings
package atIonicCoreLib.distTypesComponentsDatetimeDatetimeDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeChangeEventDetail extends js.Object {
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object DatetimeChangeEventDetail {
  @scala.inline
  def apply(value: java.lang.String = null): DatetimeChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DatetimeChangeEventDetail]
  }
}

