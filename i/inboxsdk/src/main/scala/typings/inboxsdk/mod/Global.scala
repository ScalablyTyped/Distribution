package typings.inboxsdk.mod

import typings.inboxsdk.mod.Conversations.ContentPanelDescriptor
import typings.inboxsdk.mod.Conversations.ContentPanelView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global {
  
  @js.native
  trait GlobalInstance extends StObject {
    
    def addSidebarContentPanel(contentPanelDescriptor: ContentPanelDescriptor): js.Promise[ContentPanelView] = js.native
  }
  object GlobalInstance {
    
    @scala.inline
    def apply(addSidebarContentPanel: ContentPanelDescriptor => js.Promise[ContentPanelView]): GlobalInstance = {
      val __obj = js.Dynamic.literal(addSidebarContentPanel = js.Any.fromFunction1(addSidebarContentPanel))
      __obj.asInstanceOf[GlobalInstance]
    }
    
    @scala.inline
    implicit class GlobalInstanceMutableBuilder[Self <: GlobalInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSidebarContentPanel(value: ContentPanelDescriptor => js.Promise[ContentPanelView]): Self = StObject.set(x, "addSidebarContentPanel", js.Any.fromFunction1(value))
    }
  }
}
