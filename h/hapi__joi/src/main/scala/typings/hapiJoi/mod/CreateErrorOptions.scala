package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateErrorOptions extends StObject {
  
  var flags: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[LanguageMessages] = js.undefined
}
object CreateErrorOptions {
  
  inline def apply(): CreateErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setMessages(value: LanguageMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
  }
}
