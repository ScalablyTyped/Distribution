package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMember extends StObject {
  
  var memberId: String
  
  var memberMetadata: Buffer
}
object GroupMember {
  
  inline def apply(memberId: String, memberMetadata: Buffer): GroupMember = {
    val __obj = js.Dynamic.literal(memberId = memberId.asInstanceOf[js.Any], memberMetadata = memberMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMember]
  }
  
  extension [Self <: GroupMember](x: Self) {
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
    
    inline def setMemberMetadata(value: Buffer): Self = StObject.set(x, "memberMetadata", value.asInstanceOf[js.Any])
  }
}
