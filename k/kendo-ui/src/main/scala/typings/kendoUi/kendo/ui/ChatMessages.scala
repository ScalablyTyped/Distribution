package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessages extends StObject {
  
  var messageListLabel: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var sendButton: js.UndefOr[String] = js.undefined
  
  var toggleButton: js.UndefOr[String] = js.undefined
}
object ChatMessages {
  
  inline def apply(): ChatMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessages]
  }
  
  extension [Self <: ChatMessages](x: Self) {
    
    inline def setMessageListLabel(value: String): Self = StObject.set(x, "messageListLabel", value.asInstanceOf[js.Any])
    
    inline def setMessageListLabelUndefined: Self = StObject.set(x, "messageListLabel", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSendButton(value: String): Self = StObject.set(x, "sendButton", value.asInstanceOf[js.Any])
    
    inline def setSendButtonUndefined: Self = StObject.set(x, "sendButton", js.undefined)
    
    inline def setToggleButton(value: String): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
    
    inline def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
  }
}
