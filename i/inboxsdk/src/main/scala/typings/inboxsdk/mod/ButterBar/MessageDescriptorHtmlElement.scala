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
  
  inline def apply(el: HTMLElement): MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorHtmlElement]
  }
  
  extension [Self <: MessageDescriptorHtmlElement](x: Self) {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
