package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttachmentIconUrlDescriptor
  extends StObject
     with MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  
  var iconUrl: String
}
object MessageAttachmentIconUrlDescriptor {
  
  inline def apply(iconUrl: String, tooltip: String | HTMLElement): MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconUrlDescriptor]
  }
  
  extension [Self <: MessageAttachmentIconUrlDescriptor](x: Self) {
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
  }
}
