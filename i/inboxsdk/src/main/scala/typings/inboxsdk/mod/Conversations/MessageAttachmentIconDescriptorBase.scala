package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAttachmentIconDescriptorBase extends StObject {
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var tooltip: String | HTMLElement
}
object MessageAttachmentIconDescriptorBase {
  
  inline def apply(tooltip: String | HTMLElement): MessageAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconDescriptorBase]
  }
  
  extension [Self <: MessageAttachmentIconDescriptorBase](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTooltip(value: String | HTMLElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
