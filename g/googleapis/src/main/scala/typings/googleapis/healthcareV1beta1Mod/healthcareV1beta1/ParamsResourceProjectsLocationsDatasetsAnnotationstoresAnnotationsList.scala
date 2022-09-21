package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Restricts Annotations returned to those matching a filter. Functions available for filtering are: - `matches("annotation_source.cloud_healthcare_source.name", substring)`. Filter on `cloud_healthcare_source.name`. For example: `matches("annotation_source.cloud_healthcare_source.name", "some source")`. - `matches("annotation", substring)`. Filter on all fields of annotation. For example: `matches("annotation", "some-content")`. - `type("text")`, `type("image")`, `type("resource")`. Filter on the type of annotation `data`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Limit on the number of Annotations to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from the previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the Annotation store to retrieve Annotations from.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Controls which fields are populated in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
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
