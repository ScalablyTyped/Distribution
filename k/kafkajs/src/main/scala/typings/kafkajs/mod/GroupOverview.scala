package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOverview extends StObject {
  
  var groupId: String
  
  var protocolType: String
}
object GroupOverview {
  
  inline def apply(groupId: String, protocolType: String): GroupOverview = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], protocolType = protocolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOverview]
  }
  
  extension [Self <: GroupOverview](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setProtocolType(value: String): Self = StObject.set(x, "protocolType", value.asInstanceOf[js.Any])
  }
}
