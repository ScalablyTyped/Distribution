package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketByActivity extends js.Object {
  /**
    * The default activity stream will be used if a specific
    * activityDataSourceId is not specified.
    */
  var activityDataSourceId: js.UndefOr[String] = js.native
  /**
    * Specifies that only activity segments of duration longer than
    * minDurationMillis are considered and used as a container for aggregated
    * data.
    */
  var minDurationMillis: js.UndefOr[String] = js.native
}

object SchemaBucketByActivity {
  @scala.inline
  def apply(activityDataSourceId: String = null, minDurationMillis: String = null): SchemaBucketByActivity = {
    val __obj = js.Dynamic.literal()
    if (activityDataSourceId != null) __obj.updateDynamic("activityDataSourceId")(activityDataSourceId.asInstanceOf[js.Any])
    if (minDurationMillis != null) __obj.updateDynamic("minDurationMillis")(minDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketByActivity]
  }
}

