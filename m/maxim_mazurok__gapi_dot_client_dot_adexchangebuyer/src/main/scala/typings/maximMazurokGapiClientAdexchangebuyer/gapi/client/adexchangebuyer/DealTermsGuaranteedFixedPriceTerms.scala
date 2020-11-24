package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealTermsGuaranteedFixedPriceTerms extends js.Object {
  
  /** External billing info for this Deal. This field is relevant when external billing info such as price has a different currency code than DFP/AdX. */
  var billingInfo: js.UndefOr[DealTermsGuaranteedFixedPriceTermsBillingInfo] = js.native
  
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.native
  
  /** Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy. */
  var guaranteedImpressions: js.UndefOr[String] = js.native
  
  /** Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer changes to guaranteed_looks will be ignored. */
  var guaranteedLooks: js.UndefOr[String] = js.native
  
  /** Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this field instead of guaranteed_looks. */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}
object DealTermsGuaranteedFixedPriceTerms {
  
  @scala.inline
  def apply(): DealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsGuaranteedFixedPriceTerms]
  }
  
  @scala.inline
  implicit class DealTermsGuaranteedFixedPriceTermsOps[Self <: DealTermsGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    
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
    def setBillingInfo(value: DealTermsGuaranteedFixedPriceTermsBillingInfo): Self = this.set("billingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingInfo: Self = this.set("billingInfo", js.undefined)
    
    @scala.inline
    def setFixedPricesVarargs(value: PricePerBuyer*): Self = this.set("fixedPrices", js.Array(value :_*))
    
    @scala.inline
    def setFixedPrices(value: js.Array[PricePerBuyer]): Self = this.set("fixedPrices", value.asInstanceOf[js.Any])
    
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
