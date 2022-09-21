package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiser extends StObject {
  
  /**
    * Account ID of this advertiser.This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the advertiser group this advertiser belongs to. You can group advertisers for reporting purposes, allowing you to see aggregated information for all advertisers in each group.
    */
  var advertiserGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suffix added to click-through URL of ad creative associations under this advertiser. Must be less than 129 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the click-through event tag to apply by default to the landing pages of this advertiser's campaigns.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Default email address used in sender field for tag emails.
    */
  var defaultEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floodlight configuration ID of this advertiser. The floodlight configuration ID will be created automatically, so on insert this field should be left blank. This field can be set to another advertiser's floodlight configuration ID in order to share that advertiser's floodlight configuration with this advertiser, so long as: - This advertiser's original floodlight configuration is not already associated with floodlight activities or floodlight activity groups. - This advertiser's original floodlight configuration is not already shared with another advertiser.
    */
  var floodlightConfigurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * ID of this advertiser. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of this advertiser. This is a read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiser".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Measurement partner advertiser link for tag wrapping.
    */
  var measurementPartnerLink: js.UndefOr[SchemaMeasurementPartnerAdvertiserLink] = js.undefined
  
  /**
    * Name of this advertiser. This is a required field and must be less than 256 characters long and unique among advertisers of the same account.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Original floodlight configuration before any sharing occurred. Set the floodlightConfigurationId of this advertiser to originalFloodlightConfigurationId to unshare the advertiser's current floodlight configuration. You cannot unshare an advertiser's floodlight configuration if the shared configuration has activities associated with any campaign or placement.
    */
  var originalFloodlightConfigurationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of this advertiser.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this advertiser.This is a read-only field that can be left blank.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suspension status of this advertiser.
    */
  var suspended: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAdvertiser {
  
  inline def apply(): SchemaAdvertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiser]
  }
  
  extension [Self <: SchemaAdvertiser](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserGroupId(value: String): Self = StObject.set(x, "advertiserGroupId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserGroupIdNull: Self = StObject.set(x, "advertiserGroupId", null)
    
    inline def setAdvertiserGroupIdUndefined: Self = StObject.set(x, "advertiserGroupId", js.undefined)
    
    inline def setClickThroughUrlSuffix(value: String): Self = StObject.set(x, "clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlSuffixNull: Self = StObject.set(x, "clickThroughUrlSuffix", null)
    
    inline def setClickThroughUrlSuffixUndefined: Self = StObject.set(x, "clickThroughUrlSuffix", js.undefined)
    
    inline def setDefaultClickThroughEventTagId(value: String): Self = StObject.set(x, "defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    inline def setDefaultClickThroughEventTagIdNull: Self = StObject.set(x, "defaultClickThroughEventTagId", null)
    
    inline def setDefaultClickThroughEventTagIdUndefined: Self = StObject.set(x, "defaultClickThroughEventTagId", js.undefined)
    
    inline def setDefaultEmail(value: String): Self = StObject.set(x, "defaultEmail", value.asInstanceOf[js.Any])
    
    inline def setDefaultEmailNull: Self = StObject.set(x, "defaultEmail", null)
    
    inline def setDefaultEmailUndefined: Self = StObject.set(x, "defaultEmail", js.undefined)
    
    inline def setFloodlightConfigurationId(value: String): Self = StObject.set(x, "floodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigurationIdDimensionValueUndefined: Self = StObject.set(x, "floodlightConfigurationIdDimensionValue", js.undefined)
    
    inline def setFloodlightConfigurationIdNull: Self = StObject.set(x, "floodlightConfigurationId", null)
    
    inline def setFloodlightConfigurationIdUndefined: Self = StObject.set(x, "floodlightConfigurationId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMeasurementPartnerLink(value: SchemaMeasurementPartnerAdvertiserLink): Self = StObject.set(x, "measurementPartnerLink", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerLinkUndefined: Self = StObject.set(x, "measurementPartnerLink", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalFloodlightConfigurationId(value: String): Self = StObject.set(x, "originalFloodlightConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setOriginalFloodlightConfigurationIdNull: Self = StObject.set(x, "originalFloodlightConfigurationId", null)
    
    inline def setOriginalFloodlightConfigurationIdUndefined: Self = StObject.set(x, "originalFloodlightConfigurationId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
  }
}
