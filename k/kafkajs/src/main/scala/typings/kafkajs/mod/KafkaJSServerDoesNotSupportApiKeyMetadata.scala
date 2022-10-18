package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSServerDoesNotSupportApiKeyMetadata extends StObject {
  
  var apiKey: Double
  
  var apiName: String
}
object KafkaJSServerDoesNotSupportApiKeyMetadata {
  
  inline def apply(apiKey: Double, apiName: String): KafkaJSServerDoesNotSupportApiKeyMetadata = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSServerDoesNotSupportApiKeyMetadata]
  }
  
  extension [Self <: KafkaJSServerDoesNotSupportApiKeyMetadata](x: Self) {
    
    inline def setApiKey(value: Double): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
  }
}
