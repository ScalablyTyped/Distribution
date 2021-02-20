package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NativeListRouteIDs extends StObject
@JSImport("inboxsdk", "Router.NativeListRouteIDs")
@js.native
object NativeListRouteIDs extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NativeListRouteIDs with Double] = js.native
  
  @js.native
  sealed trait ALL_MAIL extends NativeListRouteIDs
  /* 1 */ val ALL_MAIL: typings.inboxsdk.mod.Router.NativeListRouteIDs.ALL_MAIL with Double = js.native
  
  @js.native
  sealed trait ANY_LIST extends NativeListRouteIDs
  /* 13 */ val ANY_LIST: typings.inboxsdk.mod.Router.NativeListRouteIDs.ANY_LIST with Double = js.native
  
  @js.native
  sealed trait DONE extends NativeListRouteIDs
  /* 6 */ val DONE: typings.inboxsdk.mod.Router.NativeListRouteIDs.DONE with Double = js.native
  
  @js.native
  sealed trait DRAFTS extends NativeListRouteIDs
  /* 4 */ val DRAFTS: typings.inboxsdk.mod.Router.NativeListRouteIDs.DRAFTS with Double = js.native
  
  @js.native
  sealed trait IMPORTANT extends NativeListRouteIDs
  /* 11 */ val IMPORTANT: typings.inboxsdk.mod.Router.NativeListRouteIDs.IMPORTANT with Double = js.native
  
  @js.native
  sealed trait INBOX extends NativeListRouteIDs
  /* 0 */ val INBOX: typings.inboxsdk.mod.Router.NativeListRouteIDs.INBOX with Double = js.native
  
  @js.native
  sealed trait LABEL extends NativeListRouteIDs
  /* 8 */ val LABEL: typings.inboxsdk.mod.Router.NativeListRouteIDs.LABEL with Double = js.native
  
  @js.native
  sealed trait REMINDERS extends NativeListRouteIDs
  /* 7 */ val REMINDERS: typings.inboxsdk.mod.Router.NativeListRouteIDs.REMINDERS with Double = js.native
  
  @js.native
  sealed trait SEARCH extends NativeListRouteIDs
  /* 12 */ val SEARCH: typings.inboxsdk.mod.Router.NativeListRouteIDs.SEARCH with Double = js.native
  
  @js.native
  sealed trait SENT extends NativeListRouteIDs
  /* 2 */ val SENT: typings.inboxsdk.mod.Router.NativeListRouteIDs.SENT with Double = js.native
  
  @js.native
  sealed trait SNOOZED extends NativeListRouteIDs
  /* 5 */ val SNOOZED: typings.inboxsdk.mod.Router.NativeListRouteIDs.SNOOZED with Double = js.native
  
  @js.native
  sealed trait SPAM extends NativeListRouteIDs
  /* 10 */ val SPAM: typings.inboxsdk.mod.Router.NativeListRouteIDs.SPAM with Double = js.native
  
  @js.native
  sealed trait STARRED extends NativeListRouteIDs
  /* 3 */ val STARRED: typings.inboxsdk.mod.Router.NativeListRouteIDs.STARRED with Double = js.native
  
  @js.native
  sealed trait TRASH extends NativeListRouteIDs
  /* 9 */ val TRASH: typings.inboxsdk.mod.Router.NativeListRouteIDs.TRASH with Double = js.native
}
