package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeId extends StObject {
  
  var host: String
  
  var nodeId: Double
  
  var port: Double
  
  var rack: js.UndefOr[String] = js.undefined
}
object NodeId {
  
  inline def apply(host: String, nodeId: Double, port: Double): NodeId = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  extension [Self <: NodeId](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setRack(value: String): Self = StObject.set(x, "rack", value.asInstanceOf[js.Any])
    
    inline def setRackUndefined: Self = StObject.set(x, "rack", js.undefined)
  }
}
