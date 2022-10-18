package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAclResponse extends StObject {
  
  var errorCode: Double
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var resources: js.Array[DescribeAclResource]
  
  var throttleTime: Double
}
object DescribeAclResponse {
  
  inline def apply(errorCode: Double, resources: js.Array[DescribeAclResource], throttleTime: Double): DescribeAclResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], throttleTime = throttleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAclResponse]
  }
  
  extension [Self <: DescribeAclResponse](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setResources(value: js.Array[DescribeAclResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: DescribeAclResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setThrottleTime(value: Double): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
  }
}
