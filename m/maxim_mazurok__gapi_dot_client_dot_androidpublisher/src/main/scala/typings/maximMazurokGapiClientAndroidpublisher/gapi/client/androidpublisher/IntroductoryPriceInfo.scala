package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntroductoryPriceInfo extends js.Object {
  
  /**
    * Introductory price of the subscription, not including tax. The currency is the same as price_currency_code. Price is expressed in micro-units, where 1,000,000 micro-units represents
    * one unit of the currency. For example, if the subscription price is €1.99, price_amount_micros is 1990000.
    */
  var introductoryPriceAmountMicros: js.UndefOr[String] = js.native
  
  /** ISO 4217 currency code for the introductory subscription price. For example, if the price is specified in British pounds sterling, price_currency_code is "GBP". */
  var introductoryPriceCurrencyCode: js.UndefOr[String] = js.native
  
  /** The number of billing period to offer introductory pricing. */
  var introductoryPriceCycles: js.UndefOr[Double] = js.native
  
  /**
    * Introductory price period, specified in ISO 8601 format. Common values are (but not limited to) "P1W" (one week), "P1M" (one month), "P3M" (three months), "P6M" (six months), and
    * "P1Y" (one year).
    */
  var introductoryPricePeriod: js.UndefOr[String] = js.native
}
object IntroductoryPriceInfo {
  
  @scala.inline
  def apply(): IntroductoryPriceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntroductoryPriceInfo]
  }
  
  @scala.inline
  implicit class IntroductoryPriceInfoOps[Self <: IntroductoryPriceInfo] (val x: Self) extends AnyVal {
    
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
    def setIntroductoryPriceAmountMicros(value: String): Self = this.set("introductoryPriceAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntroductoryPriceAmountMicros: Self = this.set("introductoryPriceAmountMicros", js.undefined)
    
    @scala.inline
    def setIntroductoryPriceCurrencyCode(value: String): Self = this.set("introductoryPriceCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntroductoryPriceCurrencyCode: Self = this.set("introductoryPriceCurrencyCode", js.undefined)
    
    @scala.inline
    def setIntroductoryPriceCycles(value: Double): Self = this.set("introductoryPriceCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntroductoryPriceCycles: Self = this.set("introductoryPriceCycles", js.undefined)
    
    @scala.inline
    def setIntroductoryPricePeriod(value: String): Self = this.set("introductoryPricePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntroductoryPricePeriod: Self = this.set("introductoryPricePeriod", js.undefined)
  }
}
