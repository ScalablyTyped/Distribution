package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeScheduling extends StObject {
  
  var automaticRestart: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
    */
  var minNodeCpus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A set of node affinity and anti-affinity configurations for sole tenant nodes.
    */
  var nodeAffinities: js.UndefOr[js.Array[SchemaSchedulingNodeAffinity]] = js.undefined
  
  /**
    * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
    */
  var onHostMaintenance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
    */
  var restartType: js.UndefOr[String | Null] = js.undefined
}
object SchemaComputeScheduling {
  
  inline def apply(): SchemaComputeScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeScheduling]
  }
  
  extension [Self <: SchemaComputeScheduling](x: Self) {
    
    inline def setAutomaticRestart(value: Boolean): Self = StObject.set(x, "automaticRestart", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRestartNull: Self = StObject.set(x, "automaticRestart", null)
    
    inline def setAutomaticRestartUndefined: Self = StObject.set(x, "automaticRestart", js.undefined)
    
    inline def setMinNodeCpus(value: Double): Self = StObject.set(x, "minNodeCpus", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCpusNull: Self = StObject.set(x, "minNodeCpus", null)
    
    inline def setMinNodeCpusUndefined: Self = StObject.set(x, "minNodeCpus", js.undefined)
    
    inline def setNodeAffinities(value: js.Array[SchemaSchedulingNodeAffinity]): Self = StObject.set(x, "nodeAffinities", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinitiesUndefined: Self = StObject.set(x, "nodeAffinities", js.undefined)
    
    inline def setNodeAffinitiesVarargs(value: SchemaSchedulingNodeAffinity*): Self = StObject.set(x, "nodeAffinities", js.Array(value*))
    
    inline def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    inline def setOnHostMaintenanceNull: Self = StObject.set(x, "onHostMaintenance", null)
    
    inline def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    inline def setRestartType(value: String): Self = StObject.set(x, "restartType", value.asInstanceOf[js.Any])
    
    inline def setRestartTypeNull: Self = StObject.set(x, "restartType", null)
    
    inline def setRestartTypeUndefined: Self = StObject.set(x, "restartType", js.undefined)
  }
}
