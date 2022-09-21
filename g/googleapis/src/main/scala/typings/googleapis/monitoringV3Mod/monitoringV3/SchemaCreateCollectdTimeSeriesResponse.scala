package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateCollectdTimeSeriesResponse extends StObject {
  
  /**
    * Records the error status for points that were not written due to an error in the request.Failed requests for which nothing is written will return an error response instead. Requests where data points were rejected by the backend will set summary instead.
    */
  var payloadErrors: js.UndefOr[js.Array[SchemaCollectdPayloadError]] = js.undefined
  
  /**
    * Aggregate statistics from writing the payloads. This field is omitted if all points were successfully written, so that the response is empty. This is for backwards compatibility with clients that log errors on any non-empty response.
    */
  var summary: js.UndefOr[SchemaCreateTimeSeriesSummary] = js.undefined
}
object SchemaCreateCollectdTimeSeriesResponse {
  
  inline def apply(): SchemaCreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesResponse]
  }
  
  extension [Self <: SchemaCreateCollectdTimeSeriesResponse](x: Self) {
    
    inline def setPayloadErrors(value: js.Array[SchemaCollectdPayloadError]): Self = StObject.set(x, "payloadErrors", value.asInstanceOf[js.Any])
    
    inline def setPayloadErrorsUndefined: Self = StObject.set(x, "payloadErrors", js.undefined)
    
    inline def setPayloadErrorsVarargs(value: SchemaCollectdPayloadError*): Self = StObject.set(x, "payloadErrors", js.Array(value*))
    
    inline def setSummary(value: SchemaCreateTimeSeriesSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
