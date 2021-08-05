package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchFeedback extends StObject {
  
  var batchFeedback: Boolean
  
  var gateway: String
  
  var interval: Double
  
  var port: Double
}
object BatchFeedback {
  
  inline def apply(batchFeedback: Boolean, gateway: String, interval: Double, port: Double): BatchFeedback = {
    val __obj = js.Dynamic.literal(batchFeedback = batchFeedback.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchFeedback]
  }
  
  extension [Self <: BatchFeedback](x: Self) {
    
    inline def setBatchFeedback(value: Boolean): Self = StObject.set(x, "batchFeedback", value.asInstanceOf[js.Any])
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
