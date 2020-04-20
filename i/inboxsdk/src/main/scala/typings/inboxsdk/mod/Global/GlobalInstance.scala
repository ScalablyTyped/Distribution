package typings.inboxsdk.mod.Global

import typings.inboxsdk.mod.Conversations.ContentPanelDescriptor
import typings.inboxsdk.mod.Conversations.ContentPanelView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalInstance extends js.Object {
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): js.Promise[ContentPanelView]
}

object GlobalInstance {
  @scala.inline
  def apply(addSidebarContentPanel: ContentPanelDescriptor => js.Promise[ContentPanelView]): GlobalInstance = {
    val __obj = js.Dynamic.literal(addSidebarContentPanel = js.Any.fromFunction1(addSidebarContentPanel))
    __obj.asInstanceOf[GlobalInstance]
  }
}

