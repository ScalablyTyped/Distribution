package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserCreativeConfig extends StObject {
  
  /**
    * Whether or not the advertiser is enabled for dynamic creatives.
    */
  var dynamicCreativeEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360 system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
    */
  var iasClientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not to use DV360's Online Behavioral Advertising (OBA) compliance. Warning: Changing OBA settings may cause the audit status of your creatives to be reset by some ad exchanges, making them ineligible to serve until they are re-approved.
    */
  var obaComplianceDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * By setting this field to `true`, you, on behalf of your company, authorize Google to use video creatives associated with this Display & Video 360 advertiser to provide reporting and features related to the advertiser's television campaigns. Applicable only when the advertiser has a CM360 hybrid ad server configuration.
    */
  var videoCreativeDataSharingAuthorized: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAdvertiserCreativeConfig {
  
  inline def apply(): SchemaAdvertiserCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserCreativeConfig]
  }
  
  extension [Self <: SchemaAdvertiserCreativeConfig](x: Self) {
    
    inline def setDynamicCreativeEnabled(value: Boolean): Self = StObject.set(x, "dynamicCreativeEnabled", value.asInstanceOf[js.Any])
    
    inline def setDynamicCreativeEnabledNull: Self = StObject.set(x, "dynamicCreativeEnabled", null)
    
    inline def setDynamicCreativeEnabledUndefined: Self = StObject.set(x, "dynamicCreativeEnabled", js.undefined)
    
    inline def setIasClientId(value: String): Self = StObject.set(x, "iasClientId", value.asInstanceOf[js.Any])
    
    inline def setIasClientIdNull: Self = StObject.set(x, "iasClientId", null)
    
    inline def setIasClientIdUndefined: Self = StObject.set(x, "iasClientId", js.undefined)
    
    inline def setObaComplianceDisabled(value: Boolean): Self = StObject.set(x, "obaComplianceDisabled", value.asInstanceOf[js.Any])
    
    inline def setObaComplianceDisabledNull: Self = StObject.set(x, "obaComplianceDisabled", null)
    
    inline def setObaComplianceDisabledUndefined: Self = StObject.set(x, "obaComplianceDisabled", js.undefined)
    
    inline def setVideoCreativeDataSharingAuthorized(value: Boolean): Self = StObject.set(x, "videoCreativeDataSharingAuthorized", value.asInstanceOf[js.Any])
    
    inline def setVideoCreativeDataSharingAuthorizedNull: Self = StObject.set(x, "videoCreativeDataSharingAuthorized", null)
    
    inline def setVideoCreativeDataSharingAuthorizedUndefined: Self = StObject.set(x, "videoCreativeDataSharingAuthorized", js.undefined)
  }
}
