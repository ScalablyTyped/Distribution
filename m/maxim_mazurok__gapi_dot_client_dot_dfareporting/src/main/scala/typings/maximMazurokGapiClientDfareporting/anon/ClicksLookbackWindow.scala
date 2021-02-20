package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClicksLookbackWindow extends StObject {
  
  /**
    * DFA checks to see if a click interaction occurred within the specified period of time before a conversion. By default the value is pulled from Floodlight or you can manually
    * enter a custom value. Valid values: 1-90.
    */
  var clicksLookbackWindow: js.UndefOr[Double] = js.native
  
  /**
    * DFA checks to see if an impression interaction occurred within the specified period of time before a conversion. By default the value is pulled from Floodlight or you can
    * manually enter a custom value. Valid values: 1-90.
    */
  var impressionsLookbackWindow: js.UndefOr[Double] = js.native
  
  /** Deprecated: has no effect. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser within the Floodlight
    * group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the lookback window prior
    * to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100 impressions). If another
    * advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumClickInteractions: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100 impressions). If another
    * advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumImpressionInteractions: js.UndefOr[Double] = js.native
  
  /** The maximum amount of time that can take place between interactions (clicks or impressions) by the same user. Valid values: 1-90. */
  var maximumInteractionGap: js.UndefOr[Double] = js.native
  
  /** Enable pivoting on interaction path. */
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.native
}
object ClicksLookbackWindow {
  
  @scala.inline
  def apply(): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
  
  @scala.inline
  implicit class ClicksLookbackWindowMutableBuilder[Self <: ClicksLookbackWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicksLookbackWindow(value: Double): Self = StObject.set(x, "clicksLookbackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicksLookbackWindowUndefined: Self = StObject.set(x, "clicksLookbackWindow", js.undefined)
    
    @scala.inline
    def setImpressionsLookbackWindow(value: Double): Self = StObject.set(x, "impressionsLookbackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsLookbackWindowUndefined: Self = StObject.set(x, "impressionsLookbackWindow", js.undefined)
    
    @scala.inline
    def setIncludeAttributedIPConversions(value: Boolean): Self = StObject.set(x, "includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributedIPConversionsUndefined: Self = StObject.set(x, "includeAttributedIPConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedCookieConversionsUndefined: Self = StObject.set(x, "includeUnattributedCookieConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = StObject.set(x, "includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnattributedIPConversionsUndefined: Self = StObject.set(x, "includeUnattributedIPConversions", js.undefined)
    
    @scala.inline
    def setMaximumClickInteractions(value: Double): Self = StObject.set(x, "maximumClickInteractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumClickInteractionsUndefined: Self = StObject.set(x, "maximumClickInteractions", js.undefined)
    
    @scala.inline
    def setMaximumImpressionInteractions(value: Double): Self = StObject.set(x, "maximumImpressionInteractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumImpressionInteractionsUndefined: Self = StObject.set(x, "maximumImpressionInteractions", js.undefined)
    
    @scala.inline
    def setMaximumInteractionGap(value: Double): Self = StObject.set(x, "maximumInteractionGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumInteractionGapUndefined: Self = StObject.set(x, "maximumInteractionGap", js.undefined)
    
    @scala.inline
    def setPivotOnInteractionPath(value: Boolean): Self = StObject.set(x, "pivotOnInteractionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotOnInteractionPathUndefined: Self = StObject.set(x, "pivotOnInteractionPath", js.undefined)
  }
}
