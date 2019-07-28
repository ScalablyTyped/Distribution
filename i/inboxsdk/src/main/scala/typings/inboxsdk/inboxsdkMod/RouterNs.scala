package typings.inboxsdk.inboxsdkMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.inboxsdk.inboxsdkMod.CommonNs.DropdownView
import typings.inboxsdk.inboxsdkMod.ListsNs.LabelDescriptor
import typings.inboxsdk.inboxsdkMod.RouterNs.CollapsibleSectionView
import typings.inboxsdk.inboxsdkMod.RouterNs.CustomListDescriptor
import typings.inboxsdk.inboxsdkMod.RouterNs.CustomRouteView
import typings.inboxsdk.inboxsdkMod.RouterNs.ListRouteView
import typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs
import typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs
import typings.inboxsdk.inboxsdkMod.RouterNs.RouteParams
import typings.inboxsdk.inboxsdkMod.RouterNs.RouteTypes
import typings.inboxsdk.inboxsdkMod.RouterNs.RouteView
import typings.inboxsdk.inboxsdkMod.RouterNs.RowDescriptor
import typings.inboxsdk.inboxsdkMod.RouterNs.SectionDescriptor
import typings.inboxsdk.inboxsdkMod.RouterNs.SectionDropdownClickEvent
import typings.inboxsdk.inboxsdkMod.RouterNs.SectionView
import typings.inboxsdk.inboxsdkMod.RouterNs.ThreadDescriptor
import typings.inboxsdk.inboxsdkStrings.collapsed
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.expanded
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inboxsdk", "Router")
@js.native
object RouterNs extends js.Object {
  @js.native
  trait CollapsibleSectionView extends SectionView {
    @JSName("on")
    def on_collapsed(name: collapsed, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_expanded(name: expanded, cb: js.Function0[Unit]): Unit = js.native
    def setCollapsed(value: Boolean): Unit = js.native
  }
  
  trait CustomListDescriptor extends js.Object {
    var hasMore: js.UndefOr[Boolean] = js.undefined
    var threads: js.Array[ThreadDescriptor | String]
    var total: js.UndefOr[Double] = js.undefined
  }
  
  trait CustomRouteView extends RouteView {
    def getElement(): HTMLElement
    def setFullWidth(fullWidth: Boolean): Unit
  }
  
  trait ListRouteView extends RouteView {
    def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
    // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
    def addSection(options: SectionDescriptor): SectionView
    // addSection(options: Stream<SectionDescriptor>): SectionView;
    def refresh(): Unit
  }
  
  @js.native
  sealed trait NativeListRouteIDs extends js.Object
  
  @js.native
  sealed trait NativeRouteIDs extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.inboxsdk.inboxsdkStrings.LIST
    - typings.inboxsdk.inboxsdkStrings.THREAD
    - typings.inboxsdk.inboxsdkStrings.SETTINGS
    - typings.inboxsdk.inboxsdkStrings.CHAT
    - typings.inboxsdk.inboxsdkStrings.CUSTOM
    - typings.inboxsdk.inboxsdkStrings.UNKNOWN
  */
  trait RouteTypes extends js.Object
  
  trait RouteView extends js.Object {
    var destroyed: Boolean
    def getParams(): RouteParams
    def getRouteID(): String
    def getRouteType(): RouteTypes
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  }
  
