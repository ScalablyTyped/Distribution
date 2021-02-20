package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerStreamOptions extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var kafkaClient: js.UndefOr[KafkaClientOptions] = js.native
  
  var producer: js.UndefOr[ProducerOptions] = js.native
}
object ProducerStreamOptions {
  
  @scala.inline
  def apply(): ProducerStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerStreamOptions]
  }
  
  @scala.inline
  implicit class ProducerStreamOptionsMutableBuilder[Self <: ProducerStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setKafkaClient(value: KafkaClientOptions): Self = StObject.set(x, "kafkaClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaClientUndefined: Self = StObject.set(x, "kafkaClient", js.undefined)
    
    @scala.inline
    def setProducer(value: ProducerOptions): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
