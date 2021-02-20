package typings.inboxsdk.mod

import typings.inboxsdk.mod.ButterBar.ButterBarInstance
import typings.inboxsdk.mod.Compose.ComposeInstance
import typings.inboxsdk.mod.Conversations.ConversationsInstance
import typings.inboxsdk.mod.Global.GlobalInstance
import typings.inboxsdk.mod.Keyboard.KeyboardInstance
import typings.inboxsdk.mod.Lists.ListsInstance
import typings.inboxsdk.mod.NavMenu.NavMenuInstance
import typings.inboxsdk.mod.Router.RouterInstance
import typings.inboxsdk.mod.Search.SearchInstance
import typings.inboxsdk.mod.Toolbars.ToolbarsInstance
import typings.inboxsdk.mod.User.UserInstance
import typings.inboxsdk.mod.Widgets.WidgetsInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InboxSDKInstance extends StObject {
  
  var ButterBar: ButterBarInstance = js.native
  
  var Compose: ComposeInstance = js.native
  
  var Conversations: ConversationsInstance = js.native
  
  var Global: GlobalInstance = js.native
  
  var Keyboard: KeyboardInstance = js.native
  
  var Lists: ListsInstance = js.native
  
  var NavMenu: NavMenuInstance = js.native
  
  var Router: RouterInstance = js.native
  
  var Search: SearchInstance = js.native
  
  var Toolbars: ToolbarsInstance = js.native
  
  var User: UserInstance = js.native
  
  var Widgets: WidgetsInstance = js.native
}
object InboxSDKInstance {
  
  @scala.inline
  def apply(
    ButterBar: ButterBarInstance,
    Compose: ComposeInstance,
    Conversations: ConversationsInstance,
    Global: GlobalInstance,
    Keyboard: KeyboardInstance,
    Lists: ListsInstance,
    NavMenu: NavMenuInstance,
    Router: RouterInstance,
    Search: SearchInstance,
    Toolbars: ToolbarsInstance,
    User: UserInstance,
    Widgets: WidgetsInstance
  ): InboxSDKInstance = {
    val __obj = js.Dynamic.literal(ButterBar = ButterBar.asInstanceOf[js.Any], Compose = Compose.asInstanceOf[js.Any], Conversations = Conversations.asInstanceOf[js.Any], Global = Global.asInstanceOf[js.Any], Keyboard = Keyboard.asInstanceOf[js.Any], Lists = Lists.asInstanceOf[js.Any], NavMenu = NavMenu.asInstanceOf[js.Any], Router = Router.asInstanceOf[js.Any], Search = Search.asInstanceOf[js.Any], Toolbars = Toolbars.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Widgets = Widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboxSDKInstance]
  }
  
  @scala.inline
  implicit class InboxSDKInstanceMutableBuilder[Self <: InboxSDKInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButterBar(value: ButterBarInstance): Self = StObject.set(x, "ButterBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompose(value: ComposeInstance): Self = StObject.set(x, "Compose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversations(value: ConversationsInstance): Self = StObject.set(x, "Conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: GlobalInstance): Self = StObject.set(x, "Global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: KeyboardInstance): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLists(value: ListsInstance): Self = StObject.set(x, "Lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavMenu(value: NavMenuInstance): Self = StObject.set(x, "NavMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouter(value: RouterInstance): Self = StObject.set(x, "Router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: SearchInstance): Self = StObject.set(x, "Search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbars(value: ToolbarsInstance): Self = StObject.set(x, "Toolbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserInstance): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgets(value: WidgetsInstance): Self = StObject.set(x, "Widgets", value.asInstanceOf[js.Any])
  }
}
