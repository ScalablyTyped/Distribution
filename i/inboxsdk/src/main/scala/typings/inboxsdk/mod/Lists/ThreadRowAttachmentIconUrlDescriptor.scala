package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowAttachmentIconUrlDescriptor
  extends StObject
     with ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var iconUrl: String
}
object ThreadRowAttachmentIconUrlDescriptor {
  
  @scala.inline
  def apply(iconUrl: String): ThreadRowAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconUrlDescriptor]
  }
  
  @scala.inline
  implicit class ThreadRowAttachmentIconUrlDescriptorMutableBuilder[Self <: ThreadRowAttachmentIconUrlDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
  }
}
