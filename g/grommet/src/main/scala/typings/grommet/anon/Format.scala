package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  def format(args: Any*): Unit
  
  var messages: js.UndefOr[FileInput] = js.undefined
}
object Format {
  
  inline def apply(format: /* repeated */ Any => Unit): Format = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: /* repeated */ Any => Unit): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setMessages(value: FileInput): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
  }
}
