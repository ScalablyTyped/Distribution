package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupNode extends StObject {
  
  /** CPU overcommit. */
  var cpuOvercommitType: js.UndefOr[String] = js.undefined
  
  /** Instances scheduled on this node. */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the node. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of this node. */
  var nodeType: js.UndefOr[String] = js.undefined
  
  /** Binding properties for the physical server. */
  var serverBinding: js.UndefOr[ServerBinding] = js.undefined
  
  /** Server ID associated with this node. */
  var serverId: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object NodeGroupNode {
  
  @scala.inline
  def apply(): NodeGroupNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupNode]
  }
  
  @scala.inline
  implicit class NodeGroupNodeMutableBuilder[Self <: NodeGroupNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuOvercommitType(value: String): Self = StObject.set(x, "cpuOvercommitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuOvercommitTypeUndefined: Self = StObject.set(x, "cpuOvercommitType", js.undefined)
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    @scala.inline
    def setServerBinding(value: ServerBinding): Self = StObject.set(x, "serverBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerBindingUndefined: Self = StObject.set(x, "serverBinding", js.undefined)
    
    @scala.inline
    def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
