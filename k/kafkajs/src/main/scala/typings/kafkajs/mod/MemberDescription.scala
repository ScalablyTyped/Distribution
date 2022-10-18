package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberDescription extends StObject {
  
  var clientHost: String
  
  var clientId: String
  
  var memberAssignment: Buffer
  
  var memberId: String
  
  var memberMetadata: Buffer
}
object MemberDescription {
  
  inline def apply(
    clientHost: String,
    clientId: String,
    memberAssignment: Buffer,
    memberId: String,
    memberMetadata: Buffer
  ): MemberDescription = {
    val __obj = js.Dynamic.literal(clientHost = clientHost.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], memberAssignment = memberAssignment.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any], memberMetadata = memberMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDescription]
  }
  
  extension [Self <: MemberDescription](x: Self) {
    
    inline def setClientHost(value: String): Self = StObject.set(x, "clientHost", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setMemberAssignment(value: Buffer): Self = StObject.set(x, "memberAssignment", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
    
    inline def setMemberMetadata(value: Buffer): Self = StObject.set(x, "memberMetadata", value.asInstanceOf[js.Any])
  }
}
