package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowAttachmentIconHtmlDescriptor
  extends ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  
  var iconHtml: String = js.native
}
object ThreadRowAttachmentIconHtmlDescriptor {
  
  @scala.inline
  def apply(iconHtml: String): ThreadRowAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconHtmlDescriptor]
  }
  
  @scala.inline
  implicit class ThreadRowAttachmentIconHtmlDescriptorMutableBuilder[Self <: ThreadRowAttachmentIconHtmlDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconHtml(value: String): Self = StObject.set(x, "iconHtml", value.asInstanceOf[js.Any])
  }
}
