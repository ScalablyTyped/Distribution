package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMemberAssignment extends StObject {
  
  var memberAssignment: Buffer
  
  var memberId: String
}
object GroupMemberAssignment {
  
  inline def apply(memberAssignment: Buffer, memberId: String): GroupMemberAssignment = {
    val __obj = js.Dynamic.literal(memberAssignment = memberAssignment.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMemberAssignment]
  }
  
  extension [Self <: GroupMemberAssignment](x: Self) {
    
    inline def setMemberAssignment(value: Buffer): Self = StObject.set(x, "memberAssignment", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
  }
}
