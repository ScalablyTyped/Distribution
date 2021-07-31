package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenderMessageMessage extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ChatRenderMessageMessage {
  
  @scala.inline
  def apply(): ChatRenderMessageMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderMessageMessage]
  }
  
  @scala.inline
  implicit class ChatRenderMessageMessageMutableBuilder[Self <: ChatRenderMessageMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
