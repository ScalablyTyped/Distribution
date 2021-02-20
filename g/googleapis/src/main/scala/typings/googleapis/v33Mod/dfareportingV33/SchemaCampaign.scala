package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Campaign Manager campaign.
  */
@js.native
trait SchemaCampaign extends StObject {
  
  /**
    * Account ID of this campaign. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Ad blocking settings for this campaign.
    */
  var adBlockingConfiguration: js.UndefOr[SchemaAdBlockingConfiguration] = js.native
  
  /**
    * Additional creative optimization configurations for the campaign.
    */
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[SchemaCreativeOptimizationConfiguration]] = js.native
  
  /**
    * Advertiser group ID of the associated advertiser.
    */
  var advertiserGroupId: js.UndefOr[String] = js.native
  
  /**
    * Advertiser ID of this campaign. This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the advertiser ID of this campaign. This is a
    * read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether this campaign has been archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Audience segment groups assigned to this campaign. Cannot have more than
    * 300 segment groups.
    */
  var audienceSegmentGroups: js.UndefOr[js.Array[SchemaAudienceSegmentGroup]] = js.native
  
  /**
    * Billing invoice code included in the Campaign Manager client billing
    * invoices associated with the campaign.
    */
  var billingInvoiceCode: js.UndefOr[String] = js.native
  
  /**
    * Click-through URL suffix override properties for this campaign.
    */
  var clickThroughUrlSuffixProperties: js.UndefOr[SchemaClickThroughUrlSuffixProperties] = js.native
  
  /**
    * Arbitrary comments about this campaign. Must be less than 256 characters
    * long.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Information about the creation of this campaign. This is a read-only
    * field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * List of creative group IDs that are assigned to the campaign.
    */
  var creativeGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Creative optimization configuration for the campaign.
    */
  var creativeOptimizationConfiguration: js.UndefOr[SchemaCreativeOptimizationConfiguration] = js.native
  
  /**
    * Click-through event tag ID override properties for this campaign.
    */
  var defaultClickThroughEventTagProperties: js.UndefOr[SchemaDefaultClickThroughEventTagProperties] = js.native
  
  /**
    * The default landing page ID for this campaign.
    */
  var defaultLandingPageId: js.UndefOr[String] = js.native
  
  /**
    * Date on which the campaign will stop running. On insert, the end date
    * must be today or a future date. The end date must be later than or be the
    * same as the start date. If, for example, you set 6/25/2015 as both the
    * start and end dates, the effective campaign run date is just that day
    * only, 6/25/2015. The hours, minutes, and seconds of the end date should
    * not be set, as doing so will result in an error. This is a required
    * field.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * Overrides that can be used to activate or deactivate advertiser event
    * tags.
    */
  var eventTagOverrides: js.UndefOr[js.Array[SchemaEventTagOverride]] = js.native
  
  /**
    * External ID for this campaign.
    */
  var externalId: js.UndefOr[String] = js.native
  
  /**
    * ID of this campaign. This is a read-only auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of this campaign. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaign&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Information about the most recent modification of this campaign. This is
    * a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Name of this campaign. This is a required field and must be less than 256
    * characters long and unique among campaigns of the same advertiser.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether Nielsen reports are enabled for this campaign.
    */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Date on which the campaign starts running. The start date can be any
    * date. The hours, minutes, and seconds of the start date should not be
    * set, as doing so will result in an error. This is a required field.
    */
  var startDate: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this campaign. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Campaign trafficker contact emails.
    */
  var traffickerEmails: js.UndefOr[js.Array[String]] = js.native
}
object SchemaCampaign {
  
  @scala.inline
  def apply(): SchemaCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaign]
  }
  
  @scala.inline
  implicit class SchemaCampaignMutableBuilder[Self <: SchemaCampaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdBlockingConfiguration(value: SchemaAdBlockingConfiguration): Self = StObject.set(x, "adBlockingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdBlockingConfigurationUndefined: Self = StObject.set(x, "adBlockingConfiguration", js.undefined)
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurations(value: js.Array[SchemaCreativeOptimizationConfiguration]): Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurationsUndefined: Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", js.undefined)
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurationsVarargs(value: SchemaCreativeOptimizationConfiguration*): Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserGroupId(value: String): Self = StObject.set(x, "advertiserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserGroupIdUndefined: Self = StObject.set(x, "advertiserGroupId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setAudienceSegmentGroups(value: js.Array[SchemaAudienceSegmentGroup]): Self = StObject.set(x, "audienceSegmentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceSegmentGroupsUndefined: Self = StObject.set(x, "audienceSegmentGroups", js.undefined)
    
    @scala.inline
    def setAudienceSegmentGroupsVarargs(value: SchemaAudienceSegmentGroup*): Self = StObject.set(x, "audienceSegmentGroups", js.Array(value :_*))
    
    @scala.inline
    def setBillingInvoiceCode(value: String): Self = StObject.set(x, "billingInvoiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingInvoiceCodeUndefined: Self = StObject.set(x, "billingInvoiceCode", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = StObject.set(x, "clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlSuffixPropertiesUndefined: Self = StObject.set(x, "clickThroughUrlSuffixProperties", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInfoUndefined: Self = StObject.set(x, "createInfo", js.undefined)
    
    @scala.inline
    def setCreativeGroupIds(value: js.Array[String]): Self = StObject.set(x, "creativeGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupIdsUndefined: Self = StObject.set(x, "creativeGroupIds", js.undefined)
    
    @scala.inline
    def setCreativeGroupIdsVarargs(value: String*): Self = StObject.set(x, "creativeGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeOptimizationConfiguration(value: SchemaCreativeOptimizationConfiguration): Self = StObject.set(x, "creativeOptimizationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeOptimizationConfigurationUndefined: Self = StObject.set(x, "creativeOptimizationConfiguration", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = StObject.set(x, "defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClickThroughEventTagPropertiesUndefined: Self = StObject.set(x, "defaultClickThroughEventTagProperties", js.undefined)
    
    @scala.inline
    def setDefaultLandingPageId(value: String): Self = StObject.set(x, "defaultLandingPageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLandingPageIdUndefined: Self = StObject.set(x, "defaultLandingPageId", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = StObject.set(x, "eventTagOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTagOverridesUndefined: Self = StObject.set(x, "eventTagOverrides", js.undefined)
    
    @scala.inline
    def setEventTagOverridesVarargs(value: SchemaEventTagOverride*): Self = StObject.set(x, "eventTagOverrides", js.Array(value :_*))
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNielsenOcrEnabled(value: Boolean): Self = StObject.set(x, "nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenOcrEnabledUndefined: Self = StObject.set(x, "nielsenOcrEnabled", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTraffickerEmails(value: js.Array[String]): Self = StObject.set(x, "traffickerEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffickerEmailsUndefined: Self = StObject.set(x, "traffickerEmails", js.undefined)
    
    @scala.inline
    def setTraffickerEmailsVarargs(value: String*): Self = StObject.set(x, "traffickerEmails", js.Array(value :_*))
  }
}
