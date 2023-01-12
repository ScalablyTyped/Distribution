package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdMemberId extends StObject {
  
  var groupId: String
  
  var memberId: String
}
object GroupIdMemberId {
  
  inline def apply(groupId: String, memberId: String): GroupIdMemberId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdMemberId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupIdMemberId] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
  }
}
