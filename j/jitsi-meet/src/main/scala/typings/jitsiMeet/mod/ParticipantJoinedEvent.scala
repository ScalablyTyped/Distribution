package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantJoinedEvent extends StObject {
  
  var displayName: String
  
  var id: String
}
object ParticipantJoinedEvent {
  
  inline def apply(displayName: String, id: String): ParticipantJoinedEvent = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantJoinedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantJoinedEvent] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
