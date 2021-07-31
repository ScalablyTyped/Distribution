package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Campaign extends StObject {
  
  /** Account ID of this campaign. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Ad blocking settings for this campaign. */
  var adBlockingConfiguration: js.UndefOr[AdBlockingConfiguration] = js.undefined
  
  /** Additional creative optimization configurations for the campaign. */
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[CreativeOptimizationConfiguration]] = js.undefined
  
  /** Advertiser group ID of the associated advertiser. */
  var advertiserGroupId: js.UndefOr[String] = js.undefined
  
  /** Advertiser ID of this campaign. This is a required field. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the advertiser ID of this campaign. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether this campaign has been archived. */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /** Audience segment groups assigned to this campaign. Cannot have more than 300 segment groups. */
  var audienceSegmentGroups: js.UndefOr[js.Array[AudienceSegmentGroup]] = js.undefined
  
  /** Billing invoice code included in the Campaign Manager client billing invoices associated with the campaign. */
  var billingInvoiceCode: js.UndefOr[String] = js.undefined
  
  /** Click-through URL suffix override properties for this campaign. */
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.undefined
  
  /** Arbitrary comments about this campaign. Must be less than 256 characters long. */
  var comment: js.UndefOr[String] = js.undefined
  
  /** Information about the creation of this campaign. This is a read-only field. */
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  
  /** List of creative group IDs that are assigned to the campaign. */
  var creativeGroupIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Creative optimization configuration for the campaign. */
  var creativeOptimizationConfiguration: js.UndefOr[CreativeOptimizationConfiguration] = js.undefined
  
  /** Click-through event tag ID override properties for this campaign. */
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.undefined
  
  /** The default landing page ID for this campaign. */
  var defaultLandingPageId: js.UndefOr[String] = js.undefined
  
  var endDate: js.UndefOr[String] = js.undefined
  
  /** Overrides that can be used to activate or deactivate advertiser event tags. */
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.undefined
  
  /** External ID for this campaign. */
  var externalId: js.UndefOr[String] = js.undefined
  
  /** ID of this campaign. This is a read-only auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of this campaign. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaign". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Information about the most recent modification of this campaign. This is a read-only field. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  
  /** Name of this campaign. This is a required field and must be less than 256 characters long and unique among campaigns of the same advertiser. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Whether Nielsen reports are enabled for this campaign. */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this campaign. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /** Campaign trafficker contact emails. */
  var traffickerEmails: js.UndefOr[js.Array[String]] = js.undefined
}
object Campaign {
  
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  
  @scala.inline
  implicit class CampaignMutableBuilder[Self <: Campaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdBlockingConfiguration(value: AdBlockingConfiguration): Self = StObject.set(x, "adBlockingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdBlockingConfigurationUndefined: Self = StObject.set(x, "adBlockingConfiguration", js.undefined)
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurations(value: js.Array[CreativeOptimizationConfiguration]): Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurationsUndefined: Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", js.undefined)
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurationsVarargs(value: CreativeOptimizationConfiguration*): Self = StObject.set(x, "additionalCreativeOptimizationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserGroupId(value: String): Self = StObject.set(x, "advertiserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserGroupIdUndefined: Self = StObject.set(x, "advertiserGroupId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setAudienceSegmentGroups(value: js.Array[AudienceSegmentGroup]): Self = StObject.set(x, "audienceSegmentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceSegmentGroupsUndefined: Self = StObject.set(x, "audienceSegmentGroups", js.undefined)
    
    @scala.inline
    def setAudienceSegmentGroupsVarargs(value: AudienceSegmentGroup*): Self = StObject.set(x, "audienceSegmentGroups", js.Array(value :_*))
    
    @scala.inline
    def setBillingInvoiceCode(value: String): Self = StObject.set(x, "billingInvoiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingInvoiceCodeUndefined: Self = StObject.set(x, "billingInvoiceCode", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffixProperties(value: ClickThroughUrlSuffixProperties): Self = StObject.set(x, "clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlSuffixPropertiesUndefined: Self = StObject.set(x, "clickThroughUrlSuffixProperties", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: LastModifiedInfo): Self = StObject.set(x, "createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInfoUndefined: Self = StObject.set(x, "createInfo", js.undefined)
    
    @scala.inline
    def setCreativeGroupIds(value: js.Array[String]): Self = StObject.set(x, "creativeGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupIdsUndefined: Self = StObject.set(x, "creativeGroupIds", js.undefined)
    
    @scala.inline
    def setCreativeGroupIdsVarargs(value: String*): Self = StObject.set(x, "creativeGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeOptimizationConfiguration(value: CreativeOptimizationConfiguration): Self = StObject.set(x, "creativeOptimizationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeOptimizationConfigurationUndefined: Self = StObject.set(x, "creativeOptimizationConfiguration", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagProperties(value: DefaultClickThroughEventTagProperties): Self = StObject.set(x, "defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
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
    def setEventTagOverrides(value: js.Array[EventTagOverride]): Self = StObject.set(x, "eventTagOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTagOverridesUndefined: Self = StObject.set(x, "eventTagOverrides", js.undefined)
    
    @scala.inline
    def setEventTagOverridesVarargs(value: EventTagOverride*): Self = StObject.set(x, "eventTagOverrides", js.Array(value :_*))
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
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
