package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCampaign extends StObject {
  
  /**
    * Account ID of this campaign. This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ad blocking settings for this campaign.
    */
  var adBlockingConfiguration: js.UndefOr[SchemaAdBlockingConfiguration] = js.undefined
  
  /**
    * Additional creative optimization configurations for the campaign.
    */
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[SchemaCreativeOptimizationConfiguration]] = js.undefined
  
  /**
    * Advertiser group ID of the associated advertiser.
    */
  var advertiserGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser ID of this campaign. This is a required field.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the advertiser ID of this campaign. This is a read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether this campaign has been archived.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Audience segment groups assigned to this campaign. Cannot have more than 300 segment groups.
    */
  var audienceSegmentGroups: js.UndefOr[js.Array[SchemaAudienceSegmentGroup]] = js.undefined
  
  /**
    * Billing invoice code included in the Campaign Manager client billing invoices associated with the campaign.
    */
  var billingInvoiceCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Click-through URL suffix override properties for this campaign.
    */
  var clickThroughUrlSuffixProperties: js.UndefOr[SchemaClickThroughUrlSuffixProperties] = js.undefined
  
  /**
    * Arbitrary comments about this campaign. Must be less than 256 characters long.
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the creation of this campaign. This is a read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * List of creative group IDs that are assigned to the campaign.
    */
  var creativeGroupIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Creative optimization configuration for the campaign.
    */
  var creativeOptimizationConfiguration: js.UndefOr[SchemaCreativeOptimizationConfiguration] = js.undefined
  
  /**
    * Click-through event tag ID override properties for this campaign.
    */
  var defaultClickThroughEventTagProperties: js.UndefOr[SchemaDefaultClickThroughEventTagProperties] = js.undefined
  
  /**
    * The default landing page ID for this campaign.
    */
  var defaultLandingPageId: js.UndefOr[String | Null] = js.undefined
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Overrides that can be used to activate or deactivate advertiser event tags.
    */
  var eventTagOverrides: js.UndefOr[js.Array[SchemaEventTagOverride]] = js.undefined
  
  /**
    * External ID for this campaign.
    */
  var externalId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this campaign. This is a read-only auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of this campaign. This is a read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaign".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the most recent modification of this campaign. This is a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Name of this campaign. This is a required field and must be less than 256 characters long and unique among campaigns of the same advertiser.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether Nielsen reports are enabled for this campaign.
    */
  var nielsenOcrEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this campaign. This is a read-only field that can be left blank.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Campaign trafficker contact emails.
    */
  var traffickerEmails: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCampaign {
  
  inline def apply(): SchemaCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaign]
  }
  
  extension [Self <: SchemaCampaign](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdBlockingConfiguration(value: SchemaAdBlockingConfiguration): Self = StObject.set(x, "adBlockingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdBlockingConfigurationUndefined: Self = StObject.set(x, "adBlockingConfiguration", js.undefined)
    
    inline def setAdditionalCreativeOptimizationConfigurations(value: js.Array[SchemaCreativeOptimizationConfiguration]): Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCreativeOptimizationConfigurationsUndefined: Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", js.undefined)
    
    inline def setAdditionalCreativeOptimizationConfigurationsVarargs(value: SchemaCreativeOptimizationConfiguration*): Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", js.Array(value*))
    
    inline def setAdvertiserGroupId(value: String): Self = StObject.set(x, "advertiserGroupId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserGroupIdNull: Self = StObject.set(x, "advertiserGroupId", null)
    
    inline def setAdvertiserGroupIdUndefined: Self = StObject.set(x, "advertiserGroupId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setAudienceSegmentGroups(value: js.Array[SchemaAudienceSegmentGroup]): Self = StObject.set(x, "audienceSegmentGroups", value.asInstanceOf[js.Any])
    
    inline def setAudienceSegmentGroupsUndefined: Self = StObject.set(x, "audienceSegmentGroups", js.undefined)
    
    inline def setAudienceSegmentGroupsVarargs(value: SchemaAudienceSegmentGroup*): Self = StObject.set(x, "audienceSegmentGroups", js.Array(value*))
    
    inline def setBillingInvoiceCode(value: String): Self = StObject.set(x, "billingInvoiceCode", value.asInstanceOf[js.Any])
    
    inline def setBillingInvoiceCodeNull: Self = StObject.set(x, "billingInvoiceCode", null)
    
    inline def setBillingInvoiceCodeUndefined: Self = StObject.set(x, "billingInvoiceCode", js.undefined)
    
    inline def setClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = StObject.set(x, "clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlSuffixPropertiesUndefined: Self = StObject.set(x, "clickThroughUrlSuffixProperties", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreateInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createInfo", value.asInstanceOf[js.Any])
    
    inline def setCreateInfoUndefined: Self = StObject.set(x, "createInfo", js.undefined)
    
    inline def setCreativeGroupIds(value: js.Array[String]): Self = StObject.set(x, "creativeGroupIds", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupIdsNull: Self = StObject.set(x, "creativeGroupIds", null)
    
    inline def setCreativeGroupIdsUndefined: Self = StObject.set(x, "creativeGroupIds", js.undefined)
    
    inline def setCreativeGroupIdsVarargs(value: String*): Self = StObject.set(x, "creativeGroupIds", js.Array(value*))
    
    inline def setCreativeOptimizationConfiguration(value: SchemaCreativeOptimizationConfiguration): Self = StObject.set(x, "creativeOptimizationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCreativeOptimizationConfigurationUndefined: Self = StObject.set(x, "creativeOptimizationConfiguration", js.undefined)
    
    inline def setDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = StObject.set(x, "defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
    inline def setDefaultClickThroughEventTagPropertiesUndefined: Self = StObject.set(x, "defaultClickThroughEventTagProperties", js.undefined)
    
    inline def setDefaultLandingPageId(value: String): Self = StObject.set(x, "defaultLandingPageId", value.asInstanceOf[js.Any])
    
    inline def setDefaultLandingPageIdNull: Self = StObject.set(x, "defaultLandingPageId", null)
    
    inline def setDefaultLandingPageIdUndefined: Self = StObject.set(x, "defaultLandingPageId", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = StObject.set(x, "eventTagOverrides", value.asInstanceOf[js.Any])
    
    inline def setEventTagOverridesUndefined: Self = StObject.set(x, "eventTagOverrides", js.undefined)
    
    inline def setEventTagOverridesVarargs(value: SchemaEventTagOverride*): Self = StObject.set(x, "eventTagOverrides", js.Array(value*))
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNielsenOcrEnabled(value: Boolean): Self = StObject.set(x, "nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    inline def setNielsenOcrEnabledNull: Self = StObject.set(x, "nielsenOcrEnabled", null)
    
    inline def setNielsenOcrEnabledUndefined: Self = StObject.set(x, "nielsenOcrEnabled", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTraffickerEmails(value: js.Array[String]): Self = StObject.set(x, "traffickerEmails", value.asInstanceOf[js.Any])
    
    inline def setTraffickerEmailsNull: Self = StObject.set(x, "traffickerEmails", null)
    
    inline def setTraffickerEmailsUndefined: Self = StObject.set(x, "traffickerEmails", js.undefined)
    
    inline def setTraffickerEmailsVarargs(value: String*): Self = StObject.set(x, "traffickerEmails", js.Array(value*))
  }
}
