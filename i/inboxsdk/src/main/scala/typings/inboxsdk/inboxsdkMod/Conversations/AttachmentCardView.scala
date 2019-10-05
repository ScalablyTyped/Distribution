package typings.inboxsdk.inboxsdkMod.Conversations

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardView extends js.Object {
  var destroyed: Boolean
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit
  def getAttachmentType(): String
  /**
    * @deprecated. Use AttachmentCardClickEvent.getDownloadURL() instead
    */
  def getDownloadURL(): js.Promise[String]
  def getMessageView(): MessageView | Null
  def getTitle(): String
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
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
    on_destroy: (destroy, js.Function0[Unit]) => Unit
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroyed = destroyed, getAttachmentType = js.Any.fromFunction0(getAttachmentType), getDownloadURL = js.Any.fromFunction0(getDownloadURL), getMessageView = js.Any.fromFunction0(getMessageView), getTitle = js.Any.fromFunction0(getTitle))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[AttachmentCardView]
  }
}

