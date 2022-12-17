package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberId extends StObject {
  
  var groupGenerationId: Double
  
  var groupId: String
  
  var memberId: String
}
object MemberId {
  
  inline def apply(groupGenerationId: Double, groupId: String, memberId: String): MemberId = {
    val __obj = js.Dynamic.literal(groupGenerationId = groupGenerationId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberId]
  }
  
  extension [Self <: MemberId](x: Self) {
    
    inline def setGroupGenerationId(value: Double): Self = StObject.set(x, "groupGenerationId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
  }
}
