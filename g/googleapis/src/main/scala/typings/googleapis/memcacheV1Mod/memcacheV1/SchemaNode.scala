package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNode extends StObject {
  
  /**
    * Output only. Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
    */
  var nodeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User defined parameters currently applied to the node.
    */
  var parameters: js.UndefOr[SchemaMemcacheParameters] = js.undefined
  
  /**
    * Output only. The port number of the Memcached server on this node.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Current state of the Memcached node.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Location (GCP Zone) for the Memcached node.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaNode {
  
  inline def apply(): SchemaNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNode]
  }
  
  extension [Self <: SchemaNode](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdNull: Self = StObject.set(x, "nodeId", null)
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setParameters(value: SchemaMemcacheParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
