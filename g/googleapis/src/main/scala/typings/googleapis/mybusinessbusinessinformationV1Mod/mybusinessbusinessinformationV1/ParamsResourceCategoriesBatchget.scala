package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCategoriesBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The BCP 47 code of language that the category names should be returned in.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. At least one name must be set. The GConcept ids the localized category names should be returned for. To return details for more than one category, repeat this parameter in the request.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The ISO 3166-1 alpha-2 country code used to infer non-standard language.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Specifies which parts to the Category resource should be returned in the response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceCategoriesBatchget {
  
  inline def apply(): ParamsResourceCategoriesBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCategoriesBatchget]
  }
  
  extension [Self <: ParamsResourceCategoriesBatchget](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
