package typings.googletag.googletag

import typings.googletag.googletag.enums.TrafficSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration object for privacy settings.
  *
  * **See also**
  * - [Configure privacy settings](https://developers.google.com/publisher-tag/samples/configure-privacy)
  */
trait PrivacySettingsConfig extends StObject {
  
  /**
    * Indicates whether the page should be [treated as child-directed](https://support.google.com/admanager/answer/3671211). Set to `null` to clear the configuration.
    */
  var childDirectedTreatment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables serving to run in [limited ads](https://support.google.com/admanager/answer/9882911) mode to aid in publisher regulatory compliance needs.
    * When enabled, the GPT library itself may optionally be requested from a cookie-less,
    * [limited ads URL](https://developers.google.com/publisher-tag/guides/general-best-practices#load_from_an_official_source).
    *
    * **See also**
    * - [Display a limited ad](https://developers.google.com/publisher-tag/samples/display-limited-ad)
    */
  var limitedAds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables serving to run in [non-personalized ads](https://support.google.com/admanager/answer/9005435) mode to aid in publisher regulatory compliance needs.
    */
  var nonPersonalizedAds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables serving to run in [restricted processing mode](https://support.google.com/admanager/answer/9598414) to aid in publisher regulatory compliance needs.
    */
  var restrictDataProcessing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether requests represent purchased or organic traffic.
    * This value populates the [Traffic source](https://support.google.com/admanager/answer/11233407) dimension in Ad Manager reporting.
    * If not set, traffic source defaults to `undefined` in reporting.
    *
    * **Example**
    * ```
    * // Indicate requests represent organic traffic.
    * googletag.pubads().setPrivacySettings({
    *   trafficSource: googletag.enums.TrafficSource.ORGANIC
    * });
    * // Indicate requests represent purchased traffic.
    * googletag.pubads().setPrivacySettings({
    *   trafficSource: googletag.enums.TrafficSource.PURCHASED
    * });
    * ```
    */
  var trafficSource: js.UndefOr[TrafficSource] = js.undefined
  
  /**
    * Indicates whether to mark ad requests as coming from users [under the age of consent](https://support.google.com/admanager/answer/9004919). Set to `null` to clear the configuration.
    */
  var underAgeOfConsent: js.UndefOr[Boolean | Null] = js.undefined
}
object PrivacySettingsConfig {
  
  inline def apply(): PrivacySettingsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivacySettingsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivacySettingsConfig] (val x: Self) extends AnyVal {
    
    inline def setChildDirectedTreatment(value: Boolean): Self = StObject.set(x, "childDirectedTreatment", value.asInstanceOf[js.Any])
    
    inline def setChildDirectedTreatmentNull: Self = StObject.set(x, "childDirectedTreatment", null)
    
    inline def setChildDirectedTreatmentUndefined: Self = StObject.set(x, "childDirectedTreatment", js.undefined)
    
    inline def setLimitedAds(value: Boolean): Self = StObject.set(x, "limitedAds", value.asInstanceOf[js.Any])
    
    inline def setLimitedAdsUndefined: Self = StObject.set(x, "limitedAds", js.undefined)
    
    inline def setNonPersonalizedAds(value: Boolean): Self = StObject.set(x, "nonPersonalizedAds", value.asInstanceOf[js.Any])
    
    inline def setNonPersonalizedAdsUndefined: Self = StObject.set(x, "nonPersonalizedAds", js.undefined)
    
    inline def setRestrictDataProcessing(value: Boolean): Self = StObject.set(x, "restrictDataProcessing", value.asInstanceOf[js.Any])
    
    inline def setRestrictDataProcessingUndefined: Self = StObject.set(x, "restrictDataProcessing", js.undefined)
    
    inline def setTrafficSource(value: TrafficSource): Self = StObject.set(x, "trafficSource", value.asInstanceOf[js.Any])
    
    inline def setTrafficSourceUndefined: Self = StObject.set(x, "trafficSource", js.undefined)
    
    inline def setUnderAgeOfConsent(value: Boolean): Self = StObject.set(x, "underAgeOfConsent", value.asInstanceOf[js.Any])
    
    inline def setUnderAgeOfConsentNull: Self = StObject.set(x, "underAgeOfConsent", null)
    
    inline def setUnderAgeOfConsentUndefined: Self = StObject.set(x, "underAgeOfConsent", js.undefined)
  }
}
