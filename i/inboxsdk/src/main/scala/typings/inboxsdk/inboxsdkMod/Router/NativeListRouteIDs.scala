package typings.inboxsdk.inboxsdkMod.Router

import org.scalablytyped.runtime.TopLevel
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.ALL_MAIL
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.ANY_LIST
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.DONE
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.DRAFTS
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.IMPORTANT
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.INBOX
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.LABEL
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.REMINDERS
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SEARCH
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SENT
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SNOOZED
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.SPAM
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.STARRED
import typings.inboxsdk.inboxsdkMod.Router.NativeListRouteIDs.TRASH
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NativeListRouteIDs with Double] = js.native
  /* 1 */ @js.native
  object ALL_MAIL extends TopLevel[ALL_MAIL with Double]
  
  /* 13 */ @js.native
  object ANY_LIST extends TopLevel[ANY_LIST with Double]
  
  /* 6 */ @js.native
  object DONE extends TopLevel[DONE with Double]
  
  /* 4 */ @js.native
  object DRAFTS extends TopLevel[DRAFTS with Double]
  
  /* 11 */ @js.native
  object IMPORTANT extends TopLevel[IMPORTANT with Double]
  
  /* 0 */ @js.native
  object INBOX extends TopLevel[INBOX with Double]
  
  /* 8 */ @js.native
  object LABEL extends TopLevel[LABEL with Double]
  
  /* 7 */ @js.native
  object REMINDERS extends TopLevel[REMINDERS with Double]
  
  /* 12 */ @js.native
  object SEARCH extends TopLevel[SEARCH with Double]
  
  /* 2 */ @js.native
  object SENT extends TopLevel[SENT with Double]
  
  /* 5 */ @js.native
  object SNOOZED extends TopLevel[SNOOZED with Double]
  
  /* 10 */ @js.native
  object SPAM extends TopLevel[SPAM with Double]
  
  /* 3 */ @js.native
  object STARRED extends TopLevel[STARRED with Double]
  
  /* 9 */ @js.native
  object TRASH extends TopLevel[TRASH with Double]
  
}

