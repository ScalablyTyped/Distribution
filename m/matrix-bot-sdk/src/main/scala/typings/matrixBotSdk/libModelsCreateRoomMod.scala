package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Content
import typings.matrixBotSdk.anon.Idaccesstoken
import typings.matrixBotSdk.libModelsEventsCreateEventMod.CreateEventContent
import typings.matrixBotSdk.libModelsEventsPowerLevelsEventMod.PowerLevelsEventContent
import typings.matrixBotSdk.matrixBotSdkStrings.creator
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsCreateRoomMod {
  
  trait RoomCreateOptions extends StObject {
    
    /**
      * Extra keys, such as m.federate, to be added to the content of the m.room.create event.
      * The server will overwrite the following keys: `creator`, `room_version`.
      * Future versions of the specification may allow the server to overwrite other keys.
      */
    var creation_content: js.UndefOr[Omit[CreateEventContent, creator]] = js.undefined
    
    /**
      * A list of state events to set in the new room.
      * This allows the user to override the default state events set in the new room.
      * The expected format of the state events are an object with `type`, `state_key` and `content` keys set.
      * Takes precedence over events set by `preset`, but gets overridden by `name` and `topic` keys.
      */
    var initial_state: js.UndefOr[js.Array[Content]] = js.undefined
    
    /**
      * A list of user IDs to invite to the room. This will tell the server to invite everyone in the list to the newly created room.
      */
    var invite: js.UndefOr[js.Array[String]] = js.undefined
    
    var invite_3pid: js.UndefOr[js.Array[Idaccesstoken]] = js.undefined
    
    /**
      * This flag makes the server set the `is_direct` flag on the `m.room.member` events sent to the users in `invite` and `invite_3pid`.
      */
    var is_direct: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this is included, an `m.room.name` event will be sent into the room to indicate the name of the room.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The power level content to override in the default power level event.
      * This object is applied on top of the generated `m.room.power_levels` event content prior to it being sent to the room.
      * Defaults to overriding nothing.
      */
    var power_level_content_override: js.UndefOr[PowerLevelsEventContent] = js.undefined
    
    /**
      * Convenience parameter for setting various default state events based on a preset.
      *
      * If unspecified, the server should use the `visibility` to determine which preset to use.
      * A visbility of `public` equates to a preset of `public_chat` and `private` visibility equates to a preset of `private_chat`.
      */
    var preset: js.UndefOr[RoomPreset] = js.undefined
    
    /**
      * The desired room alias local part.
      * If this is included, a room alias will be created and mapped to the newly created room.
      * The alias will belong on the same homeserver which created the room.
      */
    var room_alias_name: js.UndefOr[String] = js.undefined
    
    /**
      * The room version to set for the room.
      * If not provided, the homeserver is to use its configured default.
      * If provided, the homeserver will return a `400` error with the errcode `M_UNSUPPORTED_ROOM_VERSION` if it does not support the room version.
      */
    var room_version: js.UndefOr[String] = js.undefined
    
    /**
      * If this is included, an `m.room.topic` event will be sent into the room to indicate the topic for the room.
      */
    var topic: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the visibility of the room
      * Rooms default to private visibility if this key is not included.
      */
    var visibility: js.UndefOr[RoomVisibility] = js.undefined
  }
  object RoomCreateOptions {
    
    inline def apply(): RoomCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setCreation_content(value: Omit[CreateEventContent, creator]): Self = StObject.set(x, "creation_content", value.asInstanceOf[js.Any])
      
      inline def setCreation_contentUndefined: Self = StObject.set(x, "creation_content", js.undefined)
      
      inline def setInitial_state(value: js.Array[Content]): Self = StObject.set(x, "initial_state", value.asInstanceOf[js.Any])
      
      inline def setInitial_stateUndefined: Self = StObject.set(x, "initial_state", js.undefined)
      
      inline def setInitial_stateVarargs(value: Content*): Self = StObject.set(x, "initial_state", js.Array(value*))
      
      inline def setInvite(value: js.Array[String]): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
      
      inline def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
      
      inline def setInviteVarargs(value: String*): Self = StObject.set(x, "invite", js.Array(value*))
      
      inline def setInvite_3pid(value: js.Array[Idaccesstoken]): Self = StObject.set(x, "invite_3pid", value.asInstanceOf[js.Any])
      
      inline def setInvite_3pidUndefined: Self = StObject.set(x, "invite_3pid", js.undefined)
      
      inline def setInvite_3pidVarargs(value: Idaccesstoken*): Self = StObject.set(x, "invite_3pid", js.Array(value*))
      
      inline def setIs_direct(value: Boolean): Self = StObject.set(x, "is_direct", value.asInstanceOf[js.Any])
      
      inline def setIs_directUndefined: Self = StObject.set(x, "is_direct", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPower_level_content_override(value: PowerLevelsEventContent): Self = StObject.set(x, "power_level_content_override", value.asInstanceOf[js.Any])
      
      inline def setPower_level_content_overrideUndefined: Self = StObject.set(x, "power_level_content_override", js.undefined)
      
      inline def setPreset(value: RoomPreset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setRoom_alias_name(value: String): Self = StObject.set(x, "room_alias_name", value.asInstanceOf[js.Any])
      
      inline def setRoom_alias_nameUndefined: Self = StObject.set(x, "room_alias_name", js.undefined)
      
      inline def setRoom_version(value: String): Self = StObject.set(x, "room_version", value.asInstanceOf[js.Any])
      
      inline def setRoom_versionUndefined: Self = StObject.set(x, "room_version", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
      
      inline def setVisibility(value: RoomVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixBotSdk.matrixBotSdkStrings.private_chat
    - typings.matrixBotSdk.matrixBotSdkStrings.trusted_private_chat
    - typings.matrixBotSdk.matrixBotSdkStrings.public_chat
  */
  trait RoomPreset extends StObject
  object RoomPreset {
    
    inline def private_chat: typings.matrixBotSdk.matrixBotSdkStrings.private_chat = "private_chat".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.private_chat]
    
    inline def public_chat: typings.matrixBotSdk.matrixBotSdkStrings.public_chat = "public_chat".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.public_chat]
    
    inline def trusted_private_chat: typings.matrixBotSdk.matrixBotSdkStrings.trusted_private_chat = "trusted_private_chat".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.trusted_private_chat]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixBotSdk.matrixBotSdkStrings.public
    - typings.matrixBotSdk.matrixBotSdkStrings.`private`
  */
  trait RoomVisibility extends StObject
  object RoomVisibility {
    
    inline def `private`: typings.matrixBotSdk.matrixBotSdkStrings.`private` = "private".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.`private`]
    
    inline def public: typings.matrixBotSdk.matrixBotSdkStrings.public = "public".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.public]
  }
}
