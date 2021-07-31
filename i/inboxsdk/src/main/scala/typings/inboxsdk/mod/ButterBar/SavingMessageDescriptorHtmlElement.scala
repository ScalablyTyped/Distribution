package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingMessageDescriptorHtmlElement
  extends StObject
     with SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  
  var el: HTMLElement
}
object SavingMessageDescriptorHtmlElement {
  
  @scala.inline
  def apply(el: HTMLElement): SavingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorHtmlElement]
  }
  
  @scala.inline
  implicit class SavingMessageDescriptorHtmlElementMutableBuilder[Self <: SavingMessageDescriptorHtmlElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
