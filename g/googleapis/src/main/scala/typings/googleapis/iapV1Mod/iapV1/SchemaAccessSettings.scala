package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessSettings extends StObject {
  
  /**
    * Settings to configure and enable allowed domains.
    */
  var allowedDomainsSettings: js.UndefOr[SchemaAllowedDomainsSettings] = js.undefined
  
  /**
    * Configuration to allow cross-origin requests via IAP.
    */
  var corsSettings: js.UndefOr[SchemaCorsSettings] = js.undefined
  
  /**
    * GCIP claims and endpoint configurations for 3p identity providers.
    */
  var gcipSettings: js.UndefOr[SchemaGcipSettings] = js.undefined
  
  /**
    * Settings to configure IAP's OAuth behavior.
    */
  var oauthSettings: js.UndefOr[SchemaOAuthSettings] = js.undefined
  
  /**
    * Settings to configure Policy delegation for apps hosted in tenant projects. INTERNAL_ONLY.
    */
  var policyDelegationSettings: js.UndefOr[SchemaPolicyDelegationSettings] = js.undefined
  
  /**
    * Settings to configure reauthentication policies in IAP.
    */
  var reauthSettings: js.UndefOr[SchemaReauthSettings] = js.undefined
}
object SchemaAccessSettings {
  
  inline def apply(): SchemaAccessSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessSettings]
  }
  
  extension [Self <: SchemaAccessSettings](x: Self) {
    
    inline def setAllowedDomainsSettings(value: SchemaAllowedDomainsSettings): Self = StObject.set(x, "allowedDomainsSettings", value.asInstanceOf[js.Any])
    
    inline def setAllowedDomainsSettingsUndefined: Self = StObject.set(x, "allowedDomainsSettings", js.undefined)
    
    inline def setCorsSettings(value: SchemaCorsSettings): Self = StObject.set(x, "corsSettings", value.asInstanceOf[js.Any])
    
    inline def setCorsSettingsUndefined: Self = StObject.set(x, "corsSettings", js.undefined)
    
    inline def setGcipSettings(value: SchemaGcipSettings): Self = StObject.set(x, "gcipSettings", value.asInstanceOf[js.Any])
    
    inline def setGcipSettingsUndefined: Self = StObject.set(x, "gcipSettings", js.undefined)
    
    inline def setOauthSettings(value: SchemaOAuthSettings): Self = StObject.set(x, "oauthSettings", value.asInstanceOf[js.Any])
    
    inline def setOauthSettingsUndefined: Self = StObject.set(x, "oauthSettings", js.undefined)
    
    inline def setPolicyDelegationSettings(value: SchemaPolicyDelegationSettings): Self = StObject.set(x, "policyDelegationSettings", value.asInstanceOf[js.Any])
    
    inline def setPolicyDelegationSettingsUndefined: Self = StObject.set(x, "policyDelegationSettings", js.undefined)
    
    inline def setReauthSettings(value: SchemaReauthSettings): Self = StObject.set(x, "reauthSettings", value.asInstanceOf[js.Any])
    
    inline def setReauthSettingsUndefined: Self = StObject.set(x, "reauthSettings", js.undefined)
  }
}
