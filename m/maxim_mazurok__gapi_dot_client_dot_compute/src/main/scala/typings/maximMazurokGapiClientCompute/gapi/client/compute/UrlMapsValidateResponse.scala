package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapsValidateResponse extends StObject {
  
  var result: js.UndefOr[UrlMapValidationResult] = js.undefined
}
object UrlMapsValidateResponse {
  
  @scala.inline
  def apply(): UrlMapsValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsValidateResponse]
  }
  
  @scala.inline
  implicit class UrlMapsValidateResponseMutableBuilder[Self <: UrlMapsValidateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: UrlMapValidationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
