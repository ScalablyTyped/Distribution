package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRuleBoostAction extends StObject {
  
  /**
    * Strength of the condition boost, which must be in [-1, 1]. Negative boost means demotion. Default is 0.0. Setting to 1.0 gives the item a big promotion. However, it does not necessarily mean that the boosted item will be the top result at all times, nor that other items will be excluded. Results could still be shown even when none of them matches the condition. And results that are significantly more relevant to the search query can still trump your heavily favored but irrelevant items. Setting to -1.0 gives the item a big demotion. However, results that are deeply relevant might still be shown. The item will have an upstream battle to get a fairly high ranking, but it is not blocked out completely. Setting to 0.0 means no boost applied. The boosting condition is ignored.
    */
  var boost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The filter can have a max size of 5000 characters. An expression which specifies which products to apply an action to. The syntax and supported fields are the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Examples: * To boost products with product ID "product_1" or "product_2", and color "Red" or "Blue": *(id: ANY("product_1", "product_2")) * *AND * *(colorFamilies: ANY("Red", "Blue")) *
    */
  var productsFilter: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRuleBoostAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRuleBoostAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRuleBoostAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRuleBoostAction](x: Self) {
    
    inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostNull: Self = StObject.set(x, "boost", null)
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setProductsFilter(value: String): Self = StObject.set(x, "productsFilter", value.asInstanceOf[js.Any])
    
    inline def setProductsFilterNull: Self = StObject.set(x, "productsFilter", null)
    
    inline def setProductsFilterUndefined: Self = StObject.set(x, "productsFilter", js.undefined)
  }
}
