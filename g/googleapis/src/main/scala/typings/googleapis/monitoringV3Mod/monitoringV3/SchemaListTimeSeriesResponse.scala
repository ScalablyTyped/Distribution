package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTimeSeriesResponse extends StObject {
  
  /**
    * Query execution errors that may have caused the time series data returned to be incomplete.
    */
  var executionErrors: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more time series that match the filter included in the request.
    */
  var timeSeries: js.UndefOr[js.Array[SchemaTimeSeries]] = js.undefined
  
  /**
    * The unit in which all time_series point values are reported. unit follows the UCUM format for units as seen in https://unitsofmeasure.org/ucum.html. If different time_series have different units (for example, because they come from different metric types, or a unit is absent), then unit will be "{not_a_unit\}".
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaListTimeSeriesResponse {
  
  inline def apply(): SchemaListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTimeSeriesResponse]
  }
  
  extension [Self <: SchemaListTimeSeriesResponse](x: Self) {
    
    inline def setExecutionErrors(value: js.Array[SchemaStatus]): Self = StObject.set(x, "executionErrors", value.asInstanceOf[js.Any])
    
    inline def setExecutionErrorsUndefined: Self = StObject.set(x, "executionErrors", js.undefined)
    
    inline def setExecutionErrorsVarargs(value: SchemaStatus*): Self = StObject.set(x, "executionErrors", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTimeSeries(value: js.Array[SchemaTimeSeries]): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesUndefined: Self = StObject.set(x, "timeSeries", js.undefined)
    
    inline def setTimeSeriesVarargs(value: SchemaTimeSeries*): Self = StObject.set(x, "timeSeries", js.Array(value*))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
