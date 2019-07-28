package typings.inboxsdk.inboxsdkMod.GlobalNs

import typings.inboxsdk.inboxsdkMod.ConversationsNs.ContentPanelDescriptor
import typings.inboxsdk.inboxsdkMod.ConversationsNs.ContentPanelView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalInstance extends js.Object {
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): ContentPanelView
}

object GlobalInstance {
  @scala.inline
  def apply(addSidebarContentPanel: ContentPanelDescriptor => ContentPanelView): GlobalInstance = {
    val __obj = js.Dynamic.literal(addSidebarContentPanel = js.Any.fromFunction1(addSidebarContentPanel))
  
    __obj.asInstanceOf[GlobalInstance]
  }
}

