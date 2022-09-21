package typings.matrixJsSdk

import typings.matrixJsSdk.mod.SearchKey
import typings.matrixJsSdk.mod.SyncState
import typings.matrixJsSdk.mod._MembershipType
import typings.matrixJsSdk.mod._MsgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixJsSdkStrings {
  
  @js.native
  sealed trait CATCHUP
    extends StObject
       with SyncState
  inline def CATCHUP: CATCHUP = "CATCHUP".asInstanceOf[CATCHUP]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with SyncState
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait PREPARED
    extends StObject
       with SyncState
  inline def PREPARED: PREPARED = "PREPARED".asInstanceOf[PREPARED]
  
  @js.native
  sealed trait STOPPED
    extends StObject
       with SyncState
  inline def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  
  @js.native
  sealed trait SYNCING
    extends StObject
       with SyncState
  inline def SYNCING: SYNCING = "SYNCING".asInstanceOf[SYNCING]
  
  @js.native
  sealed trait b extends StObject
  inline def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait ban
    extends StObject
       with _MembershipType
  inline def ban: ban = "ban".asInstanceOf[ban]
  
  @js.native
  sealed trait contentDotbody
    extends StObject
       with SearchKey
  inline def contentDotbody: contentDotbody = "content.body".asInstanceOf[contentDotbody]
  
  @js.native
  sealed trait contentDotname
    extends StObject
       with SearchKey
  inline def contentDotname: contentDotname = "content.name".asInstanceOf[contentDotname]
  
  @js.native
  sealed trait contentDottopic
    extends StObject
       with SearchKey
  inline def contentDottopic: contentDottopic = "content.topic".asInstanceOf[contentDottopic]
  
  @js.native
  sealed trait f extends StObject
  inline def f: f = "f".asInstanceOf[f]
  
  @js.native
  sealed trait invite
    extends StObject
       with _MembershipType
  inline def invite: invite = "invite".asInstanceOf[invite]
  
  @js.native
  sealed trait join
    extends StObject
       with _MembershipType
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait leave
    extends StObject
       with _MembershipType
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait mDotaudio
    extends StObject
       with _MsgType
  inline def mDotaudio: mDotaudio = "m.audio".asInstanceOf[mDotaudio]
  
  @js.native
  sealed trait mDotbadDotencrypted
    extends StObject
       with _MsgType
  inline def mDotbadDotencrypted: mDotbadDotencrypted = "m.bad.encrypted".asInstanceOf[mDotbadDotencrypted]
  
  @js.native
  sealed trait mDotdirect extends StObject
  inline def mDotdirect: mDotdirect = "m.direct".asInstanceOf[mDotdirect]
  
  @js.native
  sealed trait mDotemote
    extends StObject
       with _MsgType
  inline def mDotemote: mDotemote = "m.emote".asInstanceOf[mDotemote]
  
  @js.native
  sealed trait mDotfile
    extends StObject
       with _MsgType
  inline def mDotfile: mDotfile = "m.file".asInstanceOf[mDotfile]
  
  @js.native
  sealed trait mDotimage
    extends StObject
       with _MsgType
  inline def mDotimage: mDotimage = "m.image".asInstanceOf[mDotimage]
  
  @js.native
  sealed trait mDotnotice
    extends StObject
       with _MsgType
  inline def mDotnotice: mDotnotice = "m.notice".asInstanceOf[mDotnotice]
  
  @js.native
  sealed trait mDotpresence extends StObject
  inline def mDotpresence: mDotpresence = "m.presence".asInstanceOf[mDotpresence]
  
  @js.native
  sealed trait mDotreaction extends StObject
  inline def mDotreaction: mDotreaction = "m.reaction".asInstanceOf[mDotreaction]
  
  @js.native
  sealed trait mDotroomDotcanonical_alias extends StObject
  inline def mDotroomDotcanonical_alias: mDotroomDotcanonical_alias = "m.room.canonical_alias".asInstanceOf[mDotroomDotcanonical_alias]
  
  @js.native
  sealed trait mDotroomDotencryption extends StObject
  inline def mDotroomDotencryption: mDotroomDotencryption = "m.room.encryption".asInstanceOf[mDotroomDotencryption]
  
  @js.native
  sealed trait mDotroomDotguest_access extends StObject
  inline def mDotroomDotguest_access: mDotroomDotguest_access = "m.room.guest_access".asInstanceOf[mDotroomDotguest_access]
  
  @js.native
  sealed trait mDotroomDothistory_visibility extends StObject
  inline def mDotroomDothistory_visibility: mDotroomDothistory_visibility = "m.room.history_visibility".asInstanceOf[mDotroomDothistory_visibility]
  
  @js.native
  sealed trait mDotroomDotjoin_rules extends StObject
  inline def mDotroomDotjoin_rules: mDotroomDotjoin_rules = "m.room.join_rules".asInstanceOf[mDotroomDotjoin_rules]
  
  @js.native
  sealed trait mDotroomDotmember extends StObject
  inline def mDotroomDotmember: mDotroomDotmember = "m.room.member".asInstanceOf[mDotroomDotmember]
  
  @js.native
  sealed trait mDotroomDotmessage extends StObject
  inline def mDotroomDotmessage: mDotroomDotmessage = "m.room.message".asInstanceOf[mDotroomDotmessage]
  
  @js.native
  sealed trait mDotroomDotname extends StObject
  inline def mDotroomDotname: mDotroomDotname = "m.room.name".asInstanceOf[mDotroomDotname]
  
  @js.native
  sealed trait mDotroomDotpower_levels extends StObject
  inline def mDotroomDotpower_levels: mDotroomDotpower_levels = "m.room.power_levels".asInstanceOf[mDotroomDotpower_levels]
  
  @js.native
  sealed trait mDotroomDotredaction extends StObject
  inline def mDotroomDotredaction: mDotroomDotredaction = "m.room.redaction".asInstanceOf[mDotroomDotredaction]
  
  @js.native
  sealed trait mDotroomDottombstone extends StObject
  inline def mDotroomDottombstone: mDotroomDottombstone = "m.room.tombstone".asInstanceOf[mDotroomDottombstone]
  
  @js.native
  sealed trait mDotroomDottopic extends StObject
  inline def mDotroomDottopic: mDotroomDottopic = "m.room.topic".asInstanceOf[mDotroomDottopic]
  
  @js.native
  sealed trait mDotsticker extends StObject
  inline def mDotsticker: mDotsticker = "m.sticker".asInstanceOf[mDotsticker]
  
  @js.native
  sealed trait mDottext
    extends StObject
       with _MsgType
  inline def mDottext: mDottext = "m.text".asInstanceOf[mDottext]
  
  @js.native
  sealed trait mDotvideo
    extends StObject
       with _MsgType
  inline def mDotvideo: mDotvideo = "m.video".asInstanceOf[mDotvideo]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait private_chat extends StObject
  inline def private_chat: private_chat = "private_chat".asInstanceOf[private_chat]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait public_chat extends StObject
  inline def public_chat: public_chat = "public_chat".asInstanceOf[public_chat]
  
  @js.native
  sealed trait trusted_private_chat extends StObject
  inline def trusted_private_chat: trusted_private_chat = "trusted_private_chat".asInstanceOf[trusted_private_chat]
}
