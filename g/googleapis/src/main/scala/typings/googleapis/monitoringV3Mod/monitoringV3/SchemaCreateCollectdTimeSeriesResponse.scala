package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateCollectdTimeSeries response.
  */
@js.native
trait SchemaCreateCollectdTimeSeriesResponse extends js.Object {
  /**
    * Records the error status for points that were not written due to an
    * error.Failed requests for which nothing is written will return an error
    * response instead.
    */
  var payloadErrors: js.UndefOr[js.Array[SchemaCollectdPayloadError]] = js.native
}

object SchemaCreateCollectdTimeSeriesResponse {
  @scala.inline
  def apply(payloadErrors: js.Array[SchemaCollectdPayloadError] = null): SchemaCreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (payloadErrors != null) __obj.updateDynamic("payloadErrors")(payloadErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesResponse]
  }
}

