package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapsValidateResponse extends StObject {
  
  var result: js.UndefOr[UrlMapValidationResult] = js.undefined
}
object UrlMapsValidateResponse {
  
  inline def apply(): UrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsValidateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlMapsValidateResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: UrlMapValidationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
