package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction extends StObject {
  
  /**
    * Will be [deprecated = true] post migration;
    */
  var onewayTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
    */
  var queryTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
    */
  var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRuleOnewaySynonymsAction](x: Self) {
    
    inline def setOnewayTerms(value: js.Array[String]): Self = StObject.set(x, "onewayTerms", value.asInstanceOf[js.Any])
    
    inline def setOnewayTermsNull: Self = StObject.set(x, "onewayTerms", null)
    
    inline def setOnewayTermsUndefined: Self = StObject.set(x, "onewayTerms", js.undefined)
    
    inline def setOnewayTermsVarargs(value: String*): Self = StObject.set(x, "onewayTerms", js.Array(value*))
    
    inline def setQueryTerms(value: js.Array[String]): Self = StObject.set(x, "queryTerms", value.asInstanceOf[js.Any])
    
    inline def setQueryTermsNull: Self = StObject.set(x, "queryTerms", null)
    
    inline def setQueryTermsUndefined: Self = StObject.set(x, "queryTerms", js.undefined)
    
    inline def setQueryTermsVarargs(value: String*): Self = StObject.set(x, "queryTerms", js.Array(value*))
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsNull: Self = StObject.set(x, "synonyms", null)
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
