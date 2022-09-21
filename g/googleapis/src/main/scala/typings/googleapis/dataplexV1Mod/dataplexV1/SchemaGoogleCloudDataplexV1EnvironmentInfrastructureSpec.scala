package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec extends StObject {
  
  /**
    * Optional. Compute resources needed for analyze interactive workloads.
    */
  var compute: js.UndefOr[SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources] = js.undefined
  
  /**
    * Required. Software Runtime Configuration for analyze interactive workloads.
    */
  var osImage: js.UndefOr[SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime] = js.undefined
}
object SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpec](x: Self) {
    
    inline def setCompute(value: SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResources): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setOsImage(value: SchemaGoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntime): Self = StObject.set(x, "osImage", value.asInstanceOf[js.Any])
    
    inline def setOsImageUndefined: Self = StObject.set(x, "osImage", js.undefined)
  }
}
