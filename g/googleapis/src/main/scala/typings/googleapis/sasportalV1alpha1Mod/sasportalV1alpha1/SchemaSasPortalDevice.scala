package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalDevice extends StObject {
  
  /**
    * Output only. Current configuration of the device as registered to the SAS.
    */
  var activeConfig: js.UndefOr[SchemaSasPortalDeviceConfig] = js.undefined
  
  /**
    * Output only. Current channels with scores.
    */
  var currentChannels: js.UndefOr[js.Array[SchemaSasPortalChannelWithScore]] = js.undefined
  
  /**
    * Device parameters that can be overridden by both SAS Portal and SAS registration requests.
    */
  var deviceMetadata: js.UndefOr[SchemaSasPortalDeviceMetadata] = js.undefined
  
  /**
    * Device display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The FCC identifier of the device.
    */
  var fccId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only ranges within the allowlists are available for new grants.
    */
  var grantRangeAllowlists: js.UndefOr[js.Array[SchemaSasPortalFrequencyRange]] = js.undefined
  
  /**
    * Output only. Grants held by the device.
    */
  var grants: js.UndefOr[js.Array[SchemaSasPortalDeviceGrant]] = js.undefined
  
  /**
    * Output only. The resource path name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration of the device, as specified via SAS Portal API.
    */
  var preloadedConfig: js.UndefOr[SchemaSasPortalDeviceConfig] = js.undefined
  
  /**
    * A serial number assigned to the device by the device manufacturer.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Device state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalDevice {
  
  inline def apply(): SchemaSasPortalDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalDevice]
  }
  
  extension [Self <: SchemaSasPortalDevice](x: Self) {
    
    inline def setActiveConfig(value: SchemaSasPortalDeviceConfig): Self = StObject.set(x, "activeConfig", value.asInstanceOf[js.Any])
    
    inline def setActiveConfigUndefined: Self = StObject.set(x, "activeConfig", js.undefined)
    
    inline def setCurrentChannels(value: js.Array[SchemaSasPortalChannelWithScore]): Self = StObject.set(x, "currentChannels", value.asInstanceOf[js.Any])
    
    inline def setCurrentChannelsUndefined: Self = StObject.set(x, "currentChannels", js.undefined)
    
    inline def setCurrentChannelsVarargs(value: SchemaSasPortalChannelWithScore*): Self = StObject.set(x, "currentChannels", js.Array(value*))
    
    inline def setDeviceMetadata(value: SchemaSasPortalDeviceMetadata): Self = StObject.set(x, "deviceMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeviceMetadataUndefined: Self = StObject.set(x, "deviceMetadata", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFccId(value: String): Self = StObject.set(x, "fccId", value.asInstanceOf[js.Any])
    
    inline def setFccIdNull: Self = StObject.set(x, "fccId", null)
    
    inline def setFccIdUndefined: Self = StObject.set(x, "fccId", js.undefined)
    
    inline def setGrantRangeAllowlists(value: js.Array[SchemaSasPortalFrequencyRange]): Self = StObject.set(x, "grantRangeAllowlists", value.asInstanceOf[js.Any])
    
    inline def setGrantRangeAllowlistsUndefined: Self = StObject.set(x, "grantRangeAllowlists", js.undefined)
    
    inline def setGrantRangeAllowlistsVarargs(value: SchemaSasPortalFrequencyRange*): Self = StObject.set(x, "grantRangeAllowlists", js.Array(value*))
    
    inline def setGrants(value: js.Array[SchemaSasPortalDeviceGrant]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
    
    inline def setGrantsVarargs(value: SchemaSasPortalDeviceGrant*): Self = StObject.set(x, "grants", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreloadedConfig(value: SchemaSasPortalDeviceConfig): Self = StObject.set(x, "preloadedConfig", value.asInstanceOf[js.Any])
    
    inline def setPreloadedConfigUndefined: Self = StObject.set(x, "preloadedConfig", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
