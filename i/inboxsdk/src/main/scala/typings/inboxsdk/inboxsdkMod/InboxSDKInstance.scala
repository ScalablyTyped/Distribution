package typings.inboxsdk.inboxsdkMod

import typings.inboxsdk.inboxsdkMod.ButterBarNs.ButterBarInstance
import typings.inboxsdk.inboxsdkMod.ComposeNs.ComposeInstance
import typings.inboxsdk.inboxsdkMod.ConversationsNs.ConversationsInstance
import typings.inboxsdk.inboxsdkMod.GlobalNs.GlobalInstance
import typings.inboxsdk.inboxsdkMod.KeyboardNs.KeyboardInstance
import typings.inboxsdk.inboxsdkMod.ListsNs.ListsInstance
import typings.inboxsdk.inboxsdkMod.NavMenuNs.NavMenuInstance
import typings.inboxsdk.inboxsdkMod.RouterNs.RouterInstance
import typings.inboxsdk.inboxsdkMod.SearchNs.SearchInstance
import typings.inboxsdk.inboxsdkMod.ToolbarsNs.ToolbarsInstance
import typings.inboxsdk.inboxsdkMod.UserNs.UserInstance
import typings.inboxsdk.inboxsdkMod.WidgetsNs.WidgetsInstance
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
    val __obj = js.Dynamic.literal(ButterBar = ButterBar, Compose = Compose, Conversations = Conversations, Global = Global, Keyboard = Keyboard, Lists = Lists, NavMenu = NavMenu, Router = Router, Search = Search, Toolbars = Toolbars, User = User, Widgets = Widgets)
  
    __obj.asInstanceOf[InboxSDKInstance]
  }
}

