package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsCreateRoomMod.RoomPreset
import typings.matrixBotSdk.libModelsCreateRoomMod.RoomVisibility
import typings.matrixBotSdk.libModelsEventsJoinRulesEventMod.JoinRule
import typings.matrixBotSdk.libModelsEventsMembershipEventMod.EffectiveMembership
import typings.matrixBotSdk.libModelsEventsMembershipEventMod.Membership
import typings.matrixBotSdk.libModelsEventsMessageEventMod._MessageType
import typings.matrixBotSdk.libModelsEventsPresenceEventMod.PresenceState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixBotSdkStrings {
  
  @js.native
  sealed trait A256CTR extends StObject
  inline def A256CTR: A256CTR = "A256CTR".asInstanceOf[A256CTR]
  
  @js.native
  sealed trait Bearer extends StObject
  inline def Bearer: Bearer = "Bearer".asInstanceOf[Bearer]
  
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
  sealed trait admin extends StObject
  inline def admin: admin = "admin".asInstanceOf[admin]
  
  @js.native
  sealed trait avatar_url extends StObject
  inline def avatar_url: avatar_url = "avatar_url".asInstanceOf[avatar_url]
  
  @js.native
  sealed trait ban
    extends StObject
       with Membership
  inline def ban: ban = "ban".asInstanceOf[ban]
  
  @js.native
  sealed trait creation_ts extends StObject
  inline def creation_ts: creation_ts = "creation_ts".asInstanceOf[creation_ts]
  
  @js.native
  sealed trait creator extends StObject
  inline def creator: creator = "creator".asInstanceOf[creator]
  
  @js.native
  sealed trait crop extends StObject
  inline def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait deactivated extends StObject
  inline def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  
  @js.native
  sealed trait displayname extends StObject
  inline def displayname: displayname = "displayname".asInstanceOf[displayname]
  
  @js.native
  sealed trait email extends StObject
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait invite
    extends StObject
       with EffectiveMembership
       with JoinRule
       with Membership
  inline def invite: invite = "invite".asInstanceOf[invite]
  
  @js.native
  sealed trait is_guest extends StObject
  inline def is_guest: is_guest = "is_guest".asInstanceOf[is_guest]
  
  @js.native
  sealed trait join
    extends StObject
       with EffectiveMembership
       with Membership
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait knock
    extends StObject
       with JoinRule
  inline def knock: knock = "knock".asInstanceOf[knock]
  
  @js.native
  sealed trait leave
    extends StObject
       with EffectiveMembership
       with Membership
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait mDotaudio
    extends StObject
       with _MessageType
  inline def mDotaudio: mDotaudio = "m.audio".asInstanceOf[mDotaudio]
  
  @js.native
  sealed trait mDotemote
    extends StObject
       with _MessageType
  inline def mDotemote: mDotemote = "m.emote".asInstanceOf[mDotemote]
  
  @js.native
  sealed trait mDotfile
    extends StObject
       with _MessageType
  inline def mDotfile: mDotfile = "m.file".asInstanceOf[mDotfile]
  
  @js.native
  sealed trait mDotimage
    extends StObject
       with _MessageType
  inline def mDotimage: mDotimage = "m.image".asInstanceOf[mDotimage]
  
  @js.native
  sealed trait mDotlocation
    extends StObject
       with _MessageType
  inline def mDotlocation: mDotlocation = "m.location".asInstanceOf[mDotlocation]
  
  @js.native
  sealed trait mDotnotice
    extends StObject
       with _MessageType
  inline def mDotnotice: mDotnotice = "m.notice".asInstanceOf[mDotnotice]
  
  @js.native
  sealed trait mDottext
    extends StObject
       with _MessageType
  inline def mDottext: mDottext = "m.text".asInstanceOf[mDottext]
  
  @js.native
  sealed trait mDotvideo
    extends StObject
       with _MessageType
  inline def mDotvideo: mDotvideo = "m.video".asInstanceOf[mDotvideo]
  
  @js.native
  sealed trait msisdn extends StObject
  inline def msisdn: msisdn = "msisdn".asInstanceOf[msisdn]
  
  @js.native
  sealed trait name extends StObject
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait oct extends StObject
  inline def oct: oct = "oct".asInstanceOf[oct]
  
  @js.native
  sealed trait offline
    extends StObject
       with PresenceState
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait online
    extends StObject
       with PresenceState
  inline def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait `private`
    extends StObject
       with JoinRule
       with RoomVisibility
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait private_chat
    extends StObject
       with RoomPreset
  inline def private_chat: private_chat = "private_chat".asInstanceOf[private_chat]
  
  @js.native
  sealed trait public
    extends StObject
       with JoinRule
       with RoomVisibility
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait public_chat
    extends StObject
       with RoomPreset
  inline def public_chat: public_chat = "public_chat".asInstanceOf[public_chat]
  
  @js.native
  sealed trait scale extends StObject
  inline def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait shadow_banned extends StObject
  inline def shadow_banned: shadow_banned = "shadow_banned".asInstanceOf[shadow_banned]
  
  @js.native
  sealed trait trusted_private_chat
    extends StObject
       with RoomPreset
  inline def trusted_private_chat: trusted_private_chat = "trusted_private_chat".asInstanceOf[trusted_private_chat]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with PresenceState
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait user_type extends StObject
  inline def user_type: user_type = "user_type".asInstanceOf[user_type]
  
  @js.native
  sealed trait v2 extends StObject
  inline def v2: v2 = "v2".asInstanceOf[v2]
}
