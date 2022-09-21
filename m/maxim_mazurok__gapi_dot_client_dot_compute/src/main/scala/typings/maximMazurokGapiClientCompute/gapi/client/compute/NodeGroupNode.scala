package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupNode extends StObject {
  
  /** Accelerators for this node. */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  
  /** CPU overcommit. */
  var cpuOvercommitType: js.UndefOr[String] = js.undefined
  
  /** Local disk configurations. */
  var disks: js.UndefOr[js.Array[LocalDisk]] = js.undefined
  
  /** Instances scheduled on this node. */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the node. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of this node. */
  var nodeType: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Reserved for future use. */
  var satisfiesPzs: js.UndefOr[Boolean] = js.undefined
  
  /** Binding properties for the physical server. */
  var serverBinding: js.UndefOr[ServerBinding] = js.undefined
  
  /** Server ID associated with this node. */
  var serverId: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object NodeGroupNode {
  
  inline def apply(): NodeGroupNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupNode]
  }
  
  extension [Self <: NodeGroupNode](x: Self) {
    
    inline def setAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setCpuOvercommitType(value: String): Self = StObject.set(x, "cpuOvercommitType", value.asInstanceOf[js.Any])
    
    inline def setCpuOvercommitTypeUndefined: Self = StObject.set(x, "cpuOvercommitType", js.undefined)
    
    inline def setDisks(value: js.Array[LocalDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: LocalDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setServerBinding(value: ServerBinding): Self = StObject.set(x, "serverBinding", value.asInstanceOf[js.Any])
    
    inline def setServerBindingUndefined: Self = StObject.set(x, "serverBinding", js.undefined)
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
