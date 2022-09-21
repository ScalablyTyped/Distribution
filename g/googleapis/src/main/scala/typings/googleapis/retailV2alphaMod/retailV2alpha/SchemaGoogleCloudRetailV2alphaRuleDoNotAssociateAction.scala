package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRuleDoNotAssociateAction extends StObject {
  
  /**
    * Cannot contain duplicates or the query term. Can specify up to 100 terms.
    */
  var doNotAssociateTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Terms from the search query. Will not consider do_not_associate_terms for search if in search query. Can specify up to 100 terms.
    */
  var queryTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Will be [deprecated = true] post migration;
    */
  var terms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRuleDoNotAssociateAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRuleDoNotAssociateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRuleDoNotAssociateAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRuleDoNotAssociateAction](x: Self) {
    
    inline def setDoNotAssociateTerms(value: js.Array[String]): Self = StObject.set(x, "doNotAssociateTerms", value.asInstanceOf[js.Any])
    
    inline def setDoNotAssociateTermsNull: Self = StObject.set(x, "doNotAssociateTerms", null)
    
    inline def setDoNotAssociateTermsUndefined: Self = StObject.set(x, "doNotAssociateTerms", js.undefined)
    
    inline def setDoNotAssociateTermsVarargs(value: String*): Self = StObject.set(x, "doNotAssociateTerms", js.Array(value*))
    
    inline def setQueryTerms(value: js.Array[String]): Self = StObject.set(x, "queryTerms", value.asInstanceOf[js.Any])
    
    inline def setQueryTermsNull: Self = StObject.set(x, "queryTerms", null)
    
    inline def setQueryTermsUndefined: Self = StObject.set(x, "queryTerms", js.undefined)
    
    inline def setQueryTermsVarargs(value: String*): Self = StObject.set(x, "queryTerms", js.Array(value*))
    
    inline def setTerms(value: js.Array[String]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsNull: Self = StObject.set(x, "terms", null)
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTermsVarargs(value: String*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
