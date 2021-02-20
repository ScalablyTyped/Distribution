package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingMessageDescriptorHtml
  extends SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  
  var html: String = js.native
}
object SavingMessageDescriptorHtml {
  
  @scala.inline
  def apply(html: String): SavingMessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorHtml]
  }
  
  @scala.inline
  implicit class SavingMessageDescriptorHtmlMutableBuilder[Self <: SavingMessageDescriptorHtml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
