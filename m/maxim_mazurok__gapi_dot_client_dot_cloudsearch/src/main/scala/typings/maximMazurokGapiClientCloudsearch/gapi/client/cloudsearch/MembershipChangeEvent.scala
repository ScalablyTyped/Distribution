package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipChangeEvent extends StObject {
  
  /** This should only be set when MembershipChange type is LEAVE. */
  var leaveReason: js.UndefOr[String] = js.undefined
  
  var participantId: js.UndefOr[js.Array[StoredParticipantId]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MembershipChangeEvent {
  
  inline def apply(): MembershipChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembershipChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setLeaveReason(value: String): Self = StObject.set(x, "leaveReason", value.asInstanceOf[js.Any])
    
    inline def setLeaveReasonUndefined: Self = StObject.set(x, "leaveReason", js.undefined)
    
    inline def setParticipantId(value: js.Array[StoredParticipantId]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setParticipantIdVarargs(value: StoredParticipantId*): Self = StObject.set(x, "participantId", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
