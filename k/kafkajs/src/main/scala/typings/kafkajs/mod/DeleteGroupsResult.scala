package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupsResult extends StObject {
  
  var error: js.UndefOr[KafkaJSProtocolError] = js.undefined
  
  var errorCode: js.UndefOr[Double] = js.undefined
  
  var groupId: String
}
object DeleteGroupsResult {
  
  inline def apply(groupId: String): DeleteGroupsResult = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGroupsResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: KafkaJSProtocolError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
  }
}
