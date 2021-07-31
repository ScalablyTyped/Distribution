package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomButtonDescriptor extends StObject {
  
  var iconUrl: String
  
  def onClick(event: AttachmentCardClickEvent): Unit
  
  var tooltip: String
}
object CustomButtonDescriptor {
  
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentCardClickEvent => Unit, tooltip: String): CustomButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomButtonDescriptor]
  }
  
  @scala.inline
  implicit class CustomButtonDescriptorMutableBuilder[Self <: CustomButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: AttachmentCardClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
