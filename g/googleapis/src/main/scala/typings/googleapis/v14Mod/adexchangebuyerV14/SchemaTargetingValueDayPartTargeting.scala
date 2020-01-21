package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValueDayPartTargeting extends js.Object {
  var dayParts: js.UndefOr[js.Array[SchemaTargetingValueDayPartTargetingDayPart]] = js.native
  var timeZoneType: js.UndefOr[String] = js.native
}

object SchemaTargetingValueDayPartTargeting {
  @scala.inline
  def apply(
    dayParts: js.Array[SchemaTargetingValueDayPartTargetingDayPart] = null,
    timeZoneType: String = null
  ): SchemaTargetingValueDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    if (dayParts != null) __obj.updateDynamic("dayParts")(dayParts.asInstanceOf[js.Any])
    if (timeZoneType != null) __obj.updateDynamic("timeZoneType")(timeZoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueDayPartTargeting]
  }
}

