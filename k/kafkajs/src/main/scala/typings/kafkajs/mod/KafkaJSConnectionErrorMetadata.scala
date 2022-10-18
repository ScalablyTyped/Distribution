package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSConnectionErrorMetadata extends StObject {
  
  var broker: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
}
object KafkaJSConnectionErrorMetadata {
  
  inline def apply(): KafkaJSConnectionErrorMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaJSConnectionErrorMetadata]
  }
  
  extension [Self <: KafkaJSConnectionErrorMetadata](x: Self) {
    
    inline def setBroker(value: String): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
    
    inline def setBrokerUndefined: Self = StObject.set(x, "broker", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
