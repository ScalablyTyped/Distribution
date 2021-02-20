package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsToolbarButtonDescriptor extends StObject {
  
  var iconUrl: String = js.native
  
  def onClick(event: AttachmentsToolbarButtonEvent): Unit = js.native
  
  var tooltip: String = js.native
}
object AttachmentsToolbarButtonDescriptor {
  
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentsToolbarButtonEvent => Unit, tooltip: String): AttachmentsToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsToolbarButtonDescriptor]
  }
  
  @scala.inline
  implicit class AttachmentsToolbarButtonDescriptorMutableBuilder[Self <: AttachmentsToolbarButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: AttachmentsToolbarButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
