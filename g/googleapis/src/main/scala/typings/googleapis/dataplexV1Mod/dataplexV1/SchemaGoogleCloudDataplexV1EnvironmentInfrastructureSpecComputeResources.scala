package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources extends StObject {
  
  /**
    * Optional. Size in GB of the disk. Default is 100 GB.
    */
  var diskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Max configurable nodes. If max_node_count \> node_count, then auto-scaling is enabled.
    */
  var maxNodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Total number of nodes in the sessions created for this environment.
    */
  var nodeCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources](x: Self) {
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setMaxNodeCount(value: Double): Self = StObject.set(x, "maxNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeCountNull: Self = StObject.set(x, "maxNodeCount", null)
    
    inline def setMaxNodeCountUndefined: Self = StObject.set(x, "maxNodeCount", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountNull: Self = StObject.set(x, "nodeCount", null)
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
  }
}
