package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorParam extends StObject {
  
  var code: Double
  
  var message: String
  
  var sourceError: js.Object | Null
  
  var `type`: error
}
object ErrorParam {
  
  inline def apply(code: Double, message: String): ErrorParam = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sourceError = null)
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[ErrorParam]
  }
  
  extension [Self <: ErrorParam](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSourceError(value: js.Object): Self = StObject.set(x, "sourceError", value.asInstanceOf[js.Any])
    
    inline def setSourceErrorNull: Self = StObject.set(x, "sourceError", null)
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
