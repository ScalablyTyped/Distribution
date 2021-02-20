package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerOptions extends StObject {
  
  var ackTimeoutMs: js.UndefOr[Double] = js.native
  
  var partitionerType: js.UndefOr[Double] = js.native
  
  var requireAcks: js.UndefOr[Double] = js.native
}
object ProducerOptions {
  
  @scala.inline
  def apply(): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerOptions]
  }
  
  @scala.inline
  implicit class ProducerOptionsMutableBuilder[Self <: ProducerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckTimeoutMs(value: Double): Self = StObject.set(x, "ackTimeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckTimeoutMsUndefined: Self = StObject.set(x, "ackTimeoutMs", js.undefined)
    
    @scala.inline
    def setPartitionerType(value: Double): Self = StObject.set(x, "partitionerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionerTypeUndefined: Self = StObject.set(x, "partitionerType", js.undefined)
    
    @scala.inline
    def setRequireAcks(value: Double): Self = StObject.set(x, "requireAcks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAcksUndefined: Self = StObject.set(x, "requireAcks", js.undefined)
  }
}
