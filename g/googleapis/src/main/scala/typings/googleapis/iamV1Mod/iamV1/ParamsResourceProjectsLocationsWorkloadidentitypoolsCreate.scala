package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkloadidentitypoolsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource to create the pool in. The only supported location is `global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkloadIdentityPool] = js.undefined
  
  /**
    * Required. The ID to use for the pool, which becomes the final component of the resource name. This value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix `gcp-` is reserved for use by Google, and may not be specified.
    */
  var workloadIdentityPoolId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkloadidentitypoolsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkloadidentitypoolsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkloadidentitypoolsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkloadidentitypoolsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaWorkloadIdentityPool): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWorkloadIdentityPoolId(value: String): Self = StObject.set(x, "workloadIdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolIdUndefined: Self = StObject.set(x, "workloadIdentityPoolId", js.undefined)
  }
}
