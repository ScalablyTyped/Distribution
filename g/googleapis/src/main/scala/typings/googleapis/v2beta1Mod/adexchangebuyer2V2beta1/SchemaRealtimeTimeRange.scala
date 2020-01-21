package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An open-ended realtime time range specified by the start timestamp. For
  * filter sets that specify a realtime time range RTB metrics continue to be
  * aggregated throughout the lifetime of the filter set.
  */
@js.native
trait SchemaRealtimeTimeRange extends js.Object {
  /**
    * The start timestamp of the real-time RTB metrics aggregation.
    */
  var startTimestamp: js.UndefOr[String] = js.native
}

object SchemaRealtimeTimeRange {
  @scala.inline
  def apply(startTimestamp: String = null): SchemaRealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRealtimeTimeRange]
  }
}