  @js.native
  trait RouterInstance extends js.Object {
    var NativeListRouteIDs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NativeListRouteIDs */ js.Any = js.native
    var NativeRouteIDs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NativeRouteIDs */ js.Any = js.native
    def createLink(routeID: String, params: RouteParams): String = js.native
    def createLink(routeID: NativeRouteIDs, params: RouteParams): String = js.native
    def getCurrentRouteView(): RouteView = js.native
    def goto(routeID: String, params: RouteParams): Unit = js.native
    def goto(routeID: NativeRouteIDs, params: RouteParams): Unit = js.native
    def handleAllRoutes(handler: js.Function1[/* routeView */ RouteView, Unit]): js.Function0[Unit] = js.native
    def handleCustomListRoute(
      routeID: String,
      handler: js.Function2[
          /* offset */ Double, 
          /* max */ Double, 
          CustomListDescriptor | js.Promise[CustomListDescriptor]
        ]
    ): js.Function0[Unit] = js.native
    def handleCustomRoute(routeID: String, handler: js.Function1[/* customRouteView */ CustomRouteView, Unit]): js.Function0[Unit] = js.native
    def handleListRoute(routeID: NativeListRouteIDs, handler: js.Function1[/* listRouteView */ ListRouteView, Unit]): js.Function0[Unit] = js.native
  }
  
  trait RowDescriptor extends js.Object {
    var body: String
    var iconClass: js.UndefOr[String] = js.undefined
    var iconHtml: js.UndefOr[String] = js.undefined
    var iconUrl: js.UndefOr[String] = js.undefined
    var isRead: String
    var labels: js.Array[LabelDescriptor]
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    var routeID: js.UndefOr[String] = js.undefined
    var routeParams: js.UndefOr[js.Array[String]] = js.undefined
    var shortDetailText: String
    var title: String
  }
  
