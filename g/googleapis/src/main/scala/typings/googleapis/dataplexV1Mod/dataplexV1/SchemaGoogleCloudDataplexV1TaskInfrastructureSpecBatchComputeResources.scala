package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources extends StObject {
  
  /**
    * Optional. Total number of job executors. Executor Count should be between 2 and 100. Default=2
    */
  var executorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Max configurable executors. If max_executors_count \> executors_count, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. Default=1000
    */
  var maxExecutorsCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources](x: Self) {
    
    inline def setExecutorsCount(value: Double): Self = StObject.set(x, "executorsCount", value.asInstanceOf[js.Any])
    
    inline def setExecutorsCountNull: Self = StObject.set(x, "executorsCount", null)
    
    inline def setExecutorsCountUndefined: Self = StObject.set(x, "executorsCount", js.undefined)
    
    inline def setMaxExecutorsCount(value: Double): Self = StObject.set(x, "maxExecutorsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxExecutorsCountNull: Self = StObject.set(x, "maxExecutorsCount", null)
    
    inline def setMaxExecutorsCountUndefined: Self = StObject.set(x, "maxExecutorsCount", js.undefined)
  }
}
