package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum return size of the list call.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A previous returned page token that can be used to continue listing from the last result.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Format: `projects/{project_id\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsList {
  
  inline def apply(): ParamsResourceProjectsLocationsEnvironmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEnvironmentsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
