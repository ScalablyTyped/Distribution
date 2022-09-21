package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRuleTwowaySynonymsAction extends StObject {
  
  /**
    * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
    */
  var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRuleTwowaySynonymsAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRuleTwowaySynonymsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRuleTwowaySynonymsAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRuleTwowaySynonymsAction](x: Self) {
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
