package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectdValueError extends StObject {
  
  /**
    * Records the error status for the value.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The zero-based index in CollectdPayload.values within the parent CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCollectdValueError {
  
  inline def apply(): SchemaCollectdValueError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdValueError]
  }
  
  extension [Self <: SchemaCollectdValueError](x: Self) {
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
