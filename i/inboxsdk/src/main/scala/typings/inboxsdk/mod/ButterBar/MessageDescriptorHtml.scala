package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageDescriptorHtml
  extends MessageDescriptorBase
     with MessageDescriptor {
  
  var html: String = js.native
}
object MessageDescriptorHtml {
  
  @scala.inline
  def apply(html: String): MessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorHtml]
  }
  
  @scala.inline
  implicit class MessageDescriptorHtmlMutableBuilder[Self <: MessageDescriptorHtml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
