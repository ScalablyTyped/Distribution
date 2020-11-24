package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateTimeSeries request.
  */
@js.native
trait SchemaCreateTimeSeriesRequest extends js.Object {
  
  /**
    * The new data to be added to a list of time series. Adds at most one data
    * point to each of several time series. The new data point must be more
    * recent than any other point in its time series. Each TimeSeries value
    * must fully specify a unique time series by supplying all label values for
    * the metric and the monitored resource.The maximum number of TimeSeries
    * objects per Create request is 200.
    */
  var timeSeries: js.UndefOr[js.Array[SchemaTimeSeries]] = js.native
}
object SchemaCreateTimeSeriesRequest {
  
  @scala.inline
  def apply(): SchemaCreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTimeSeriesRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateTimeSeriesRequestOps[Self <: SchemaCreateTimeSeriesRequest] (val x: Self) extends AnyVal {
    
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
    def setTimeSeriesVarargs(value: SchemaTimeSeries*): Self = this.set("timeSeries", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeries(value: js.Array[SchemaTimeSeries]): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeries: Self = this.set("timeSeries", js.undefined)
  }
}
