package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdString extends StObject {
  
  var groupId: String
}
object GroupIdString {
  
  inline def apply(groupId: String): GroupIdString = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdString]
  }
  
  extension [Self <: GroupIdString](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
  }
}
