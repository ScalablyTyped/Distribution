package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCardView extends js.Object {
  var destroyed: Boolean = js.native
  def addButton(buttonDescriptor: CustomButtonDescriptor): Unit = js.native
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
  implicit class AttachmentCardViewOps[Self <: AttachmentCardView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddButton(value: CustomButtonDescriptor => Unit): Self = this.set("addButton", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAttachmentType(value: () => String): Self = this.set("getAttachmentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDownloadURL(value: () => js.Promise[String]): Self = this.set("getDownloadURL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMessageView(value: () => MessageView | Null): Self = this.set("getMessageView", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}

