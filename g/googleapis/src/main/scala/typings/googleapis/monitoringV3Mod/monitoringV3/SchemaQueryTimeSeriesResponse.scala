package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryTimeSeriesResponse extends StObject {
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Query execution errors that may have caused the time series data returned to be incomplete. The available data will be available in the response.
    */
  var partialErrors: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
  
  /**
    * The time series data.
    */
  var timeSeriesData: js.UndefOr[js.Array[SchemaTimeSeriesData]] = js.undefined
  
  /**
    * The descriptor for the time series data.
    */
  var timeSeriesDescriptor: js.UndefOr[SchemaTimeSeriesDescriptor] = js.undefined
}
object SchemaQueryTimeSeriesResponse {
  
  inline def apply(): SchemaQueryTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTimeSeriesResponse]
  }
  
  extension [Self <: SchemaQueryTimeSeriesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartialErrors(value: js.Array[SchemaStatus]): Self = StObject.set(x, "partialErrors", value.asInstanceOf[js.Any])
    
    inline def setPartialErrorsUndefined: Self = StObject.set(x, "partialErrors", js.undefined)
    
    inline def setPartialErrorsVarargs(value: SchemaStatus*): Self = StObject.set(x, "partialErrors", js.Array(value*))
    
    inline def setTimeSeriesData(value: js.Array[SchemaTimeSeriesData]): Self = StObject.set(x, "timeSeriesData", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesDataUndefined: Self = StObject.set(x, "timeSeriesData", js.undefined)
    
    inline def setTimeSeriesDataVarargs(value: SchemaTimeSeriesData*): Self = StObject.set(x, "timeSeriesData", js.Array(value*))
    
    inline def setTimeSeriesDescriptor(value: SchemaTimeSeriesDescriptor): Self = StObject.set(x, "timeSeriesDescriptor", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesDescriptorUndefined: Self = StObject.set(x, "timeSeriesDescriptor", js.undefined)
  }
}
