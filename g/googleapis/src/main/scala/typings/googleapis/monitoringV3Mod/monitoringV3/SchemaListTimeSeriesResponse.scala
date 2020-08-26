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
  def apply(): SchemaListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTimeSeriesResponse]
  }
  @scala.inline
  implicit class SchemaListTimeSeriesResponseOps[Self <: SchemaListTimeSeriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecutionErrorsVarargs(value: SchemaStatus*): Self = this.set("executionErrors", js.Array(value :_*))
    @scala.inline
    def setExecutionErrors(value: js.Array[SchemaStatus]): Self = this.set("executionErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionErrors: Self = this.set("executionErrors", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTimeSeriesVarargs(value: SchemaTimeSeries*): Self = this.set("timeSeries", js.Array(value :_*))
    @scala.inline
    def setTimeSeries(value: js.Array[SchemaTimeSeries]): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSeries: Self = this.set("timeSeries", js.undefined)
  }
  
}

