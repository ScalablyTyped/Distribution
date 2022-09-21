package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction extends StObject {
  
  /**
    * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
    */
  var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRuleTwowaySynonymsAction](x: Self) {
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
