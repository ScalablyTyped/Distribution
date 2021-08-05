package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingInfo extends StObject {
  
  /** Aggregation Info. This can be left unspecified if the pricing expression doesn't require aggregation. */
  var aggregationInfo: js.UndefOr[AggregationInfo] = js.undefined
  
  /**
    * Conversion rate used for currency conversion, from USD to the currency specified in the request. This includes any surcharge collected for billing in non USD currency. If a currency
    * is not specified in the request this defaults to 1.0. Example: USD * currency_conversion_rate = JPY
    */
  var currencyConversionRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The timestamp from which this pricing was effective within the requested time range. This is guaranteed to be greater than or equal to the start_time field in the request and less
    * than the end_time field in the request. If a time range was not specified in the request this field will be equivalent to a time within the last 12 hours, indicating the latest
    * pricing info.
    */
  var effectiveTime: js.UndefOr[String] = js.undefined
  
  /** Expresses the pricing formula. See `PricingExpression` for an example. */
  var pricingExpression: js.UndefOr[PricingExpression] = js.undefined
  
  /** An optional human readable summary of the pricing information, has a maximum length of 256 characters. */
  var summary: js.UndefOr[String] = js.undefined
}
object PricingInfo {
  
  inline def apply(): PricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingInfo]
  }
  
  extension [Self <: PricingInfo](x: Self) {
    
    inline def setAggregationInfo(value: AggregationInfo): Self = StObject.set(x, "aggregationInfo", value.asInstanceOf[js.Any])
    
    inline def setAggregationInfoUndefined: Self = StObject.set(x, "aggregationInfo", js.undefined)
    
    inline def setCurrencyConversionRate(value: Double): Self = StObject.set(x, "currencyConversionRate", value.asInstanceOf[js.Any])
    
    inline def setCurrencyConversionRateUndefined: Self = StObject.set(x, "currencyConversionRate", js.undefined)
    
    inline def setEffectiveTime(value: String): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeUndefined: Self = StObject.set(x, "effectiveTime", js.undefined)
    
    inline def setPricingExpression(value: PricingExpression): Self = StObject.set(x, "pricingExpression", value.asInstanceOf[js.Any])
    
    inline def setPricingExpressionUndefined: Self = StObject.set(x, "pricingExpression", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
