package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorInfo extends StObject {
  
  var errorMessages: js.UndefOr[js.Array[ErrorMessage]] = js.native
}
object ErrorInfo {
  
  @scala.inline
  def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  @scala.inline
  implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessages(value: js.Array[ErrorMessage]): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    @scala.inline
    def setErrorMessagesVarargs(value: ErrorMessage*): Self = StObject.set(x, "errorMessages", js.Array(value :_*))
  }
}
