package typings.inboxsdk.inboxsdkMod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NativeListRouteIDs extends js.Object

@JSImport("inboxsdk", "Router.NativeListRouteIDs")
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
  
  /* 1 */ val ALL_MAIL: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.ALL_MAIL with Double = js.native
  /* 13 */ val ANY_LIST: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.ANY_LIST with Double = js.native
  /* 6 */ val DONE: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.DONE with Double = js.native
  /* 4 */ val DRAFTS: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.DRAFTS with Double = js.native
  /* 11 */ val IMPORTANT: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.IMPORTANT with Double = js.native
  /* 0 */ val INBOX: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.INBOX with Double = js.native
  /* 8 */ val LABEL: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.LABEL with Double = js.native
  /* 7 */ val REMINDERS: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.REMINDERS with Double = js.native
  /* 12 */ val SEARCH: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SEARCH with Double = js.native
  /* 2 */ val SENT: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SENT with Double = js.native
  /* 5 */ val SNOOZED: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SNOOZED with Double = js.native
  /* 10 */ val SPAM: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SPAM with Double = js.native
  /* 3 */ val STARRED: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.STARRED with Double = js.native
  /* 9 */ val TRASH: typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.TRASH with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NativeListRouteIDs with Double] = js.native
}

