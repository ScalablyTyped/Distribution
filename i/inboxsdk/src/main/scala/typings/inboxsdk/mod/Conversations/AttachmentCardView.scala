package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentCardView extends StObject {
  
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def getAttachmentType(): String = js.native
  
  /**
    * @deprecated. Use AttachmentCardClickEvent.getDownloadURL() instead
    */
  def getDownloadURL(): js.Promise[String] = js.native
  
  def getMessageView(): MessageView | Null = js.native
  
  def getTitle(): String = js.native
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
}
object AttachmentCardView {
  
  @scala.inline
  def apply(
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
  implicit class AttachmentCardViewMutableBuilder[Self <: AttachmentCardView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddButton(value: CustomButtonDescriptor => Unit): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAttachmentType(value: () => String): Self = StObject.set(x, "getAttachmentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDownloadURL(value: () => js.Promise[String]): Self = StObject.set(x, "getDownloadURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMessageView(value: () => MessageView | Null): Self = StObject.set(x, "getMessageView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
