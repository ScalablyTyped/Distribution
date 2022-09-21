package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsImageversionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Whether or not image versions from old releases should be included.
    */
  var includePastReleases: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of image_versions to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List ImageVersions in the given project and location, in the form: "projects/{projectId\}/locations/{locationId\}"
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsImageversionsList {
  
  inline def apply(): ParamsResourceProjectsLocationsImageversionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsImageversionsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsImageversionsList](x: Self) {
    
    inline def setIncludePastReleases(value: Boolean): Self = StObject.set(x, "includePastReleases", value.asInstanceOf[js.Any])
    
    inline def setIncludePastReleasesUndefined: Self = StObject.set(x, "includePastReleases", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
