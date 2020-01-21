package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketBySession extends js.Object {
  /**
    * Specifies that only sessions of duration longer than minDurationMillis
    * are considered and used as a container for aggregated data.
    */
  var minDurationMillis: js.UndefOr[String] = js.native
}

object SchemaBucketBySession {
  @scala.inline
  def apply(minDurationMillis: String = null): SchemaBucketBySession = {
    val __obj = js.Dynamic.literal()
    if (minDurationMillis != null) __obj.updateDynamic("minDurationMillis")(minDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketBySession]
  }
}

