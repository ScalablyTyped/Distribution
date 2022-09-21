package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiser extends StObject {
  
  /**
    * Required. Immutable. Ad server related settings of the advertiser.
    */
  var adServerConfig: js.UndefOr[SchemaAdvertiserAdServerConfig] = js.undefined
  
  /**
    * Output only. The unique ID of the advertiser. Assigned by the system.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Creative related settings of the advertiser.
    */
  var creativeConfig: js.UndefOr[SchemaAdvertiserCreativeConfig] = js.undefined
  
  /**
    * Settings that control how advertiser data may be accessed.
    */
  var dataAccessConfig: js.UndefOr[SchemaAdvertiserDataAccessConfig] = js.undefined
  
  /**
    * Required. The display name of the advertiser. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Controls whether or not insertion orders and line items of the advertiser can spend their budgets and bid on inventory. * Accepted values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_PAUSED` and `ENTITY_STATUS_SCHEDULED_FOR_DELETION`. * If set to `ENTITY_STATUS_SCHEDULED_FOR_DELETION`, the advertiser will be deleted 30 days from when it was first scheduled for deletion.
    */
  var entityStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. General settings of the advertiser.
    */
  var generalConfig: js.UndefOr[SchemaAdvertiserGeneralConfig] = js.undefined
  
  /**
    * Integration details of the advertiser. Only integrationCode is currently applicable to advertiser. Other fields of IntegrationDetails are not supported and will be ignored if provided.
    */
  var integrationDetails: js.UndefOr[SchemaIntegrationDetails] = js.undefined
  
  /**
    * Output only. The resource name of the advertiser.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The unique ID of the partner that the advertiser belongs to.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether integration with Mediaocean (Prisma) is enabled. By enabling this, you agree to the following: On behalf of my company, I authorize Mediaocean (Prisma) to send budget segment plans to Google, and I authorize Google to send corresponding reporting and invoices from DV360 to Mediaocean for the purposes of budget planning, billing, and reconciliation for this advertiser.
    */
  var prismaEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Targeting settings related to ad serving of the advertiser.
    */
  var servingConfig: js.UndefOr[SchemaAdvertiserTargetingConfig] = js.undefined
  
  /**
    * Output only. The timestamp when the advertiser was last updated. Assigned by the system.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvertiser {
  
  inline def apply(): SchemaAdvertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiser]
  }
  
  extension [Self <: SchemaAdvertiser](x: Self) {
    
    inline def setAdServerConfig(value: SchemaAdvertiserAdServerConfig): Self = StObject.set(x, "adServerConfig", value.asInstanceOf[js.Any])
    
    inline def setAdServerConfigUndefined: Self = StObject.set(x, "adServerConfig", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCreativeConfig(value: SchemaAdvertiserCreativeConfig): Self = StObject.set(x, "creativeConfig", value.asInstanceOf[js.Any])
    
    inline def setCreativeConfigUndefined: Self = StObject.set(x, "creativeConfig", js.undefined)
    
    inline def setDataAccessConfig(value: SchemaAdvertiserDataAccessConfig): Self = StObject.set(x, "dataAccessConfig", value.asInstanceOf[js.Any])
    
    inline def setDataAccessConfigUndefined: Self = StObject.set(x, "dataAccessConfig", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusNull: Self = StObject.set(x, "entityStatus", null)
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setGeneralConfig(value: SchemaAdvertiserGeneralConfig): Self = StObject.set(x, "generalConfig", value.asInstanceOf[js.Any])
    
    inline def setGeneralConfigUndefined: Self = StObject.set(x, "generalConfig", js.undefined)
    
    inline def setIntegrationDetails(value: SchemaIntegrationDetails): Self = StObject.set(x, "integrationDetails", value.asInstanceOf[js.Any])
    
    inline def setIntegrationDetailsUndefined: Self = StObject.set(x, "integrationDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setPrismaEnabled(value: Boolean): Self = StObject.set(x, "prismaEnabled", value.asInstanceOf[js.Any])
    
    inline def setPrismaEnabledNull: Self = StObject.set(x, "prismaEnabled", null)
    
    inline def setPrismaEnabledUndefined: Self = StObject.set(x, "prismaEnabled", js.undefined)
    
    inline def setServingConfig(value: SchemaAdvertiserTargetingConfig): Self = StObject.set(x, "servingConfig", value.asInstanceOf[js.Any])
    
    inline def setServingConfigUndefined: Self = StObject.set(x, "servingConfig", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
