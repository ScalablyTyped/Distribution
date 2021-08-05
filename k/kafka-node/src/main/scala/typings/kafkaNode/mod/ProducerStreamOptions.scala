package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerStreamOptions extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var kafkaClient: js.UndefOr[KafkaClientOptions] = js.undefined
  
  var producer: js.UndefOr[ProducerOptions] = js.undefined
}
object ProducerStreamOptions {
  
  inline def apply(): ProducerStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerStreamOptions]
  }
  
  extension [Self <: ProducerStreamOptions](x: Self) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setKafkaClient(value: KafkaClientOptions): Self = StObject.set(x, "kafkaClient", value.asInstanceOf[js.Any])
    
    inline def setKafkaClientUndefined: Self = StObject.set(x, "kafkaClient", js.undefined)
    
    inline def setProducer(value: ProducerOptions): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
