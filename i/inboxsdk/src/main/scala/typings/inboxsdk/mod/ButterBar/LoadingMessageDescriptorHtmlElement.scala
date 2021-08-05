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
  
  inline def apply(el: HTMLElement): LoadingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorHtmlElement]
  }
  
  extension [Self <: LoadingMessageDescriptorHtmlElement](x: Self) {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
