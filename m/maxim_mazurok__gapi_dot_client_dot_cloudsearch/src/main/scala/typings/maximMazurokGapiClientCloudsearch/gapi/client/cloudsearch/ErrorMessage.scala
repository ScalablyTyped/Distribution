package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessage extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
}
object ErrorMessage {
  
  @scala.inline
  def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  
  @scala.inline
  implicit class ErrorMessageMutableBuilder[Self <: ErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
