package typings
package inboxsdkLib.inboxsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inboxsdk", "Router")
@js.native
object RouterNs extends js.Object {
  @js.native
  trait CollapsibleSectionView extends SectionView {
    @JSName("on")
    def on_collapsed(name: inboxsdkLib.inboxsdkLibStrings.collapsed, cb: js.Function0[scala.Unit]): scala.Unit = js.native
    @JSName("on")
    def on_expanded(name: inboxsdkLib.inboxsdkLibStrings.expanded, cb: js.Function0[scala.Unit]): scala.Unit = js.native
    def setCollapsed(value: scala.Boolean): scala.Unit = js.native
  }
  
  trait CustomListDescriptor extends js.Object {
    var hasMore: js.UndefOr[scala.Boolean] = js.undefined
    var threads: js.Array[ThreadDescriptor | java.lang.String]
    var total: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait CustomRouteView extends RouteView {
    def getElement(): stdLib.HTMLElement
    def setFullWidth(fullWidth: scala.Boolean): scala.Unit
  }
  
  trait ListRouteView extends RouteView {
    def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
    // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
    def addSection(options: SectionDescriptor): SectionView
    // addSection(options: Stream<SectionDescriptor>): SectionView;
    def refresh(): scala.Unit
  }
  
  @js.native
  sealed trait NativeListRouteIDs extends js.Object
  
  @js.native
  sealed trait NativeRouteIDs extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - inboxsdkLib.inboxsdkLibStrings.LIST
    - inboxsdkLib.inboxsdkLibStrings.THREAD
    - inboxsdkLib.inboxsdkLibStrings.SETTINGS
    - inboxsdkLib.inboxsdkLibStrings.CHAT
    - inboxsdkLib.inboxsdkLibStrings.CUSTOM
    - inboxsdkLib.inboxsdkLibStrings.UNKNOWN
  */
  trait RouteTypes extends js.Object
  
  trait RouteView extends js.Object {
    var destroyed: scala.Boolean
    def getParams(): RouteParams
    def getRouteID(): java.lang.String
    def getRouteType(): RouteTypes
    @JSName("on")
    def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
  }
  
  @js.native
  trait RouterInstance extends js.Object {
    var NativeListRouteIDs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NativeListRouteIDs */ js.Any = js.native
    var NativeRouteIDs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NativeRouteIDs */ js.Any = js.native
    def createLink(routeID: NativeRouteIDs, params: RouteParams): java.lang.String = js.native
    def createLink(routeID: java.lang.String, params: RouteParams): java.lang.String = js.native
    def getCurrentRouteView(): RouteView = js.native
    def goto(routeID: NativeRouteIDs, params: RouteParams): scala.Unit = js.native
    def goto(routeID: java.lang.String, params: RouteParams): scala.Unit = js.native
    def handleAllRoutes(handler: js.Function1[/* routeView */ RouteView, scala.Unit]): js.Function0[scala.Unit] = js.native
    def handleCustomListRoute(
      routeID: java.lang.String,
      handler: js.Function2[
          /* offset */ scala.Double, 
          /* max */ scala.Double, 
          CustomListDescriptor | js.Promise[CustomListDescriptor]
        ]
    ): js.Function0[scala.Unit] = js.native
    def handleCustomRoute(
      routeID: java.lang.String,
      handler: js.Function1[/* customRouteView */ CustomRouteView, scala.Unit]
    ): js.Function0[scala.Unit] = js.native
    def handleListRoute(routeID: NativeListRouteIDs, handler: js.Function1[/* listRouteView */ ListRouteView, scala.Unit]): js.Function0[scala.Unit] = js.native
  }
  
  trait RowDescriptor extends js.Object {
    var body: java.lang.String
    var iconClass: js.UndefOr[java.lang.String] = js.undefined
    var iconUrl: js.UndefOr[java.lang.String] = js.undefined
    var isRead: java.lang.String
    var labels: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.LabelDescriptor]
    var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var routeID: js.UndefOr[java.lang.String] = js.undefined
    var routeParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var shortDetailText: java.lang.String
    var title: java.lang.String
  }
  
