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
  def getDownloadURL(): stdLib.Promise[java.lang.String]
  def getMessageView(): MessageView | scala.Null
  def getTitle(): java.lang.String
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
}

