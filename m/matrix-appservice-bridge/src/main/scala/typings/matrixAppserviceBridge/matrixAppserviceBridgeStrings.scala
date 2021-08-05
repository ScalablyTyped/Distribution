package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.errorsMod.unstable.BridgeErrorReason
import typings.matrixAppserviceBridge.intentMod._UserProfileKeys
import typings.matrixAppserviceBridge.membershipCacheMod._UserMembership
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixAppserviceBridgeStrings {
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait avatar_url
    extends StObject
       with _UserProfileKeys
  inline def avatar_url: avatar_url = "avatar_url".asInstanceOf[avatar_url]
  
  @js.native
  sealed trait ban
    extends StObject
       with _UserMembership
  inline def ban: ban = "ban".asInstanceOf[ban]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait displayname
    extends StObject
       with _UserProfileKeys
  inline def displayname: displayname = "displayname".asInstanceOf[displayname]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait invite
    extends StObject
       with _UserMembership
  inline def invite: invite = "invite".asInstanceOf[invite]
  
  @js.native
  sealed trait join
    extends StObject
       with _UserMembership
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait leave
    extends StObject
       with _UserMembership
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait mDotevent_not_handled
    extends StObject
       with BridgeErrorReason
  inline def mDotevent_not_handled: mDotevent_not_handled = "m.event_not_handled".asInstanceOf[mDotevent_not_handled]
  
  @js.native
  sealed trait mDotevent_too_old
    extends StObject
       with BridgeErrorReason
  inline def mDotevent_too_old: mDotevent_too_old = "m.event_too_old".asInstanceOf[mDotevent_too_old]
  
  @js.native
  sealed trait mDotevent_unknown
    extends StObject
       with BridgeErrorReason
  inline def mDotevent_unknown: mDotevent_unknown = "m.event_unknown".asInstanceOf[mDotevent_unknown]
  
  @js.native
  sealed trait mDotforeign_network_error
    extends StObject
       with BridgeErrorReason
  inline def mDotforeign_network_error: mDotforeign_network_error = "m.foreign_network_error".asInstanceOf[mDotforeign_network_error]
  
  @js.native
  sealed trait mDotinternal_error
    extends StObject
       with BridgeErrorReason
  inline def mDotinternal_error: mDotinternal_error = "m.internal_error".asInstanceOf[mDotinternal_error]
  
  @js.native
  sealed trait mDotpresence extends StObject
  inline def mDotpresence: mDotpresence = "m.presence".asInstanceOf[mDotpresence]
  
  @js.native
  sealed trait mDotreceipt extends StObject
  inline def mDotreceipt: mDotreceipt = "m.receipt".asInstanceOf[mDotreceipt]
  
  @js.native
  sealed trait mDottyping extends StObject
  inline def mDottyping: mDottyping = "m.typing".asInstanceOf[mDottyping]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait offline extends StObject
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait online extends StObject
  inline def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait per_room extends StObject
  inline def per_room: per_room = "per_room".asInstanceOf[per_room]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait single extends StObject
  inline def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait unavailable extends StObject
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait warn extends StObject
  inline def warn: warn = "warn".asInstanceOf[warn]
}
