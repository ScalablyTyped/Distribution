package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingMessageDescriptorHtmlElement
  extends StObject
     with LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  
  var el: HTMLElement
}
object LoadingMessageDescriptorHtmlElement {
  
  @scala.inline
  def apply(el: HTMLElement): LoadingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorHtmlElement]
  }
  
  @scala.inline
  implicit class LoadingMessageDescriptorHtmlElementMutableBuilder[Self <: LoadingMessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
