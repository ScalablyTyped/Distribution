package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsViewsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the view. Required. The location to create a view for. Format: `projects//locations/` or `projects//locations/`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1View] = js.undefined
}
object ParamsResourceProjectsLocationsViewsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsViewsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsViewsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsViewsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudContactcenterinsightsV1View): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
