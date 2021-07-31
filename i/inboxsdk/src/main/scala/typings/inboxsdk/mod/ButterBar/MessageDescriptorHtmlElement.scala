package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageDescriptorHtmlElement
  extends StObject
     with MessageDescriptorBase
     with MessageDescriptor {
  
  var el: HTMLElement
}
object MessageDescriptorHtmlElement {
  
  @scala.inline
  def apply(el: HTMLElement): MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorHtmlElement]
  }
  
  @scala.inline
  implicit class MessageDescriptorHtmlElementMutableBuilder[Self <: MessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
