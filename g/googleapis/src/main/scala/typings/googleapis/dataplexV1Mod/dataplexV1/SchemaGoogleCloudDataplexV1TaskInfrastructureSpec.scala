package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1TaskInfrastructureSpec extends StObject {
  
  /**
    * Compute resources needed for a Task when using Dataproc Serverless.
    */
  var batch: js.UndefOr[SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources] = js.undefined
  
  /**
    * Container Image Runtime Configuration.
    */
  var containerImage: js.UndefOr[SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime] = js.undefined
  
  /**
    * Vpc network.
    */
  var vpcNetwork: js.UndefOr[SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork] = js.undefined
}
object SchemaGoogleCloudDataplexV1TaskInfrastructureSpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1TaskInfrastructureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1TaskInfrastructureSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1TaskInfrastructureSpec](x: Self) {
    
    inline def setBatch(value: SchemaGoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResources): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setContainerImage(value: SchemaGoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntime): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setVpcNetwork(value: SchemaGoogleCloudDataplexV1TaskInfrastructureSpecVpcNetwork): Self = StObject.set(x, "vpcNetwork", value.asInstanceOf[js.Any])
    
    inline def setVpcNetworkUndefined: Self = StObject.set(x, "vpcNetwork", js.undefined)
  }
}
