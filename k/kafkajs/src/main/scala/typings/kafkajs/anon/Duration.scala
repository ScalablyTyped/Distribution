package typings.kafkajs.anon

import typings.kafkajs.mod.IMemberAssignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var groupId: String
  
  var groupProtocol: String
  
  var isLeader: Boolean
  
  var leaderId: String
  
  var memberAssignment: IMemberAssignment
  
  var memberId: String
}
object Duration {
  
  inline def apply(
    duration: Double,
    groupId: String,
    groupProtocol: String,
    isLeader: Boolean,
    leaderId: String,
    memberAssignment: IMemberAssignment,
    memberId: String
  ): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], groupProtocol = groupProtocol.asInstanceOf[js.Any], isLeader = isLeader.asInstanceOf[js.Any], leaderId = leaderId.asInstanceOf[js.Any], memberAssignment = memberAssignment.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupProtocol(value: String): Self = StObject.set(x, "groupProtocol", value.asInstanceOf[js.Any])
    
    inline def setIsLeader(value: Boolean): Self = StObject.set(x, "isLeader", value.asInstanceOf[js.Any])
    
    inline def setLeaderId(value: String): Self = StObject.set(x, "leaderId", value.asInstanceOf[js.Any])
    
    inline def setMemberAssignment(value: IMemberAssignment): Self = StObject.set(x, "memberAssignment", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
  }
}
