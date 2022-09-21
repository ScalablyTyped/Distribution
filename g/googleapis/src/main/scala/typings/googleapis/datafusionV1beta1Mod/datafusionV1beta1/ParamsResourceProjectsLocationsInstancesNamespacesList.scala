package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesNamespacesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value to use if there are additional results to retrieve for this list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The instance to list its namespaces.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * By default, only basic information about a namespace is returned (e.g. name). When `NAMESPACE_VIEW_FULL` is specified, additional information associated with a namespace gets returned (e.g. IAM policy set on the namespace)
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesNamespacesList {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesNamespacesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesNamespacesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesNamespacesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
