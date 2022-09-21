package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetsupportedlanguages
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The language to use to return localized, human readable names of supported languages. If missing, then display names are not returned in a response.
    */
  var displayLanguageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Get supported languages of this model. The format depends on model type: - AutoML Translation models: `projects/{project-number-or-id\}/locations/{location-id\}/models/{model-id\}` - General (built-in) models: `projects/{project-number-or-id\}/locations/{location-id\}/models/general/nmt`, Returns languages supported by the specified model. If missing, we get supported languages of Google general NMT model.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project or location to make a call. Must refer to a caller's project. Format: `projects/{project-number-or-id\}` or `projects/{project-number-or-id\}/locations/{location-id\}`. For global calls, use `projects/{project-number-or-id\}/locations/global` or `projects/{project-number-or-id\}`. Non-global location is required for AutoML models. Only models within the same region (have same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetsupportedlanguages {
  
  inline def apply(): ParamsResourceProjectsGetsupportedlanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetsupportedlanguages]
  }
  
  extension [Self <: ParamsResourceProjectsGetsupportedlanguages](x: Self) {
    
    inline def setDisplayLanguageCode(value: String): Self = StObject.set(x, "displayLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setDisplayLanguageCodeUndefined: Self = StObject.set(x, "displayLanguageCode", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
