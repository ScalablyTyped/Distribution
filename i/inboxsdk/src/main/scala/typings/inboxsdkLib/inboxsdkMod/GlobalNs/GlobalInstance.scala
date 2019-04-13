package typings
package inboxsdkLib.inboxsdkMod.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalInstance extends js.Object {
  def addSidebarContentPanel(contentPanelDescriptor: inboxsdkLib.inboxsdkMod.ConversationsNs.ContentPanelDescriptor): inboxsdkLib.inboxsdkMod.ConversationsNs.ContentPanelView
}

object GlobalInstance {
  @scala.inline
  def apply(
    addSidebarContentPanel: inboxsdkLib.inboxsdkMod.ConversationsNs.ContentPanelDescriptor => inboxsdkLib.inboxsdkMod.ConversationsNs.ContentPanelView
  ): GlobalInstance = {
    val __obj = js.Dynamic.literal(addSidebarContentPanel = js.Any.fromFunction1(addSidebarContentPanel))
  
    __obj.asInstanceOf[GlobalInstance]
  }
}

