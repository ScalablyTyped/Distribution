package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsScansVulnerabilitiesList
  extends StObject
     with StandardParameters {
  
  /**
    * The number of vulnerabilities to retrieve.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token, resulting from a previous call to ListVulnerabilities.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent of the collection of Vulnerabilities being requested. Format: projects/[project_name]/locations/[location]/scans/[scan_id]
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsScansVulnerabilitiesList {
  
  inline def apply(): ParamsResourceProjectsLocationsScansVulnerabilitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsScansVulnerabilitiesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsScansVulnerabilitiesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
