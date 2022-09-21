package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdUnit extends StObject {
  
  /**
    * Required. Settings specific to content ads (AFC).
    */
  var contentAdsSettings: js.UndefOr[SchemaContentAdsSettings] = js.undefined
  
  /**
    * Required. Display name of the ad unit, as provided when the ad unit was created.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the ad unit. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique ID of the ad unit as used in the `AD_UNIT_ID` reporting dimension.
    */
  var reportingDimensionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of the ad unit.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdUnit {
  
  inline def apply(): SchemaAdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdUnit]
  }
  
  extension [Self <: SchemaAdUnit](x: Self) {
    
    inline def setContentAdsSettings(value: SchemaContentAdsSettings): Self = StObject.set(x, "contentAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setContentAdsSettingsUndefined: Self = StObject.set(x, "contentAdsSettings", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdNull: Self = StObject.set(x, "reportingDimensionId", null)
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
