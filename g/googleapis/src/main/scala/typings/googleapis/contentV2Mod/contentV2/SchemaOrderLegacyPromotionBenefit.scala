package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderLegacyPromotionBenefit extends js.Object {
  
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
  implicit class SchemaOrderLegacyPromotionBenefitOps[Self <: SchemaOrderLegacyPromotionBenefit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiscount(value: SchemaPrice): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    
    @scala.inline
    def setOfferIdsVarargs(value: String*): Self = this.set("offerIds", js.Array(value :_*))
    
    @scala.inline
    def setOfferIds(value: js.Array[String]): Self = this.set("offerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferIds: Self = this.set("offerIds", js.undefined)
    
    @scala.inline
    def setSubType(value: String): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    
    @scala.inline
    def setTaxImpact(value: SchemaPrice): Self = this.set("taxImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxImpact: Self = this.set("taxImpact", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
