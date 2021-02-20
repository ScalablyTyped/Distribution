package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchFeedback extends StObject {
  
  var batchFeedback: Boolean = js.native
  
  var gateway: String = js.native
  
  var interval: Double = js.native
  
  var port: Double = js.native
}
object BatchFeedback {
  
  @scala.inline
  def apply(batchFeedback: Boolean, gateway: String, interval: Double, port: Double): BatchFeedback = {
    val __obj = js.Dynamic.literal(batchFeedback = batchFeedback.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchFeedback]
  }
  
  @scala.inline
  implicit class BatchFeedbackMutableBuilder[Self <: BatchFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchFeedback(value: Boolean): Self = StObject.set(x, "batchFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
