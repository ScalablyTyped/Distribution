package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializableError extends StObject {
  
  var code: js.UndefOr[js.Any] = js.native
  
  var message: String = js.native
  
  var stack: js.UndefOr[String | Null] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SerializableError {
  
  @scala.inline
  def apply(message: String): SerializableError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableError]
  }
  
  @scala.inline
  implicit class SerializableErrorMutableBuilder[Self <: SerializableError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: js.Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNull: Self = StObject.set(x, "stack", null)
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
