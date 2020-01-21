package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListTimeSeries response.
  */
@js.native
trait SchemaListTimeSeriesResponse extends js.Object {
  /**
    * Query execution errors that may have caused the time series data returned
    * to be incomplete.
    */
  var executionErrors: js.UndefOr[js.Array[SchemaStatus]] = js.native
  /**
    * If there are more results than have been returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * One or more time series that match the filter included in the request.
    */
  var timeSeries: js.UndefOr[js.Array[SchemaTimeSeries]] = js.native
}

object SchemaListTimeSeriesResponse {
  @scala.inline
  def apply(
    executionErrors: js.Array[SchemaStatus] = null,
    nextPageToken: String = null,
    timeSeries: js.Array[SchemaTimeSeries] = null
  ): SchemaListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    if (executionErrors != null) __obj.updateDynamic("executionErrors")(executionErrors.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (timeSeries != null) __obj.updateDynamic("timeSeries")(timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTimeSeriesResponse]
  }
}

