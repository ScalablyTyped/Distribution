package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.errorsMod.unstable.BridgeErrorReason
import typings.matrixAppserviceBridge.intentMod._UserProfileKeys
import typings.matrixAppserviceBridge.loggingMod.LogLevel
import typings.matrixAppserviceBridge.membershipCacheMod._UserMembership
import typings.matrixAppserviceBridge.provisioningRequestMod.Methods
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
  sealed trait all
    extends StObject
       with Methods
  inline def all: all = "all".asInstanceOf[all]
  
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
  sealed trait checkout
    extends StObject
       with Methods
  inline def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @js.native
  sealed trait connect
    extends StObject
       with Methods
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait copy
    extends StObject
       with Methods
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait crop extends StObject
  inline def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait delete_
    extends StObject
       with Methods
  inline def delete_ : delete_ = "delete".asInstanceOf[delete_]
  
  @js.native
  sealed trait displayname
    extends StObject
       with _UserProfileKeys
  inline def displayname: displayname = "displayname".asInstanceOf[displayname]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait get_
    extends StObject
       with Methods
  inline def get_ : get_ = "get".asInstanceOf[get_]
  
  @js.native
  sealed trait head
    extends StObject
       with Methods
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
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
  sealed trait lock
    extends StObject
       with Methods
  inline def lock: lock = "lock".asInstanceOf[lock]
  
  @js.native
  sealed trait `m-search`
    extends StObject
       with Methods
  inline def `m-search`: `m-search` = "m-search".asInstanceOf[`m-search`]
  
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
  sealed trait merge
    extends StObject
       with Methods
  inline def merge: merge = "merge".asInstanceOf[merge]
  
  @js.native
  sealed trait mkactivity
    extends StObject
       with Methods
  inline def mkactivity: mkactivity = "mkactivity".asInstanceOf[mkactivity]
  
  @js.native
  sealed trait mkcol
    extends StObject
       with Methods
  inline def mkcol: mkcol = "mkcol".asInstanceOf[mkcol]
  
  @js.native
  sealed trait move
    extends StObject
       with Methods
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait mxcColonSlashSlash$LeftcurlybracketstringRightcurlybracket extends StObject
  inline def mxcColonSlashSlash$LeftcurlybracketstringRightcurlybracket: mxcColonSlashSlash$LeftcurlybracketstringRightcurlybracket = "mxc://${string}".asInstanceOf[mxcColonSlashSlash$LeftcurlybracketstringRightcurlybracket]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait notify
    extends StObject
       with Methods
  
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
  sealed trait options
    extends StObject
       with Methods
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait patch
    extends StObject
       with Methods
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait per_room extends StObject
  inline def per_room: per_room = "per_room".asInstanceOf[per_room]
  
  @js.native
  sealed trait post_
    extends StObject
       with Methods
  inline def post_ : post_ = "post".asInstanceOf[post_]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait propfind
    extends StObject
       with Methods
  inline def propfind: propfind = "propfind".asInstanceOf[propfind]
  
  @js.native
  sealed trait proppatch
    extends StObject
       with Methods
  inline def proppatch: proppatch = "proppatch".asInstanceOf[proppatch]
  
  @js.native
  sealed trait provisioner extends StObject
  inline def provisioner: provisioner = "provisioner".asInstanceOf[provisioner]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait purge
    extends StObject
       with Methods
  inline def purge: purge = "purge".asInstanceOf[purge]
  
  @js.native
  sealed trait put_
    extends StObject
       with Methods
  inline def put_ : put_ = "put".asInstanceOf[put_]
  
  @js.native
  sealed trait registeredEqualssigntrue extends StObject
  inline def registeredEqualssigntrue: registeredEqualssigntrue = "registered=true".asInstanceOf[registeredEqualssigntrue]
  
  @js.native
  sealed trait report
    extends StObject
       with Methods
  inline def report: report = "report".asInstanceOf[report]
  
  @js.native
  sealed trait scale extends StObject
  inline def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait search
    extends StObject
       with Methods
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait single extends StObject
  inline def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait subscribe
    extends StObject
       with Methods
  inline def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait trace
    extends StObject
       with Methods
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait unavailable extends StObject
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unlock
    extends StObject
       with Methods
  inline def unlock: unlock = "unlock".asInstanceOf[unlock]
  
  @js.native
  sealed trait unsubscribe
    extends StObject
       with Methods
  inline def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait widget extends StObject
  inline def widget: widget = "widget".asInstanceOf[widget]
}
