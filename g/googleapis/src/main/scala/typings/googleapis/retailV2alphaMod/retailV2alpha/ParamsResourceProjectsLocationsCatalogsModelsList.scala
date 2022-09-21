package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsModelsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Maximum number of results to return. If unspecified, defaults to 50. Max allowed value is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A page token, received from a previous `ListModels` call. Provide this to retrieve the subsequent page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent for which to list models. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsModelsList {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsModelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsModelsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsModelsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
