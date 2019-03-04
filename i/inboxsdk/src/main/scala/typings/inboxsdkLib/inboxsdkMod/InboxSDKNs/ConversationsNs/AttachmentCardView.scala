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
    addButton: js.Function1[CustomButtonDescriptor, scala.Unit],
    destroyed: scala.Boolean,
    getAttachmentType: js.Function0[java.lang.String],
    getDownloadURL: js.Function0[js.Promise[java.lang.String]],
    getMessageView: js.Function0[MessageView | scala.Null],
    getTitle: js.Function0[java.lang.String],
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit]
  ): AttachmentCardView = {
    val __obj = js.Dynamic.literal(addButton = addButton, destroyed = destroyed, getAttachmentType = getAttachmentType, getDownloadURL = getDownloadURL, getMessageView = getMessageView, getTitle = getTitle)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[AttachmentCardView]
  }
}

