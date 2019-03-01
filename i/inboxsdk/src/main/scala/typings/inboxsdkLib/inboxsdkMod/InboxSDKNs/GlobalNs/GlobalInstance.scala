package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalInstance extends js.Object {
  def addSidebarContentPanel(contentPanelDescriptor: inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.ContentPanelDescriptor): inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.ContentPanelView
}

object GlobalInstance {
  @scala.inline
  def apply(
    addSidebarContentPanel: js.Function1[
      inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.ContentPanelDescriptor, 
      inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.ContentPanelView
    ]
  ): GlobalInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSidebarContentPanel")(addSidebarContentPanel)
    __obj.asInstanceOf[GlobalInstance]
  }
}

