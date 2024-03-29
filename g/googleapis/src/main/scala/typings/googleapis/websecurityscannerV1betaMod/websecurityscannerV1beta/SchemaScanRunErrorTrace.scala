package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScanRunErrorTrace extends StObject {
  
  /**
    * Indicates the error reason code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has encountered too many NOT_FOUND responses.
    */
  var mostCommonHttpErrorCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan run.
    */
  var scanConfigError: js.UndefOr[SchemaScanConfigError] = js.undefined
}
object SchemaScanRunErrorTrace {
  
  inline def apply(): SchemaScanRunErrorTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanRunErrorTrace]
  }
  
  extension [Self <: SchemaScanRunErrorTrace](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMostCommonHttpErrorCode(value: Double): Self = StObject.set(x, "mostCommonHttpErrorCode", value.asInstanceOf[js.Any])
    
    inline def setMostCommonHttpErrorCodeNull: Self = StObject.set(x, "mostCommonHttpErrorCode", null)
    
    inline def setMostCommonHttpErrorCodeUndefined: Self = StObject.set(x, "mostCommonHttpErrorCode", js.undefined)
    
    inline def setScanConfigError(value: SchemaScanConfigError): Self = StObject.set(x, "scanConfigError", value.asInstanceOf[js.Any])
    
    inline def setScanConfigErrorUndefined: Self = StObject.set(x, "scanConfigError", js.undefined)
  }
}