  trait SectionDescriptor extends js.Object {
    var contentElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
    var footerLinkText: js.UndefOr[java.lang.String] = js.undefined
    var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
    var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, scala.Unit]] = js.undefined
    var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
    var onTitleLinkClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    var subtitle: js.UndefOr[java.lang.String] = js.undefined
    var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.undefined
    var title: java.lang.String
    var titleLinkText: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait SectionDropdownClickEvent extends js.Object {
    var dropdown: inboxsdkLib.inboxsdkMod.CommonNs.DropdownView
  }
  
  trait SectionView extends js.Object {
    var destroyed: scala.Boolean
    @JSName("on")
    def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
    def remove(): scala.Unit
  }
  
  trait ThreadDescriptor extends js.Object {
    var gmailThreadId: js.UndefOr[java.lang.String] = js.undefined
    var rfcMessageId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  object NativeListRouteIDs extends js.Object {
    @js.native
    sealed trait ALL_MAIL
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait ANY_LIST
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait DONE
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait DRAFTS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait IMPORTANT
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait INBOX
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait LABEL
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait REMINDERS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait SEARCH
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait SENT
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait SNOOZED
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait SPAM
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait STARRED
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    @js.native
    sealed trait TRASH
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs
    
    /* 1 */ val ALL_MAIL: ALL_MAIL with scala.Double = js.native
    /* 13 */ val ANY_LIST: ANY_LIST with scala.Double = js.native
    /* 6 */ val DONE: DONE with scala.Double = js.native
    /* 4 */ val DRAFTS: DRAFTS with scala.Double = js.native
    /* 11 */ val IMPORTANT: IMPORTANT with scala.Double = js.native
    /* 0 */ val INBOX: INBOX with scala.Double = js.native
    /* 8 */ val LABEL: LABEL with scala.Double = js.native
    /* 7 */ val REMINDERS: REMINDERS with scala.Double = js.native
    /* 12 */ val SEARCH: SEARCH with scala.Double = js.native
    /* 2 */ val SENT: SENT with scala.Double = js.native
    /* 5 */ val SNOOZED: SNOOZED with scala.Double = js.native
    /* 10 */ val SPAM: SPAM with scala.Double = js.native
    /* 3 */ val STARRED: STARRED with scala.Double = js.native
    /* 9 */ val TRASH: TRASH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[inboxsdkLib.inboxsdkMod.RouterNs.NativeListRouteIDs with scala.Double] = js.native
  }
  
  @js.native
  object NativeRouteIDs extends js.Object {
    @js.native
    sealed trait ALL_MAIL
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait ANY_LIST
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait CHAT
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait CHATS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait CONTACT
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait CONTACTS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait DONE
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait DRAFTS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait IMPORTANT
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait INBOX
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait LABEL
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait REMINDERS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait SEARCH
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait SENT
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait SETTINGS
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait SNOOZED
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait SPAM
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait STARRED
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait THREAD
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    @js.native
    sealed trait TRASH
      extends inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs
    
    /* 1 */ val ALL_MAIL: ALL_MAIL with scala.Double = js.native
    /* 19 */ val ANY_LIST: ANY_LIST with scala.Double = js.native
    /* 15 */ val CHAT: CHAT with scala.Double = js.native
    /* 14 */ val CHATS: CHATS with scala.Double = js.native
    /* 17 */ val CONTACT: CONTACT with scala.Double = js.native
    /* 16 */ val CONTACTS: CONTACTS with scala.Double = js.native
    /* 6 */ val DONE: DONE with scala.Double = js.native
    /* 4 */ val DRAFTS: DRAFTS with scala.Double = js.native
    /* 11 */ val IMPORTANT: IMPORTANT with scala.Double = js.native
    /* 0 */ val INBOX: INBOX with scala.Double = js.native
    /* 8 */ val LABEL: LABEL with scala.Double = js.native
    /* 7 */ val REMINDERS: REMINDERS with scala.Double = js.native
    /* 12 */ val SEARCH: SEARCH with scala.Double = js.native
    /* 2 */ val SENT: SENT with scala.Double = js.native
    /* 18 */ val SETTINGS: SETTINGS with scala.Double = js.native
    /* 5 */ val SNOOZED: SNOOZED with scala.Double = js.native
    /* 10 */ val SPAM: SPAM with scala.Double = js.native
    /* 3 */ val STARRED: STARRED with scala.Double = js.native
    /* 13 */ val THREAD: THREAD with scala.Double = js.native
    /* 9 */ val TRASH: TRASH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[inboxsdkLib.inboxsdkMod.RouterNs.NativeRouteIDs with scala.Double] = js.native
  }
  
  type RouteParams = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) with (org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double])
}

