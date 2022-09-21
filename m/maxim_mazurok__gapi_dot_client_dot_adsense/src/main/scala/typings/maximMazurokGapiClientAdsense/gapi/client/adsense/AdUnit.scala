package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUnit extends StObject {
  
  /** Required. Settings specific to content ads (AFC). */
  var contentAdsSettings: js.UndefOr[ContentAdsSettings] = js.undefined
  
  /** Required. Display name of the ad unit, as provided when the ad unit was created. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of the ad unit. Format: accounts/{account}/adclients/{adclient}/adunits/{adunit} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Unique ID of the ad unit as used in the `AD_UNIT_ID` reporting dimension. */
  var reportingDimensionId: js.UndefOr[String] = js.undefined
  
  /** State of the ad unit. */
  var state: js.UndefOr[String] = js.undefined
}
object AdUnit {
  
  inline def apply(): AdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnit]
  }
  
  extension [Self <: AdUnit](x: Self) {
    
    inline def setContentAdsSettings(value: ContentAdsSettings): Self = StObject.set(x, "contentAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setContentAdsSettingsUndefined: Self = StObject.set(x, "contentAdsSettings", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
