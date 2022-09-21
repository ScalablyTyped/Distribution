package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBatchtranslatedocument
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Location to make a regional call. Format: `projects/{project-number-or-id\}/locations/{location-id\}`. The `global` location is not supported for batch translation. Only AutoML Translation models or glossaries within the same region (have the same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchTranslateDocumentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsBatchtranslatedocument {
  
  inline def apply(): ParamsResourceProjectsLocationsBatchtranslatedocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBatchtranslatedocument]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBatchtranslatedocument](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchTranslateDocumentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
