package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingMessageDescriptorHtml
  extends LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  
  var html: String = js.native
}
object LoadingMessageDescriptorHtml {
  
  @scala.inline
  def apply(html: String): LoadingMessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorHtml]
  }
  
  @scala.inline
  implicit class LoadingMessageDescriptorHtmlMutableBuilder[Self <: LoadingMessageDescriptorHtml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
