package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of Services to return in this call.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token received from a previous call to ListServices. All other parameters must match.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The location and project to list resources on. Location must be a valid GCP region, and may not be the "-" wildcard. Format: projects/{projectnumber\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * If true, returns deleted (but unexpired) resources along with active ones.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsServicesList {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesList](x: Self) {
    
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
