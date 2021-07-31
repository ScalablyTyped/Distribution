package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NativeListRouteIDs extends StObject
@JSImport("inboxsdk", "Router.NativeListRouteIDs")
@js.native
object NativeListRouteIDs extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NativeListRouteIDs & Double] = js.native
  
  @js.native
  sealed trait ALL_MAIL
    extends StObject
       with NativeListRouteIDs
  /* 1 */ val ALL_MAIL: typings.inboxsdk.mod.Router.NativeListRouteIDs.ALL_MAIL & Double = js.native
  
  @js.native
  sealed trait ANY_LIST
    extends StObject
       with NativeListRouteIDs
  /* 13 */ val ANY_LIST: typings.inboxsdk.mod.Router.NativeListRouteIDs.ANY_LIST & Double = js.native
  
  @js.native
  sealed trait DONE
    extends StObject
       with NativeListRouteIDs
  /* 6 */ val DONE: typings.inboxsdk.mod.Router.NativeListRouteIDs.DONE & Double = js.native
  
  @js.native
  sealed trait DRAFTS
    extends StObject
       with NativeListRouteIDs
  /* 4 */ val DRAFTS: typings.inboxsdk.mod.Router.NativeListRouteIDs.DRAFTS & Double = js.native
  
  @js.native
  sealed trait IMPORTANT
    extends StObject
       with NativeListRouteIDs
  /* 11 */ val IMPORTANT: typings.inboxsdk.mod.Router.NativeListRouteIDs.IMPORTANT & Double = js.native
  
  @js.native
  sealed trait INBOX
    extends StObject
       with NativeListRouteIDs
  /* 0 */ val INBOX: typings.inboxsdk.mod.Router.NativeListRouteIDs.INBOX & Double = js.native
  
  @js.native
  sealed trait LABEL
    extends StObject
       with NativeListRouteIDs
  /* 8 */ val LABEL: typings.inboxsdk.mod.Router.NativeListRouteIDs.LABEL & Double = js.native
  
  @js.native
  sealed trait REMINDERS
    extends StObject
       with NativeListRouteIDs
  /* 7 */ val REMINDERS: typings.inboxsdk.mod.Router.NativeListRouteIDs.REMINDERS & Double = js.native
  
  @js.native
  sealed trait SEARCH
    extends StObject
       with NativeListRouteIDs
  /* 12 */ val SEARCH: typings.inboxsdk.mod.Router.NativeListRouteIDs.SEARCH & Double = js.native
  
  @js.native
  sealed trait SENT
    extends StObject
       with NativeListRouteIDs
  /* 2 */ val SENT: typings.inboxsdk.mod.Router.NativeListRouteIDs.SENT & Double = js.native
  
  @js.native
  sealed trait SNOOZED
    extends StObject
       with NativeListRouteIDs
  /* 5 */ val SNOOZED: typings.inboxsdk.mod.Router.NativeListRouteIDs.SNOOZED & Double = js.native
  
  @js.native
  sealed trait SPAM
    extends StObject
       with NativeListRouteIDs
  /* 10 */ val SPAM: typings.inboxsdk.mod.Router.NativeListRouteIDs.SPAM & Double = js.native
  
  @js.native
  sealed trait STARRED
    extends StObject
       with NativeListRouteIDs
  /* 3 */ val STARRED: typings.inboxsdk.mod.Router.NativeListRouteIDs.STARRED & Double = js.native
  
  @js.native
  sealed trait TRASH
    extends StObject
       with NativeListRouteIDs
  /* 9 */ val TRASH: typings.inboxsdk.mod.Router.NativeListRouteIDs.TRASH & Double = js.native
}
