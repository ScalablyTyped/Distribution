package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketByTime extends js.Object {
  /**
    * Specifies that result buckets aggregate data by exactly durationMillis
    * time frames. Time frames that contain no data will be included in the
    * response with an empty dataset.
    */
  var durationMillis: js.UndefOr[String] = js.native
  var period: js.UndefOr[SchemaBucketByTimePeriod] = js.native
}

object SchemaBucketByTime {
  @scala.inline
  def apply(durationMillis: String = null, period: SchemaBucketByTimePeriod = null): SchemaBucketByTime = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketByTime]
  }
}

