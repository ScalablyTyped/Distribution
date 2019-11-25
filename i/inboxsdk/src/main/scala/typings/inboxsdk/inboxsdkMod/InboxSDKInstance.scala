package typings.inboxsdk.inboxsdkMod

import typings.inboxsdk.inboxsdkMod.ButterBar.ButterBarInstance
import typings.inboxsdk.inboxsdkMod.Compose.ComposeInstance
import typings.inboxsdk.inboxsdkMod.Conversations.ConversationsInstance
import typings.inboxsdk.inboxsdkMod.Global.GlobalInstance
import typings.inboxsdk.inboxsdkMod.Keyboard.KeyboardInstance
import typings.inboxsdk.inboxsdkMod.Lists.ListsInstance
import typings.inboxsdk.inboxsdkMod.NavMenu.NavMenuInstance
import typings.inboxsdk.inboxsdkMod.Router.RouterInstance
import typings.inboxsdk.inboxsdkMod.Search.SearchInstance
import typings.inboxsdk.inboxsdkMod.Toolbars.ToolbarsInstance
import typings.inboxsdk.inboxsdkMod.User.UserInstance
import typings.inboxsdk.inboxsdkMod.Widgets.WidgetsInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboxSDKInstance extends js.Object {
  var ButterBar: ButterBarInstance
  var Compose: ComposeInstance
  var Conversations: ConversationsInstance
  var Global: GlobalInstance
  var Keyboard: KeyboardInstance
  var Lists: ListsInstance
  var NavMenu: NavMenuInstance
  var Router: RouterInstance
  var Search: SearchInstance
  var Toolbars: ToolbarsInstance
  var User: UserInstance
  var Widgets: WidgetsInstance
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
}

