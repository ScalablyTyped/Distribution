package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The maximum number of items to return. Default is 10. Max limit is 1000. Throws an invalid argument for `page_size \> 1000`.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Token that specifies which page is requested. If empty, the first page is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the location that contains the entry groups, which can be provided in URL format. Example: * projects/{project_id\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsList {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
