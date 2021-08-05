package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLegacyPromotionBenefit extends StObject {
  
  /**
    * The discount in the order price when the promotion is applied.
    */
  var discount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The OfferId(s) that were purchased in this order and map to this specific
    * benefit of the promotion.
    */
  var offerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Further describes the benefit of the promotion. Note that we will expand
    * on this enumeration as we support new promotion sub-types.
    */
  var subType: js.UndefOr[String] = js.undefined
  
  /**
    * The impact on tax when the promotion is applied.
    */
  var taxImpact: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Describes whether the promotion applies to products (e.g. 20% off) or to
    * shipping (e.g. Free Shipping).
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaOrderLegacyPromotionBenefit {
  
  inline def apply(): SchemaOrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLegacyPromotionBenefit]
  }
  
  extension [Self <: SchemaOrderLegacyPromotionBenefit](x: Self) {
    
    inline def setDiscount(value: SchemaPrice): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setOfferIds(value: js.Array[String]): Self = StObject.set(x, "offerIds", value.asInstanceOf[js.Any])
    
    inline def setOfferIdsUndefined: Self = StObject.set(x, "offerIds", js.undefined)
    
    inline def setOfferIdsVarargs(value: String*): Self = StObject.set(x, "offerIds", js.Array(value :_*))
    
    inline def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setTaxImpact(value: SchemaPrice): Self = StObject.set(x, "taxImpact", value.asInstanceOf[js.Any])
    
    inline def setTaxImpactUndefined: Self = StObject.set(x, "taxImpact", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
