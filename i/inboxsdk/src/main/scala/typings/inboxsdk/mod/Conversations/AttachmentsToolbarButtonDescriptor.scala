package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsToolbarButtonDescriptor extends StObject {
  
  var iconUrl: String
  
  def onClick(event: AttachmentsToolbarButtonEvent): Unit
  
  var tooltip: String
}
object AttachmentsToolbarButtonDescriptor {
  
  inline def apply(iconUrl: String, onClick: AttachmentsToolbarButtonEvent => Unit, tooltip: String): AttachmentsToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsToolbarButtonDescriptor]
  }
  
  extension [Self <: AttachmentsToolbarButtonDescriptor](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: AttachmentsToolbarButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
