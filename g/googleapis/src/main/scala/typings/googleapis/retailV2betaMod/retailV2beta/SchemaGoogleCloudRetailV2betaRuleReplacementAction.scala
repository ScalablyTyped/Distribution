package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRuleReplacementAction extends StObject {
  
  /**
    * Terms from the search query. Will be replaced by replacement term. Can specify up to 100 terms.
    */
  var queryTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Term that will be used for replacement.
    */
  var replacementTerm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Will be [deprecated = true] post migration;
    */
  var term: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRuleReplacementAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRuleReplacementAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRuleReplacementAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRuleReplacementAction](x: Self) {
    
    inline def setQueryTerms(value: js.Array[String]): Self = StObject.set(x, "queryTerms", value.asInstanceOf[js.Any])
    
    inline def setQueryTermsNull: Self = StObject.set(x, "queryTerms", null)
    
    inline def setQueryTermsUndefined: Self = StObject.set(x, "queryTerms", js.undefined)
    
    inline def setQueryTermsVarargs(value: String*): Self = StObject.set(x, "queryTerms", js.Array(value*))
    
    inline def setReplacementTerm(value: String): Self = StObject.set(x, "replacementTerm", value.asInstanceOf[js.Any])
    
    inline def setReplacementTermNull: Self = StObject.set(x, "replacementTerm", null)
    
    inline def setReplacementTermUndefined: Self = StObject.set(x, "replacementTerm", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermNull: Self = StObject.set(x, "term", null)
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
  }
}
