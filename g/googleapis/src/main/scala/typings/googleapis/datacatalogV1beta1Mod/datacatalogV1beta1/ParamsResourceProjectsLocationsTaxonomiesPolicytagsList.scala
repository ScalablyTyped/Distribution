package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTaxonomiesPolicytagsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of items to return. Must be a value between 1 and 1000. If not set, defaults to 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous List request, if any. If not set, defaults to an empty string.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the taxonomy to list the policy tags of.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTaxonomiesPolicytagsList {
  
  inline def apply(): ParamsResourceProjectsLocationsTaxonomiesPolicytagsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTaxonomiesPolicytagsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTaxonomiesPolicytagsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
