package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAclResponse extends StObject {
  
  var filterResponses: js.Array[DeleteAclFilterResponses]
  
  var throttleTime: Double
}
object DeleteAclResponse {
  
  inline def apply(filterResponses: js.Array[DeleteAclFilterResponses], throttleTime: Double): DeleteAclResponse = {
    val __obj = js.Dynamic.literal(filterResponses = filterResponses.asInstanceOf[js.Any], throttleTime = throttleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAclResponse]
  }
  
  extension [Self <: DeleteAclResponse](x: Self) {
    
    inline def setFilterResponses(value: js.Array[DeleteAclFilterResponses]): Self = StObject.set(x, "filterResponses", value.asInstanceOf[js.Any])
    
    inline def setFilterResponsesVarargs(value: DeleteAclFilterResponses*): Self = StObject.set(x, "filterResponses", js.Array(value*))
    
    inline def setThrottleTime(value: Double): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
  }
}
