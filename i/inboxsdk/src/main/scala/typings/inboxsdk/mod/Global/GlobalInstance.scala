package typings.inboxsdk.mod.Global

import typings.inboxsdk.mod.Conversations.ContentPanelDescriptor
import typings.inboxsdk.mod.Conversations.ContentPanelView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalInstance extends js.Object {
  
  def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): js.Promise[ContentPanelView] = js.native
}
object GlobalInstance {
  
  @scala.inline
  def apply(addSidebarContentPanel: ContentPanelDescriptor => js.Promise[ContentPanelView]): GlobalInstance = {
    val __obj = js.Dynamic.literal(addSidebarContentPanel = js.Any.fromFunction1(addSidebarContentPanel))
    __obj.asInstanceOf[GlobalInstance]
  }
  
  @scala.inline
  implicit class GlobalInstanceOps[Self <: GlobalInstance] (val x: Self) extends AnyVal {
    
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
    def setAddSidebarContentPanel(value: ContentPanelDescriptor => js.Promise[ContentPanelView]): Self = this.set("addSidebarContentPanel", js.Any.fromFunction1(value))
  }
}
