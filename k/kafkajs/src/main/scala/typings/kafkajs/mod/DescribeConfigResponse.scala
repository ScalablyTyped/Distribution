package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigResponse extends StObject {
  
  var resources: js.Array[typings.kafkajs.anon.ConfigEntries]
  
  var throttleTime: Double
}
object DescribeConfigResponse {
  
  inline def apply(resources: js.Array[typings.kafkajs.anon.ConfigEntries], throttleTime: Double): DescribeConfigResponse = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], throttleTime = throttleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setResources(value: js.Array[typings.kafkajs.anon.ConfigEntries]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: typings.kafkajs.anon.ConfigEntries*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setThrottleTime(value: Double): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
  }
}
