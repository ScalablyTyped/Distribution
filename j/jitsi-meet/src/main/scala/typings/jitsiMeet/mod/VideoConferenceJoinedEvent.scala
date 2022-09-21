package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoConferenceJoinedEvent extends StObject {
  
  var avatarURL: String
  
  var displayName: String
  
  var id: String
  
  var roomName: String
}
object VideoConferenceJoinedEvent {
  
  inline def apply(avatarURL: String, displayName: String, id: String, roomName: String): VideoConferenceJoinedEvent = {
    val __obj = js.Dynamic.literal(avatarURL = avatarURL.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], roomName = roomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoConferenceJoinedEvent]
  }
  
  extension [Self <: VideoConferenceJoinedEvent](x: Self) {
    
    inline def setAvatarURL(value: String): Self = StObject.set(x, "avatarURL", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
  }
}
