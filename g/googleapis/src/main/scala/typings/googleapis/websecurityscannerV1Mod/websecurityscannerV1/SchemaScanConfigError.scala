package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScanConfigError extends StObject {
  
  /**
    * Output only. Indicates the reason code for a configuration failure.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates the full name of the ScanConfig field that triggers this error, for example "scan_config.max_qps". This field is provided for troubleshooting purposes only and its actual value can change in the future.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
}
object SchemaScanConfigError {
  
  inline def apply(): SchemaScanConfigError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanConfigError]
  }
  
  extension [Self <: SchemaScanConfigError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
  }
}
