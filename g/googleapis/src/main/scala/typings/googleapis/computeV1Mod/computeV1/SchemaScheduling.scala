package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScheduling extends StObject {
  
  /**
    * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
    */
  var automaticRestart: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the termination action for the instance.
    */
  var instanceTerminationAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
    */
  var locationHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
    */
  var minNodeCpus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
    */
  var nodeAffinities: js.UndefOr[js.Array[SchemaSchedulingNodeAffinity]] = js.undefined
  
  /**
    * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM host maintenance policy.
    */
  var onHostMaintenance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
    */
  var preemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the provisioning model of the instance.
    */
  var provisioningModel: js.UndefOr[String | Null] = js.undefined
}
object SchemaScheduling {
  
  inline def apply(): SchemaScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduling]
  }
  
  extension [Self <: SchemaScheduling](x: Self) {
    
    inline def setAutomaticRestart(value: Boolean): Self = StObject.set(x, "automaticRestart", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRestartNull: Self = StObject.set(x, "automaticRestart", null)
    
    inline def setAutomaticRestartUndefined: Self = StObject.set(x, "automaticRestart", js.undefined)
    
    inline def setInstanceTerminationAction(value: String): Self = StObject.set(x, "instanceTerminationAction", value.asInstanceOf[js.Any])
    
    inline def setInstanceTerminationActionNull: Self = StObject.set(x, "instanceTerminationAction", null)
    
    inline def setInstanceTerminationActionUndefined: Self = StObject.set(x, "instanceTerminationAction", js.undefined)
    
    inline def setLocationHint(value: String): Self = StObject.set(x, "locationHint", value.asInstanceOf[js.Any])
    
    inline def setLocationHintNull: Self = StObject.set(x, "locationHint", null)
    
    inline def setLocationHintUndefined: Self = StObject.set(x, "locationHint", js.undefined)
    
    inline def setMinNodeCpus(value: Double): Self = StObject.set(x, "minNodeCpus", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCpusNull: Self = StObject.set(x, "minNodeCpus", null)
    
    inline def setMinNodeCpusUndefined: Self = StObject.set(x, "minNodeCpus", js.undefined)
    
    inline def setNodeAffinities(value: js.Array[SchemaSchedulingNodeAffinity]): Self = StObject.set(x, "nodeAffinities", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinitiesUndefined: Self = StObject.set(x, "nodeAffinities", js.undefined)
    
    inline def setNodeAffinitiesVarargs(value: SchemaSchedulingNodeAffinity*): Self = StObject.set(x, "nodeAffinities", js.Array(value*))
    
    inline def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    inline def setOnHostMaintenanceNull: Self = StObject.set(x, "onHostMaintenance", null)
    
    inline def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleNull: Self = StObject.set(x, "preemptible", null)
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setProvisioningModel(value: String): Self = StObject.set(x, "provisioningModel", value.asInstanceOf[js.Any])
    
    inline def setProvisioningModelNull: Self = StObject.set(x, "provisioningModel", null)
    
    inline def setProvisioningModelUndefined: Self = StObject.set(x, "provisioningModel", js.undefined)
  }
}
