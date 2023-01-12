package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigAnalytics extends StObject {
  
  var amplitudeAPPKey: js.UndefOr[String] = js.undefined
  
  var googleAnalyticsTrackingId: js.UndefOr[String] = js.undefined
  
  var matomoEndpoint: js.UndefOr[String] = js.undefined
  
  var matomoSiteID: js.UndefOr[String] = js.undefined
  
  var rtcstatsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var rtcstatsEndpoint: js.UndefOr[String] = js.undefined
  
  var rtcstatsPolIInterval: js.UndefOr[Double] = js.undefined
  
  var scriptURLs: js.UndefOr[js.Array[String]] = js.undefined
}
object ConfigAnalytics {
  
  inline def apply(): ConfigAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigAnalytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigAnalytics] (val x: Self) extends AnyVal {
    
    inline def setAmplitudeAPPKey(value: String): Self = StObject.set(x, "amplitudeAPPKey", value.asInstanceOf[js.Any])
    
    inline def setAmplitudeAPPKeyUndefined: Self = StObject.set(x, "amplitudeAPPKey", js.undefined)
    
    inline def setGoogleAnalyticsTrackingId(value: String): Self = StObject.set(x, "googleAnalyticsTrackingId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAnalyticsTrackingIdUndefined: Self = StObject.set(x, "googleAnalyticsTrackingId", js.undefined)
    
    inline def setMatomoEndpoint(value: String): Self = StObject.set(x, "matomoEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMatomoEndpointUndefined: Self = StObject.set(x, "matomoEndpoint", js.undefined)
    
    inline def setMatomoSiteID(value: String): Self = StObject.set(x, "matomoSiteID", value.asInstanceOf[js.Any])
    
    inline def setMatomoSiteIDUndefined: Self = StObject.set(x, "matomoSiteID", js.undefined)
    
    inline def setRtcstatsEnabled(value: Boolean): Self = StObject.set(x, "rtcstatsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtcstatsEnabledUndefined: Self = StObject.set(x, "rtcstatsEnabled", js.undefined)
    
    inline def setRtcstatsEndpoint(value: String): Self = StObject.set(x, "rtcstatsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRtcstatsEndpointUndefined: Self = StObject.set(x, "rtcstatsEndpoint", js.undefined)
    
    inline def setRtcstatsPolIInterval(value: Double): Self = StObject.set(x, "rtcstatsPolIInterval", value.asInstanceOf[js.Any])
    
    inline def setRtcstatsPolIIntervalUndefined: Self = StObject.set(x, "rtcstatsPolIInterval", js.undefined)
    
    inline def setScriptURLs(value: js.Array[String]): Self = StObject.set(x, "scriptURLs", value.asInstanceOf[js.Any])
    
    inline def setScriptURLsUndefined: Self = StObject.set(x, "scriptURLs", js.undefined)
    
    inline def setScriptURLsVarargs(value: String*): Self = StObject.set(x, "scriptURLs", js.Array(value*))
  }
}
