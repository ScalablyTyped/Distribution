package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCardView extends StObject {
  
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit
  
  var destroyed: Boolean
  
  def getAttachmentType(): String
  
  /**
    * @deprecated Use AttachmentCardClickEvent.getDownloadURL() instead
    */
  def getDownloadURL(): js.Promise[String]
  
  def getMessageView(): MessageView | Null
  
  def getTitle(): String
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}
object AttachmentCardView {
  
  inline def apply(
    addButton: CustomButtonDescriptor => Unit,
    destroyed: Boolean,
    getAttachmentType: () => String,
    getDownloadURL: () => js.Promise[String],
    getMessageView: () => MessageView | Null,
    getTitle: () => String,
    on: (destroy, js.Function0[Unit]) => Unit
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroyed = destroyed.asInstanceOf[js.Any], getAttachmentType = js.Any.fromFunction0(getAttachmentType), getDownloadURL = js.Any.fromFunction0(getDownloadURL), getMessageView = js.Any.fromFunction0(getMessageView), getTitle = js.Any.fromFunction0(getTitle), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[AttachmentCardView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentCardView] (val x: Self) extends AnyVal {
    
    inline def setAddButton(value: CustomButtonDescriptor => Unit): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setGetAttachmentType(value: () => String): Self = StObject.set(x, "getAttachmentType", js.Any.fromFunction0(value))
    
    inline def setGetDownloadURL(value: () => js.Promise[String]): Self = StObject.set(x, "getDownloadURL", js.Any.fromFunction0(value))
    
    inline def setGetMessageView(value: () => MessageView | Null): Self = StObject.set(x, "getMessageView", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
