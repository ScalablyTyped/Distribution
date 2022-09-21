package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupNode extends StObject {
  
  /**
    * Accelerators for this node.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * Node resources that are reserved by all instances.
    */
  var consumedResources: js.UndefOr[SchemaInstanceConsumptionInfo] = js.undefined
  
  /**
    * CPU overcommit.
    */
  var cpuOvercommitType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Local disk configurations.
    */
  var disks: js.UndefOr[js.Array[SchemaLocalDisk]] = js.undefined
  
  /**
    * Instance data that shows consumed resources on the node.
    */
  var instanceConsumptionData: js.UndefOr[js.Array[SchemaInstanceConsumptionData]] = js.undefined
  
  /**
    * Instances scheduled on this node.
    */
  var instances: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the node.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this node.
    */
  var nodeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Reserved for future use.
    */
  var satisfiesPzs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Binding properties for the physical server.
    */
  var serverBinding: js.UndefOr[SchemaServerBinding] = js.undefined
  
  /**
    * Server ID associated with this node.
    */
  var serverId: js.UndefOr[String | Null] = js.undefined
  
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total amount of available resources on the node.
    */
  var totalResources: js.UndefOr[SchemaInstanceConsumptionInfo] = js.undefined
}
object SchemaNodeGroupNode {
  
  inline def apply(): SchemaNodeGroupNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupNode]
  }
  
  extension [Self <: SchemaNodeGroupNode](x: Self) {
    
    inline def setAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setConsumedResources(value: SchemaInstanceConsumptionInfo): Self = StObject.set(x, "consumedResources", value.asInstanceOf[js.Any])
    
    inline def setConsumedResourcesUndefined: Self = StObject.set(x, "consumedResources", js.undefined)
    
    inline def setCpuOvercommitType(value: String): Self = StObject.set(x, "cpuOvercommitType", value.asInstanceOf[js.Any])
    
    inline def setCpuOvercommitTypeNull: Self = StObject.set(x, "cpuOvercommitType", null)
    
    inline def setCpuOvercommitTypeUndefined: Self = StObject.set(x, "cpuOvercommitType", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaLocalDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaLocalDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setInstanceConsumptionData(value: js.Array[SchemaInstanceConsumptionData]): Self = StObject.set(x, "instanceConsumptionData", value.asInstanceOf[js.Any])
    
    inline def setInstanceConsumptionDataUndefined: Self = StObject.set(x, "instanceConsumptionData", js.undefined)
    
    inline def setInstanceConsumptionDataVarargs(value: SchemaInstanceConsumptionData*): Self = StObject.set(x, "instanceConsumptionData", js.Array(value*))
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeNull: Self = StObject.set(x, "nodeType", null)
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsNull: Self = StObject.set(x, "satisfiesPzs", null)
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setServerBinding(value: SchemaServerBinding): Self = StObject.set(x, "serverBinding", value.asInstanceOf[js.Any])
    
    inline def setServerBindingUndefined: Self = StObject.set(x, "serverBinding", js.undefined)
    
    inline def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setServerIdNull: Self = StObject.set(x, "serverId", null)
    
    inline def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalResources(value: SchemaInstanceConsumptionInfo): Self = StObject.set(x, "totalResources", value.asInstanceOf[js.Any])
    
    inline def setTotalResourcesUndefined: Self = StObject.set(x, "totalResources", js.undefined)
  }
}
