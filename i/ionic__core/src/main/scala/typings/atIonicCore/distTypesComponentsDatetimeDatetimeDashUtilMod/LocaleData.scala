package typings.atIonicCore.distTypesComponentsDatetimeDatetimeDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var dayNames: js.UndefOr[js.Array[String]] = js.undefined
  var dayShortNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
  var monthShortNames: js.UndefOr[js.Array[String]] = js.undefined
}

object LocaleData {
  @scala.inline
  def apply(
    dayNames: js.Array[String] = null,
    dayShortNames: js.Array[String] = null,
    monthNames: js.Array[String] = null,
    monthShortNames: js.Array[String] = null
  ): LocaleData = {
    val __obj = js.Dynamic.literal()
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayShortNames != null) __obj.updateDynamic("dayShortNames")(dayShortNames.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthShortNames != null) __obj.updateDynamic("monthShortNames")(monthShortNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData]
  }
}

