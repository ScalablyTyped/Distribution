package typings.inboxsdk.inboxsdkMod.Global

import typings.inboxsdk.inboxsdkMod.Conversations.ContentPanelDescriptor
import typings.inboxsdk.inboxsdkMod.Conversations.ContentPanelView
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

