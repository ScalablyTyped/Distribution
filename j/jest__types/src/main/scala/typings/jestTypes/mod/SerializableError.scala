package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializableError extends StObject {
  
  var code: js.UndefOr[Any] = js.undefined
  
  var message: String
  
  var stack: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SerializableError {
  
  inline def apply(message: String): SerializableError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializableError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackNull: Self = StObject.set(x, "stack", null)
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
