package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSDeleteGroupsErrorGroups extends StObject {
  
  var error: KafkaJSError
  
  var errorCode: Double
  
  var groupId: String
}
object KafkaJSDeleteGroupsErrorGroups {
  
  inline def apply(error: KafkaJSError, errorCode: Double, groupId: String): KafkaJSDeleteGroupsErrorGroups = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSDeleteGroupsErrorGroups]
  }
  
  extension [Self <: KafkaJSDeleteGroupsErrorGroups](x: Self) {
    
    inline def setError(value: KafkaJSError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
  }
}
