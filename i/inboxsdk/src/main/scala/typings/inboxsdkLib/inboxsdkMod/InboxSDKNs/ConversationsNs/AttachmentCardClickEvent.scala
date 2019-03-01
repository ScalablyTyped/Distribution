package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardClickEvent extends js.Object {
  def getDownloadURL(): js.Promise[java.lang.String]
}

object AttachmentCardClickEvent {
  @scala.inline
  def apply(getDownloadURL: js.Function0[js.Promise[java.lang.String]]): AttachmentCardClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDownloadURL")(getDownloadURL)
    __obj.asInstanceOf[AttachmentCardClickEvent]
  }
}

