package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingInfo extends js.Object {
  
  /** Aggregation Info. This can be left unspecified if the pricing expression doesn't require aggregation. */
  var aggregationInfo: js.UndefOr[AggregationInfo] = js.native
  
  /**
    * Conversion rate used for currency conversion, from USD to the currency specified in the request. This includes any surcharge collected for billing in non USD currency. If a currency
    * is not specified in the request this defaults to 1.0. Example: USD * currency_conversion_rate = JPY
    */
  var currencyConversionRate: js.UndefOr[Double] = js.native
  
  /**
    * The timestamp from which this pricing was effective within the requested time range. This is guaranteed to be greater than or equal to the start_time field in the request and less
    * than the end_time field in the request. If a time range was not specified in the request this field will be equivalent to a time within the last 12 hours, indicating the latest
    * pricing info.
    */
  var effectiveTime: js.UndefOr[String] = js.native
  
  /** Expresses the pricing formula. See `PricingExpression` for an example. */
  var pricingExpression: js.UndefOr[PricingExpression] = js.native
  
  /** An optional human readable summary of the pricing information, has a maximum length of 256 characters. */
  var summary: js.UndefOr[String] = js.native
}
object PricingInfo {
  
  @scala.inline
  def apply(): PricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingInfo]
  }
  
  @scala.inline
  implicit class PricingInfoOps[Self <: PricingInfo] (val x: Self) extends AnyVal {
    
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
    def setAggregationInfo(value: AggregationInfo): Self = this.set("aggregationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationInfo: Self = this.set("aggregationInfo", js.undefined)
    
    @scala.inline
    def setCurrencyConversionRate(value: Double): Self = this.set("currencyConversionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyConversionRate: Self = this.set("currencyConversionRate", js.undefined)
    
    @scala.inline
    def setEffectiveTime(value: String): Self = this.set("effectiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveTime: Self = this.set("effectiveTime", js.undefined)
    
    @scala.inline
    def setPricingExpression(value: PricingExpression): Self = this.set("pricingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingExpression: Self = this.set("pricingExpression", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
