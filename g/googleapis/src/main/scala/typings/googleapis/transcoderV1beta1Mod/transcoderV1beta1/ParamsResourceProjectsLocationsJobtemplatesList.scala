package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobtemplatesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The `next_page_token` value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent location from which to retrieve the collection of job templates. Format: `projects/{project\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobtemplatesList {
  
  inline def apply(): ParamsResourceProjectsLocationsJobtemplatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobtemplatesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobtemplatesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
