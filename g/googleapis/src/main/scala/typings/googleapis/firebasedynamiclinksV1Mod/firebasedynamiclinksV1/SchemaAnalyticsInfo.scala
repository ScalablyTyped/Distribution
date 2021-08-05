package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracking parameters supported by Dynamic Link.
  */
trait SchemaAnalyticsInfo extends StObject {
  
  /**
    * Google Play Campaign Measurements.
    */
  var googlePlayAnalytics: js.UndefOr[SchemaGooglePlayAnalytics] = js.undefined
  
  /**
    * iTunes Connect App Analytics.
    */
  var itunesConnectAnalytics: js.UndefOr[SchemaITunesConnectAnalytics] = js.undefined
}
object SchemaAnalyticsInfo {
  
  inline def apply(): SchemaAnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsInfo]
  }
  
  extension [Self <: SchemaAnalyticsInfo](x: Self) {
    
    inline def setGooglePlayAnalytics(value: SchemaGooglePlayAnalytics): Self = StObject.set(x, "googlePlayAnalytics", value.asInstanceOf[js.Any])
    
    inline def setGooglePlayAnalyticsUndefined: Self = StObject.set(x, "googlePlayAnalytics", js.undefined)
    
    inline def setItunesConnectAnalytics(value: SchemaITunesConnectAnalytics): Self = StObject.set(x, "itunesConnectAnalytics", value.asInstanceOf[js.Any])
    
    inline def setItunesConnectAnalyticsUndefined: Self = StObject.set(x, "itunesConnectAnalytics", js.undefined)
  }
}
