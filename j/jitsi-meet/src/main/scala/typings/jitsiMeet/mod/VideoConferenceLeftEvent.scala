package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoConferenceLeftEvent extends StObject {
  
  var roomName: String
}
object VideoConferenceLeftEvent {
  
  inline def apply(roomName: String): VideoConferenceLeftEvent = {
    val __obj = js.Dynamic.literal(roomName = roomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoConferenceLeftEvent]
  }
  
  extension [Self <: VideoConferenceLeftEvent](x: Self) {
    
    inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
  }
}
