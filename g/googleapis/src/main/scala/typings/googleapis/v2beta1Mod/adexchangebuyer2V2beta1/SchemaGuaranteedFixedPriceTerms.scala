package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Terms for Programmatic Guaranteed Deals.
  */
@js.native
trait SchemaGuaranteedFixedPriceTerms extends js.Object {
  
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
  
  /**
    * Guaranteed impressions as a percentage. This is the percentage of
    * guaranteed looks that the buyer is guaranteeing to buy.
    */
  var guaranteedImpressions: js.UndefOr[String] = js.native
  
  /**
    * Count of guaranteed looks. Required for deal, optional for product.
    */
  var guaranteedLooks: js.UndefOr[String] = js.native
  
  /**
    * Daily minimum looks for CPD deal types.
    */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}
object SchemaGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): SchemaGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class SchemaGuaranteedFixedPriceTermsOps[Self <: SchemaGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
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
    def setFixedPricesVarargs(value: SchemaPricePerBuyer*): Self = this.set("fixedPrices", js.Array(value :_*))
    
    @scala.inline
    def setFixedPrices(value: js.Array[SchemaPricePerBuyer]): Self = this.set("fixedPrices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrices: Self = this.set("fixedPrices", js.undefined)
    
    @scala.inline
    def setGuaranteedImpressions(value: String): Self = this.set("guaranteedImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuaranteedImpressions: Self = this.set("guaranteedImpressions", js.undefined)
    
    @scala.inline
    def setGuaranteedLooks(value: String): Self = this.set("guaranteedLooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuaranteedLooks: Self = this.set("guaranteedLooks", js.undefined)
    
    @scala.inline
    def setMinimumDailyLooks(value: String): Self = this.set("minimumDailyLooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumDailyLooks: Self = this.set("minimumDailyLooks", js.undefined)
  }
}
