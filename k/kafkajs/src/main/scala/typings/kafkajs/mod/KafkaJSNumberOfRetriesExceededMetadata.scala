package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSNumberOfRetriesExceededMetadata extends StObject {
  
  var retryCount: Double
  
  var retryTime: Double
}
object KafkaJSNumberOfRetriesExceededMetadata {
  
  inline def apply(retryCount: Double, retryTime: Double): KafkaJSNumberOfRetriesExceededMetadata = {
    val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any], retryTime = retryTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSNumberOfRetriesExceededMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaJSNumberOfRetriesExceededMetadata] (val x: Self) extends AnyVal {
    
    inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    
    inline def setRetryTime(value: Double): Self = StObject.set(x, "retryTime", value.asInstanceOf[js.Any])
  }
}
