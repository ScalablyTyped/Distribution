package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntroductoryPriceInfo extends StObject {
  
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
  implicit class IntroductoryPriceInfoMutableBuilder[Self <: IntroductoryPriceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntroductoryPriceAmountMicros(value: String): Self = StObject.set(x, "introductoryPriceAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroductoryPriceAmountMicrosUndefined: Self = StObject.set(x, "introductoryPriceAmountMicros", js.undefined)
    
    @scala.inline
    def setIntroductoryPriceCurrencyCode(value: String): Self = StObject.set(x, "introductoryPriceCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroductoryPriceCurrencyCodeUndefined: Self = StObject.set(x, "introductoryPriceCurrencyCode", js.undefined)
    
    @scala.inline
    def setIntroductoryPriceCycles(value: Double): Self = StObject.set(x, "introductoryPriceCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroductoryPriceCyclesUndefined: Self = StObject.set(x, "introductoryPriceCycles", js.undefined)
    
    @scala.inline
    def setIntroductoryPricePeriod(value: String): Self = StObject.set(x, "introductoryPricePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroductoryPricePeriodUndefined: Self = StObject.set(x, "introductoryPricePeriod", js.undefined)
  }
}
