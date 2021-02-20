package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseError extends StObject {
  
  var line: Double = js.native
  
  var message: String = js.native
  
  var `type`: error = js.native
}
object ParseError {
  
  @scala.inline
  def apply(line: Double, message: String, `type`: error): ParseError = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseError]
  }
  
  @scala.inline
  implicit class ParseErrorMutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
