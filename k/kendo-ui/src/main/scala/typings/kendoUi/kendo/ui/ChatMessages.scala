package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessages extends StObject {
  
  var placeholder: js.UndefOr[String] = js.native
  
  var sendButton: js.UndefOr[String] = js.native
  
  var toggleButton: js.UndefOr[String] = js.native
}
object ChatMessages {
  
  @scala.inline
  def apply(): ChatMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessages]
  }
  
  @scala.inline
  implicit class ChatMessagesMutableBuilder[Self <: ChatMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSendButton(value: String): Self = StObject.set(x, "sendButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendButtonUndefined: Self = StObject.set(x, "sendButton", js.undefined)
    
    @scala.inline
    def setToggleButton(value: String): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
  }
}
