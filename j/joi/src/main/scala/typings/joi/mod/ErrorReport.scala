package typings.joi.mod

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorReport
  extends StObject
     with Error {
  
  var code: String
  
  var flags: Record[String, ExtensionFlag]
  
  var local: Any
  
  var messages: LanguageMessages
  
  var path: js.Array[String]
  
  var prefs: ErrorValidationOptions
  
  var state: State
  
  var value: Any
}
object ErrorReport {
  
  inline def apply(
    code: String,
    flags: Record[String, ExtensionFlag],
    local: Any,
    message: String,
    messages: LanguageMessages,
    name: String,
    path: js.Array[String],
    prefs: ErrorValidationOptions,
    state: State,
    value: Any
  ): ErrorReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefs = prefs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorReport] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Record[String, ExtensionFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Any): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: LanguageMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setPrefs(value: ErrorValidationOptions): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
