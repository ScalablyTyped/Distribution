package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var nodeId: Double
  
  var numberOfBatches: Double
}
object Duration {
  
  inline def apply(duration: Double, nodeId: Double, numberOfBatches: Double): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], numberOfBatches = numberOfBatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBatches(value: Double): Self = StObject.set(x, "numberOfBatches", value.asInstanceOf[js.Any])
  }
}
