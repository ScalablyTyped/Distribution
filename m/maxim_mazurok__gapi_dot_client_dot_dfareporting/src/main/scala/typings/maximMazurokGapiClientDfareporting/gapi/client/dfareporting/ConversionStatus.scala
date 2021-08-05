package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionStatus extends StObject {
  
  /** The original conversion that was inserted or updated. */
  var conversion: js.UndefOr[Conversion] = js.undefined
  
  /** A list of errors related to this conversion. */
  var errors: js.UndefOr[js.Array[ConversionError]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionStatus". */
  var kind: js.UndefOr[String] = js.undefined
}
object ConversionStatus {
  
  inline def apply(): ConversionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionStatus]
  }
  
  extension [Self <: ConversionStatus](x: Self) {
    
    inline def setConversion(value: Conversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    inline def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    inline def setErrors(value: js.Array[ConversionError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ConversionError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
