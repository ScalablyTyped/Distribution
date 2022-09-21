package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipChangeEvent extends StObject {
  
  /**
    * This should only be set when MembershipChange type is LEAVE.
    */
  var leaveReason: js.UndefOr[String | Null] = js.undefined
  
  var participantId: js.UndefOr[js.Array[SchemaStoredParticipantId]] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipChangeEvent {
  
  inline def apply(): SchemaMembershipChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipChangeEvent]
  }
  
  extension [Self <: SchemaMembershipChangeEvent](x: Self) {
    
    inline def setLeaveReason(value: String): Self = StObject.set(x, "leaveReason", value.asInstanceOf[js.Any])
    
    inline def setLeaveReasonNull: Self = StObject.set(x, "leaveReason", null)
    
    inline def setLeaveReasonUndefined: Self = StObject.set(x, "leaveReason", js.undefined)
    
    inline def setParticipantId(value: js.Array[SchemaStoredParticipantId]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setParticipantIdVarargs(value: SchemaStoredParticipantId*): Self = StObject.set(x, "participantId", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
