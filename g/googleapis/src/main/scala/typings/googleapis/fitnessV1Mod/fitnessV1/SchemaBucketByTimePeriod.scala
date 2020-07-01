package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketByTimePeriod extends js.Object {
  /**
    * org.joda.timezone.DateTimeZone
    */
  var timeZoneId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SchemaBucketByTimePeriod {
  @scala.inline
  def apply(timeZoneId: String = null, `type`: String = null, value: js.UndefOr[Double] = js.undefined): SchemaBucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    if (timeZoneId != null) __obj.updateDynamic("timeZoneId")(timeZoneId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketByTimePeriod]
  }
}

