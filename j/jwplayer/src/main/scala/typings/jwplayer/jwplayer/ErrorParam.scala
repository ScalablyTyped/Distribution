package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorParam extends StObject {
  
  var code: Double = js.native
  
  var message: String = js.native
  
  var sourceError: js.Object | Null = js.native
  
  var `type`: error = js.native
}
object ErrorParam {
  
  @scala.inline
  def apply(code: Double, message: String, `type`: error): ErrorParam = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParam]
  }
  
  @scala.inline
  implicit class ErrorParamMutableBuilder[Self <: ErrorParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceError(value: js.Object): Self = StObject.set(x, "sourceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceErrorNull: Self = StObject.set(x, "sourceError", null)
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
