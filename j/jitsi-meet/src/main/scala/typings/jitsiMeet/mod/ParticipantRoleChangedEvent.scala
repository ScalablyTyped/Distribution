package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantRoleChangedEvent extends StObject {
  
  var id: String
  
  var role: String
}
object ParticipantRoleChangedEvent {
  
  inline def apply(id: String, role: String): ParticipantRoleChangedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantRoleChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantRoleChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
