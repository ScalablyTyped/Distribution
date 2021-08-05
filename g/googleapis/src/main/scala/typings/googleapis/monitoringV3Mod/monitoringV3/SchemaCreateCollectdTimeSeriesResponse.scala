package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateCollectdTimeSeries response.
  */
trait SchemaCreateCollectdTimeSeriesResponse extends StObject {
  
  /**
    * Records the error status for points that were not written due to an
    * error.Failed requests for which nothing is written will return an error
    * response instead.
    */
  var payloadErrors: js.UndefOr[js.Array[SchemaCollectdPayloadError]] = js.undefined
}
object SchemaCreateCollectdTimeSeriesResponse {
  
  inline def apply(): SchemaCreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesResponse]
  }
  
  extension [Self <: SchemaCreateCollectdTimeSeriesResponse](x: Self) {
    
    inline def setPayloadErrors(value: js.Array[SchemaCollectdPayloadError]): Self = StObject.set(x, "payloadErrors", value.asInstanceOf[js.Any])
    
    inline def setPayloadErrorsUndefined: Self = StObject.set(x, "payloadErrors", js.undefined)
    
    inline def setPayloadErrorsVarargs(value: SchemaCollectdPayloadError*): Self = StObject.set(x, "payloadErrors", js.Array(value :_*))
  }
}
