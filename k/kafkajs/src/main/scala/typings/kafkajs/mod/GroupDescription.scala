package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupDescription extends StObject {
  
  var groupId: String
  
  var members: js.Array[MemberDescription]
  
  var protocol: String
  
  var protocolType: String
  
  var state: ConsumerGroupState
}
object GroupDescription {
  
  inline def apply(
    groupId: String,
    members: js.Array[MemberDescription],
    protocol: String,
    protocolType: String,
    state: ConsumerGroupState
  ): GroupDescription = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocolType = protocolType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupDescription] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[MemberDescription]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: MemberDescription*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolType(value: String): Self = StObject.set(x, "protocolType", value.asInstanceOf[js.Any])
    
    inline def setState(value: ConsumerGroupState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
