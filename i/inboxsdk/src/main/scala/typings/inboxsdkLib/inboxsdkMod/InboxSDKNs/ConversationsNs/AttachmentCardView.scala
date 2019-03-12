package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardView extends js.Object {
  var destroyed: scala.Boolean
  def addButton(buttonDescriptor: CustomButtonDescriptor): scala.Unit
  def getAttachmentType(): java.lang.String
  /**
    * @deprecated. Use AttachmentCardClickEvent.getDownloadURL() instead
    */
  def getDownloadURL(): js.Promise[java.lang.String]
  def getMessageView(): MessageView | scala.Null
  def getTitle(): java.lang.String
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
}

object AttachmentCardView {
  @scala.inline
  def apply(
    addButton: CustomButtonDescriptor => scala.Unit,
    destroyed: scala.Boolean,
    getAttachmentType: () => java.lang.String,
    getDownloadURL: () => js.Promise[java.lang.String],
    getMessageView: () => MessageView | scala.Null,
    getTitle: () => java.lang.String,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton), destroyed = destroyed, getAttachmentType = js.Any.fromFunction0(getAttachmentType), getDownloadURL = js.Any.fromFunction0(getDownloadURL), getMessageView = js.Any.fromFunction0(getMessageView), getTitle = js.Any.fromFunction0(getTitle))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[AttachmentCardView]
  }
}

