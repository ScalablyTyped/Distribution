package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NativeListRouteIDs extends js.Object
@JSImport("inboxsdk", "Router.NativeListRouteIDs")
@js.native
object NativeListRouteIDs extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NativeListRouteIDs with Double] = js.native
  
  @js.native
  sealed trait ALL_MAIL extends NativeListRouteIDs
  /* 1 */ @js.native
  object ALL_MAIL extends TopLevel[ALL_MAIL with Double]
  
  @js.native
  sealed trait ANY_LIST extends NativeListRouteIDs
  /* 13 */ @js.native
  object ANY_LIST extends TopLevel[ANY_LIST with Double]
  
  @js.native
  sealed trait DONE extends NativeListRouteIDs
  /* 6 */ @js.native
  object DONE extends TopLevel[DONE with Double]
  
  @js.native
  sealed trait DRAFTS extends NativeListRouteIDs
  /* 4 */ @js.native
  object DRAFTS extends TopLevel[DRAFTS with Double]
  
  @js.native
  sealed trait IMPORTANT extends NativeListRouteIDs
  /* 11 */ @js.native
  object IMPORTANT extends TopLevel[IMPORTANT with Double]
  
  @js.native
  sealed trait INBOX extends NativeListRouteIDs
  /* 0 */ @js.native
  object INBOX extends TopLevel[INBOX with Double]
  
  @js.native
  sealed trait LABEL extends NativeListRouteIDs
  /* 8 */ @js.native
  object LABEL extends TopLevel[LABEL with Double]
  
  @js.native
  sealed trait REMINDERS extends NativeListRouteIDs
  /* 7 */ @js.native
  object REMINDERS extends TopLevel[REMINDERS with Double]
  
  @js.native
  sealed trait SEARCH extends NativeListRouteIDs
  /* 12 */ @js.native
  object SEARCH extends TopLevel[SEARCH with Double]
  
  @js.native
  sealed trait SENT extends NativeListRouteIDs
  /* 2 */ @js.native
  object SENT extends TopLevel[SENT with Double]
  
  @js.native
  sealed trait SNOOZED extends NativeListRouteIDs
  /* 5 */ @js.native
  object SNOOZED extends TopLevel[SNOOZED with Double]
  
  @js.native
  sealed trait SPAM extends NativeListRouteIDs
  /* 10 */ @js.native
  object SPAM extends TopLevel[SPAM with Double]
  
  @js.native
  sealed trait STARRED extends NativeListRouteIDs
  /* 3 */ @js.native
  object STARRED extends TopLevel[STARRED with Double]
  
  @js.native
  sealed trait TRASH extends NativeListRouteIDs
  /* 9 */ @js.native
  object TRASH extends TopLevel[TRASH with Double]
}
