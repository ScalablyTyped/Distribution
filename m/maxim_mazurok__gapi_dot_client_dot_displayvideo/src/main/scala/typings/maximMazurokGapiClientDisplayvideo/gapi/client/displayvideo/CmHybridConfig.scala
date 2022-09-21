package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmHybridConfig extends StObject {
  
  /** Required. Immutable. Account ID of the CM360 Floodlight configuration linked with the DV360 advertiser. */
  var cmAccountId: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. ID of the CM360 Floodlight configuration linked with the DV360 advertiser. */
  var cmFloodlightConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. By setting this field to `true`, you, on behalf of your company, authorize the sharing of information from the given Floodlight configuration to this Display &
    * Video 360 advertiser.
    */
  var cmFloodlightLinkingAuthorized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of CM360 sites whose placements will be synced to DV360 as creatives. If absent or empty in CreateAdvertiser method, the system will automatically create a CM360 site.
    * Removing sites from this list may cause DV360 creatives synced from CM360 to be deleted. At least one site must be specified.
    */
  var cmSyncableSiteIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether or not to report DV360 cost to CM360. */
  var dv360ToCmCostReportingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to include DV360 data in CM360 data transfer reports. */
  var dv360ToCmDataSharingEnabled: js.UndefOr[Boolean] = js.undefined
}
object CmHybridConfig {
  
  inline def apply(): CmHybridConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmHybridConfig]
  }
  
  extension [Self <: CmHybridConfig](x: Self) {
    
    inline def setCmAccountId(value: String): Self = StObject.set(x, "cmAccountId", value.asInstanceOf[js.Any])
    
    inline def setCmAccountIdUndefined: Self = StObject.set(x, "cmAccountId", js.undefined)
    
    inline def setCmFloodlightConfigId(value: String): Self = StObject.set(x, "cmFloodlightConfigId", value.asInstanceOf[js.Any])
    
    inline def setCmFloodlightConfigIdUndefined: Self = StObject.set(x, "cmFloodlightConfigId", js.undefined)
    
    inline def setCmFloodlightLinkingAuthorized(value: Boolean): Self = StObject.set(x, "cmFloodlightLinkingAuthorized", value.asInstanceOf[js.Any])
    
    inline def setCmFloodlightLinkingAuthorizedUndefined: Self = StObject.set(x, "cmFloodlightLinkingAuthorized", js.undefined)
    
    inline def setCmSyncableSiteIds(value: js.Array[String]): Self = StObject.set(x, "cmSyncableSiteIds", value.asInstanceOf[js.Any])
    
    inline def setCmSyncableSiteIdsUndefined: Self = StObject.set(x, "cmSyncableSiteIds", js.undefined)
    
    inline def setCmSyncableSiteIdsVarargs(value: String*): Self = StObject.set(x, "cmSyncableSiteIds", js.Array(value*))
    
    inline def setDv360ToCmCostReportingEnabled(value: Boolean): Self = StObject.set(x, "dv360ToCmCostReportingEnabled", value.asInstanceOf[js.Any])
    
    inline def setDv360ToCmCostReportingEnabledUndefined: Self = StObject.set(x, "dv360ToCmCostReportingEnabled", js.undefined)
    
    inline def setDv360ToCmDataSharingEnabled(value: Boolean): Self = StObject.set(x, "dv360ToCmDataSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setDv360ToCmDataSharingEnabledUndefined: Self = StObject.set(x, "dv360ToCmDataSharingEnabled", js.undefined)
  }
}
