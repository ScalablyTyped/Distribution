package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowAttachmentIconHtmlDescriptor
  extends StObject
     with ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  
  var iconHtml: String
}
object ThreadRowAttachmentIconHtmlDescriptor {
  
  inline def apply(iconHtml: String): ThreadRowAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconHtmlDescriptor]
  }
  
  extension [Self <: ThreadRowAttachmentIconHtmlDescriptor](x: Self) {
    
    inline def setIconHtml(value: String): Self = StObject.set(x, "iconHtml", value.asInstanceOf[js.Any])
  }
}
