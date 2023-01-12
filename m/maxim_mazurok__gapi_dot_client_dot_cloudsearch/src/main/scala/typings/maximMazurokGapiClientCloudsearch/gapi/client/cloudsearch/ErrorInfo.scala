package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  var errorMessages: js.UndefOr[js.Array[ErrorMessage]] = js.undefined
}
object ErrorInfo {
  
  inline def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    
    inline def setErrorMessages(value: js.Array[ErrorMessage]): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    inline def setErrorMessagesVarargs(value: ErrorMessage*): Self = StObject.set(x, "errorMessages", js.Array(value*))
  }
}
