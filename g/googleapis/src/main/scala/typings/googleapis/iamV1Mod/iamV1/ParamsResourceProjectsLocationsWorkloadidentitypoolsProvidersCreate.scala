package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The pool to create this provider in.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkloadIdentityPoolProvider] = js.undefined
  
  /**
    * Required. The ID for the provider, which becomes the final component of the resource name. This value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix `gcp-` is reserved for use by Google, and may not be specified.
    */
  var workloadIdentityPoolProviderId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaWorkloadIdentityPoolProvider): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWorkloadIdentityPoolProviderId(value: String): Self = StObject.set(x, "workloadIdentityPoolProviderId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolProviderIdUndefined: Self = StObject.set(x, "workloadIdentityPoolProviderId", js.undefined)
  }
}
