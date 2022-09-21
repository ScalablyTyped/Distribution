package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsControlsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for the Control, which will become the final component of the Control's resource name. This value should be 4-63 characters, and valid characters are /a-z-_/.
    */
  var controlId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Full resource name of parent catalog. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRetailV2alphaControl] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsControlsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsControlsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsControlsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsControlsCreate](x: Self) {
    
    inline def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRetailV2alphaControl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
