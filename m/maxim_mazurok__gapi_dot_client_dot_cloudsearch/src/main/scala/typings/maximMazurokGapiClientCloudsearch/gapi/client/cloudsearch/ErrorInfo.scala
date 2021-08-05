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
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setErrorMessages(value: js.Array[ErrorMessage]): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    
    inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
    
    inline def setErrorMessagesVarargs(value: ErrorMessage*): Self = StObject.set(x, "errorMessages", js.Array(value :_*))
  }
}
