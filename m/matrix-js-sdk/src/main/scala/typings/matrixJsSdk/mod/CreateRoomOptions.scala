package typings.matrixJsSdk.mod

import typings.matrixJsSdk.matrixJsSdkStrings.`private`
import typings.matrixJsSdk.matrixJsSdkStrings.private_chat
import typings.matrixJsSdk.matrixJsSdkStrings.public
import typings.matrixJsSdk.matrixJsSdkStrings.public_chat
import typings.matrixJsSdk.matrixJsSdkStrings.trusted_private_chat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoomOptions extends StObject {
  
  /**
    * A list of state events to set in the new room. This allows the user to override the default state events set in the new room.
    * The expected format of the state events are an object with type, state_key and content keys set.
    * Takes precedence over events set by preset, but gets overriden by name and topic keys.
    */
  var initial_state: js.UndefOr[js.Array[StateEvent]] = js.undefined
  
  /**
    * <string> A list of user IDs to invite to this room.
    */
  var invite: js.UndefOr[js.Array[String]] = js.undefined
  
  var is_direct: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name to give this room.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Convenience parameter for setting various default state events based on a preset.
    * If unspecified, the server should use the visibility to determine which preset to use.
    * A visbility of public equates to a preset of public_chat and private visibility equates to a preset of private_chat.
    * One of: ["private_chat", "public_chat", "trusted_private_chat"]
    */
  var preset: js.UndefOr[private_chat | public_chat | trusted_private_chat] = js.undefined
  
  /**
    * The alias localpart to assign to this room.
    */
  var room_alias_name: js.UndefOr[String] = js.undefined
  
  /**
    * The topic to give this room.
    */
  var topic: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[public | `private`] = js.undefined
}
object CreateRoomOptions {
  
  inline def apply(): CreateRoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoomOptions]
  }
  
  extension [Self <: CreateRoomOptions](x: Self) {
    
    inline def setInitial_state(value: js.Array[StateEvent]): Self = StObject.set(x, "initial_state", value.asInstanceOf[js.Any])
    
    inline def setInitial_stateUndefined: Self = StObject.set(x, "initial_state", js.undefined)
    
    inline def setInitial_stateVarargs(value: StateEvent*): Self = StObject.set(x, "initial_state", js.Array(value*))
    
    inline def setInvite(value: js.Array[String]): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
    
    inline def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
    
    inline def setInviteVarargs(value: String*): Self = StObject.set(x, "invite", js.Array(value*))
    
    inline def setIs_direct(value: Boolean): Self = StObject.set(x, "is_direct", value.asInstanceOf[js.Any])
    
    inline def setIs_directUndefined: Self = StObject.set(x, "is_direct", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreset(value: private_chat | public_chat | trusted_private_chat): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setRoom_alias_name(value: String): Self = StObject.set(x, "room_alias_name", value.asInstanceOf[js.Any])
    
    inline def setRoom_alias_nameUndefined: Self = StObject.set(x, "room_alias_name", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setVisibility(value: public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
