package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerOptions extends StObject {
  
  var ackTimeoutMs: js.UndefOr[Double] = js.undefined
  
  var partitionerType: js.UndefOr[Double] = js.undefined
  
  var requireAcks: js.UndefOr[Double] = js.undefined
}
object ProducerOptions {
  
  inline def apply(): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerOptions]
  }
  
  extension [Self <: ProducerOptions](x: Self) {
    
    inline def setAckTimeoutMs(value: Double): Self = StObject.set(x, "ackTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setAckTimeoutMsUndefined: Self = StObject.set(x, "ackTimeoutMs", js.undefined)
    
    inline def setPartitionerType(value: Double): Self = StObject.set(x, "partitionerType", value.asInstanceOf[js.Any])
    
    inline def setPartitionerTypeUndefined: Self = StObject.set(x, "partitionerType", js.undefined)
    
    inline def setRequireAcks(value: Double): Self = StObject.set(x, "requireAcks", value.asInstanceOf[js.Any])
    
    inline def setRequireAcksUndefined: Self = StObject.set(x, "requireAcks", js.undefined)
  }
}
