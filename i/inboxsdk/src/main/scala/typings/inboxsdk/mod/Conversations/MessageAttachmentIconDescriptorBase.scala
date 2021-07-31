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
  
  @scala.inline
  def apply(tooltip: String | HTMLElement): MessageAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconDescriptorBase]
  }
  
  @scala.inline
  implicit class MessageAttachmentIconDescriptorBaseMutableBuilder[Self <: MessageAttachmentIconDescriptorBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTooltip(value: String | HTMLElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
