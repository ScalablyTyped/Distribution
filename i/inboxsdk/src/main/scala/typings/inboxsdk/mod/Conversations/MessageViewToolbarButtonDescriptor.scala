package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.MORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageViewToolbarButtonDescriptor extends StObject {
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var iconUrl: String
  
  def onClick(): Unit
  
  var orderHint: Double
  
  var section: MORE
  
  var title: String
}
object MessageViewToolbarButtonDescriptor {
  
  @scala.inline
  def apply(iconUrl: String, onClick: () => Unit, orderHint: Double, title: String): MessageViewToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), orderHint = orderHint.asInstanceOf[js.Any], section = "MORE", title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewToolbarButtonDescriptor]
  }
  
  @scala.inline
  implicit class MessageViewToolbarButtonDescriptorMutableBuilder[Self <: MessageViewToolbarButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: MORE): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
