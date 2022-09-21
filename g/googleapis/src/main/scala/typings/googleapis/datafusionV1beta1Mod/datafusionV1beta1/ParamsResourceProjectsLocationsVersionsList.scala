package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsVersionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Whether or not to return the latest patch of every available minor version. If true, only the latest patch will be returned. Ex. if allowed versions is [6.1.1, 6.1.2, 6.2.0] then response will be [6.1.2, 6.2.0]
    */
  var latestPatchOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value to use if there are additional results to retrieve for this list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project and location for which to retrieve instance information in the format projects/{project\}/locations/{location\}.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsVersionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsVersionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsVersionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsVersionsList](x: Self) {
    
    inline def setLatestPatchOnly(value: Boolean): Self = StObject.set(x, "latestPatchOnly", value.asInstanceOf[js.Any])
    
    inline def setLatestPatchOnlyUndefined: Self = StObject.set(x, "latestPatchOnly", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
