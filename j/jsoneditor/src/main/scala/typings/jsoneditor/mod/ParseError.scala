package typings.jsoneditor.mod

import typings.jsoneditor.jsoneditorStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseError extends StObject {
  
  var line: Double
  
  var message: String
  
  var `type`: error
}
object ParseError {
  
  @scala.inline
  def apply(line: Double, message: String): ParseError = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
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
