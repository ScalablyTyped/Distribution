package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarningParam extends StObject {
  
  var code: Double
  
  var message: String
  
  var sourceError: js.Object | Null
  
  var `type`: warning
}
object WarningParam {
  
  inline def apply(code: Double, message: String): WarningParam = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sourceError = null)
    __obj.updateDynamic("type")("warning")
    __obj.asInstanceOf[WarningParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarningParam] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSourceError(value: js.Object): Self = StObject.set(x, "sourceError", value.asInstanceOf[js.Any])
    
    inline def setSourceErrorNull: Self = StObject.set(x, "sourceError", null)
    
    inline def setType(value: warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
