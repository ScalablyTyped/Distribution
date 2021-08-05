package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptOptions extends StObject {
  
  var messages: js.UndefOr[PromptMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PromptOptions {
  
  inline def apply(): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptOptions]
  }
  
  extension [Self <: PromptOptions](x: Self) {
    
    inline def setMessages(value: PromptMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
