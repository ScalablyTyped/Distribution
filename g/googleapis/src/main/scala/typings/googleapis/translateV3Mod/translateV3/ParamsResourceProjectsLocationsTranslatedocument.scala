package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTranslatedocument
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Location to make a regional call. Format: `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Non-global location is required for requests using AutoML models or custom glossaries. Models and glossaries must be within the same region (have the same location-id), otherwise an INVALID_ARGUMENT (400) error is returned.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTranslateDocumentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsTranslatedocument {
  
  inline def apply(): ParamsResourceProjectsLocationsTranslatedocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTranslatedocument]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTranslatedocument](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTranslateDocumentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
