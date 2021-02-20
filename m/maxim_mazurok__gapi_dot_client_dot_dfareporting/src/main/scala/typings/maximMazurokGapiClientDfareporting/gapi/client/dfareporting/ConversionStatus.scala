package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionStatus extends StObject {
  
  /** The original conversion that was inserted or updated. */
  var conversion: js.UndefOr[Conversion] = js.native
  
  /** A list of errors related to this conversion. */
  var errors: js.UndefOr[js.Array[ConversionError]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionStatus". */
  var kind: js.UndefOr[String] = js.native
}
object ConversionStatus {
  
  @scala.inline
  def apply(): ConversionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionStatus]
  }
  
  @scala.inline
  implicit class ConversionStatusMutableBuilder[Self <: ConversionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversion(value: Conversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[ConversionError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ConversionError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