  trait SectionDescriptor extends js.Object {
    var contentElement: js.UndefOr[HTMLElement] = js.undefined
    var footerLinkText: js.UndefOr[String] = js.undefined
    var hasDropdown: js.UndefOr[Boolean] = js.undefined
    var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, Unit]] = js.undefined
    var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    var onTitleLinkClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    var subtitle: js.UndefOr[String] = js.undefined
    var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.undefined
    var title: String
    var titleLinkText: js.UndefOr[String] = js.undefined
  }
  
  trait SectionDropdownClickEvent extends js.Object {
    var dropdown: DropdownView
  }
  
  trait SectionView extends js.Object {
    var destroyed: Boolean
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
    def remove(): Unit
  }
  
  trait ThreadDescriptor extends js.Object {
    var gmailThreadId: js.UndefOr[String] = js.undefined
    var rfcMessageId: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  object NativeListRouteIDs extends js.Object {
    @js.native
    sealed trait ALL_MAIL extends NativeListRouteIDs
    
    @js.native
    sealed trait ANY_LIST extends NativeListRouteIDs
    
    @js.native
    sealed trait DONE extends NativeListRouteIDs
    
    @js.native
    sealed trait DRAFTS extends NativeListRouteIDs
    
    @js.native
    sealed trait IMPORTANT extends NativeListRouteIDs
    
    @js.native
    sealed trait INBOX extends NativeListRouteIDs
    
    @js.native
    sealed trait LABEL extends NativeListRouteIDs
    
    @js.native
    sealed trait REMINDERS extends NativeListRouteIDs
    
    @js.native
    sealed trait SEARCH extends NativeListRouteIDs
    
    @js.native
    sealed trait SENT extends NativeListRouteIDs
    
    @js.native
    sealed trait SNOOZED extends NativeListRouteIDs
    
    @js.native
    sealed trait SPAM extends NativeListRouteIDs
    
    @js.native
    sealed trait STARRED extends NativeListRouteIDs
    
    @js.native
    sealed trait TRASH extends NativeListRouteIDs
    
    /* 1 */ val ALL_MAIL: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.ALL_MAIL with Double = js.native
    /* 13 */ val ANY_LIST: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.ANY_LIST with Double = js.native
    /* 6 */ val DONE: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.DONE with Double = js.native
    /* 4 */ val DRAFTS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.DRAFTS with Double = js.native
    /* 11 */ val IMPORTANT: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.IMPORTANT with Double = js.native
    /* 0 */ val INBOX: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.INBOX with Double = js.native
    /* 8 */ val LABEL: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.LABEL with Double = js.native
    /* 7 */ val REMINDERS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.REMINDERS with Double = js.native
    /* 12 */ val SEARCH: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.SEARCH with Double = js.native
    /* 2 */ val SENT: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.SENT with Double = js.native
    /* 5 */ val SNOOZED: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.SNOOZED with Double = js.native
    /* 10 */ val SPAM: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.SPAM with Double = js.native
    /* 3 */ val STARRED: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.STARRED with Double = js.native
    /* 9 */ val TRASH: typings.inboxsdk.inboxsdkMod.RouterNs.NativeListRouteIDs.TRASH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NativeListRouteIDs with Double] = js.native
  }
  
  @js.native
  object NativeRouteIDs extends js.Object {
    @js.native
    sealed trait ALL_MAIL extends NativeRouteIDs
    
    @js.native
    sealed trait ANY_LIST extends NativeRouteIDs
    
    @js.native
    sealed trait CHAT extends NativeRouteIDs
    
    @js.native
    sealed trait CHATS extends NativeRouteIDs
    
    @js.native
    sealed trait CONTACT extends NativeRouteIDs
    
    @js.native
    sealed trait CONTACTS extends NativeRouteIDs
    
    @js.native
    sealed trait DONE extends NativeRouteIDs
    
    @js.native
    sealed trait DRAFTS extends NativeRouteIDs
    
    @js.native
    sealed trait IMPORTANT extends NativeRouteIDs
    
    @js.native
    sealed trait INBOX extends NativeRouteIDs
    
    @js.native
    sealed trait LABEL extends NativeRouteIDs
    
    @js.native
    sealed trait REMINDERS extends NativeRouteIDs
    
    @js.native
    sealed trait SEARCH extends NativeRouteIDs
    
    @js.native
    sealed trait SENT extends NativeRouteIDs
    
    @js.native
    sealed trait SETTINGS extends NativeRouteIDs
    
    @js.native
    sealed trait SNOOZED extends NativeRouteIDs
    
    @js.native
    sealed trait SPAM extends NativeRouteIDs
    
    @js.native
    sealed trait STARRED extends NativeRouteIDs
    
    @js.native
    sealed trait THREAD extends NativeRouteIDs
    
    @js.native
    sealed trait TRASH extends NativeRouteIDs
    
    /* 1 */ val ALL_MAIL: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.ALL_MAIL with Double = js.native
    /* 19 */ val ANY_LIST: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.ANY_LIST with Double = js.native
    /* 15 */ val CHAT: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.CHAT with Double = js.native
    /* 14 */ val CHATS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.CHATS with Double = js.native
    /* 17 */ val CONTACT: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.CONTACT with Double = js.native
    /* 16 */ val CONTACTS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.CONTACTS with Double = js.native
    /* 6 */ val DONE: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.DONE with Double = js.native
    /* 4 */ val DRAFTS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.DRAFTS with Double = js.native
    /* 11 */ val IMPORTANT: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.IMPORTANT with Double = js.native
    /* 0 */ val INBOX: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.INBOX with Double = js.native
    /* 8 */ val LABEL: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.LABEL with Double = js.native
    /* 7 */ val REMINDERS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.REMINDERS with Double = js.native
    /* 12 */ val SEARCH: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.SEARCH with Double = js.native
    /* 2 */ val SENT: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.SENT with Double = js.native
    /* 18 */ val SETTINGS: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.SETTINGS with Double = js.native
    /* 5 */ val SNOOZED: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.SNOOZED with Double = js.native
    /* 10 */ val SPAM: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.SPAM with Double = js.native
    /* 3 */ val STARRED: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.STARRED with Double = js.native
    /* 13 */ val THREAD: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.THREAD with Double = js.native
    /* 9 */ val TRASH: typings.inboxsdk.inboxsdkMod.RouterNs.NativeRouteIDs.TRASH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NativeRouteIDs with Double] = js.native
  }
  
  type RouteParams = (StringDictionary[String | Double]) with (NumberDictionary[String | Double])
}

