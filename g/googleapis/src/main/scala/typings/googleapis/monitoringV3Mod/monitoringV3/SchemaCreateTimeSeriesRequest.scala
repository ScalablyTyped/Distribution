package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateTimeSeries request.
  */
trait SchemaCreateTimeSeriesRequest extends StObject {
  
  /**
    * The new data to be added to a list of time series. Adds at most one data
    * point to each of several time series. The new data point must be more
    * recent than any other point in its time series. Each TimeSeries value
    * must fully specify a unique time series by supplying all label values for
    * the metric and the monitored resource.The maximum number of TimeSeries
    * objects per Create request is 200.
    */
  var timeSeries: js.UndefOr[js.Array[SchemaTimeSeries]] = js.undefined
}
object SchemaCreateTimeSeriesRequest {
  
  inline def apply(): SchemaCreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTimeSeriesRequest]
  }
  
  extension [Self <: SchemaCreateTimeSeriesRequest](x: Self) {
    
    inline def setTimeSeries(value: js.Array[SchemaTimeSeries]): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
    
    inline def setTimeSeriesVarargs(value: SchemaTimeSeries*): Self = StObject.set(x, "timeSeries", js.Array(value :_*))
  }
}
