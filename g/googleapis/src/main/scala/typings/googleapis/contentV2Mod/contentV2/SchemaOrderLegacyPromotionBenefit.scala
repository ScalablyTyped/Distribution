package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderLegacyPromotionBenefit extends StObject {
  
  /**
    * The discount in the order price when the promotion is applied.
    */
  var discount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The OfferId(s) that were purchased in this order and map to this specific
    * benefit of the promotion.
    */
  var offerIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Further describes the benefit of the promotion. Note that we will expand
    * on this enumeration as we support new promotion sub-types.
    */
  var subType: js.UndefOr[String] = js.native
  
  /**
    * The impact on tax when the promotion is applied.
    */
  var taxImpact: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Describes whether the promotion applies to products (e.g. 20% off) or to
    * shipping (e.g. Free Shipping).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaOrderLegacyPromotionBenefit {
  
  @scala.inline
  def apply(): SchemaOrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLegacyPromotionBenefit]
  }
  
  @scala.inline
  implicit class SchemaOrderLegacyPromotionBenefitMutableBuilder[Self <: SchemaOrderLegacyPromotionBenefit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscount(value: SchemaPrice): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    @scala.inline
    def setOfferIds(value: js.Array[String]): Self = StObject.set(x, "offerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdsUndefined: Self = StObject.set(x, "offerIds", js.undefined)
    
    @scala.inline
    def setOfferIdsVarargs(value: String*): Self = StObject.set(x, "offerIds", js.Array(value :_*))
    
    @scala.inline
    def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setTaxImpact(value: SchemaPrice): Self = StObject.set(x, "taxImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxImpactUndefined: Self = StObject.set(x, "taxImpact", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
