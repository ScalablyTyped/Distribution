package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of providers to return. If unspecified, at most 50 providers are returned. The maximum value is 100; values above 100 are truncated to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListWorkloadIdentityPoolProviders` call. Provide this to retrieve the subsequent page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The pool to list providers for.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to return soft-deleted providers.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
  }
}
