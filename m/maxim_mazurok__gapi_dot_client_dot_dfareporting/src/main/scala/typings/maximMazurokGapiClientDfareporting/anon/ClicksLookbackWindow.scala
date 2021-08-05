package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClicksLookbackWindow extends StObject {
  
  /**
    * DFA checks to see if a click interaction occurred within the specified period of time before a conversion. By default the value is pulled from Floodlight or you can manually
    * enter a custom value. Valid values: 1-90.
    */
  var clicksLookbackWindow: js.UndefOr[Double] = js.undefined
  
  /**
    * DFA checks to see if an impression interaction occurred within the specified period of time before a conversion. By default the value is pulled from Floodlight or you can
    * manually enter a custom value. Valid values: 1-90.
    */
  var impressionsLookbackWindow: js.UndefOr[Double] = js.undefined
  
  /** Deprecated: has no effect. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser within the Floodlight
    * group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the lookback window prior
    * to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100 impressions). If another
    * advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumClickInteractions: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100 impressions). If another
    * advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumImpressionInteractions: js.UndefOr[Double] = js.undefined
  
  /** The maximum amount of time that can take place between interactions (clicks or impressions) by the same user. Valid values: 1-90. */
  var maximumInteractionGap: js.UndefOr[Double] = js.undefined
  
  /** Enable pivoting on interaction path. */
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.undefined
}
object ClicksLookbackWindow {
  
  inline def apply(): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
  
  extension [Self <: ClicksLookbackWindow](x: Self) {
    
    inline def setClicksLookbackWindow(value: Double): Self = StObject.set(x, "clicksLookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setClicksLookbackWindowUndefined: Self = StObject.set(x, "clicksLookbackWindow", js.undefined)
    
    inline def setImpressionsLookbackWindow(value: Double): Self = StObject.set(x, "impressionsLookbackWindow", value.asInstanceOf[js.Any])
    
    inline def setImpressionsLookbackWindowUndefined: Self = StObject.set(x, "impressionsLookbackWindow", js.undefined)
    
    inline def setIncludeAttributedIPConversions(value: Boolean): Self = StObject.set(x, "includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributedIPConversionsUndefined: Self = StObject.set(x, "includeAttributedIPConversions", js.undefined)
    
    inline def setIncludeUnattributedCookieConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUnattributedCookieConversionsUndefined: Self = StObject.set(x, "includeUnattributedCookieConversions", js.undefined)
    
    inline def setIncludeUnattributedIPConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUnattributedIPConversionsUndefined: Self = StObject.set(x, "includeUnattributedIPConversions", js.undefined)
    
    inline def setMaximumClickInteractions(value: Double): Self = StObject.set(x, "maximumClickInteractions", value.asInstanceOf[js.Any])
    
    inline def setMaximumClickInteractionsUndefined: Self = StObject.set(x, "maximumClickInteractions", js.undefined)
    
    inline def setMaximumImpressionInteractions(value: Double): Self = StObject.set(x, "maximumImpressionInteractions", value.asInstanceOf[js.Any])
    
    inline def setMaximumImpressionInteractionsUndefined: Self = StObject.set(x, "maximumImpressionInteractions", js.undefined)
    
    inline def setMaximumInteractionGap(value: Double): Self = StObject.set(x, "maximumInteractionGap", value.asInstanceOf[js.Any])
    
    inline def setMaximumInteractionGapUndefined: Self = StObject.set(x, "maximumInteractionGap", js.undefined)
    
    inline def setPivotOnInteractionPath(value: Boolean): Self = StObject.set(x, "pivotOnInteractionPath", value.asInstanceOf[js.Any])
    
    inline def setPivotOnInteractionPathUndefined: Self = StObject.set(x, "pivotOnInteractionPath", js.undefined)
  }
}
