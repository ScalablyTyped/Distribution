package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Campaign Manager campaign.
  */
@js.native
trait SchemaCampaign extends js.Object {
  
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
    * Lookback window settings for the campaign.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  
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
  implicit class SchemaCampaignOps[Self <: SchemaCampaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdBlockingConfiguration(value: SchemaAdBlockingConfiguration): Self = this.set("adBlockingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdBlockingConfiguration: Self = this.set("adBlockingConfiguration", js.undefined)
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurationsVarargs(value: SchemaCreativeOptimizationConfiguration*): Self = this.set("additionalCreativeOptimizationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCreativeOptimizationConfigurations(value: js.Array[SchemaCreativeOptimizationConfiguration]): Self = this.set("additionalCreativeOptimizationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalCreativeOptimizationConfigurations: Self = this.set("additionalCreativeOptimizationConfigurations", js.undefined)
    
    @scala.inline
    def setAdvertiserGroupId(value: String): Self = this.set("advertiserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserGroupId: Self = this.set("advertiserGroupId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setAudienceSegmentGroupsVarargs(value: SchemaAudienceSegmentGroup*): Self = this.set("audienceSegmentGroups", js.Array(value :_*))
    
    @scala.inline
    def setAudienceSegmentGroups(value: js.Array[SchemaAudienceSegmentGroup]): Self = this.set("audienceSegmentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceSegmentGroups: Self = this.set("audienceSegmentGroups", js.undefined)
    
    @scala.inline
    def setBillingInvoiceCode(value: String): Self = this.set("billingInvoiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingInvoiceCode: Self = this.set("billingInvoiceCode", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = this.set("clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrlSuffixProperties: Self = this.set("clickThroughUrlSuffixProperties", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: SchemaLastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    
    @scala.inline
    def setCreativeGroupIdsVarargs(value: String*): Self = this.set("creativeGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroupIds(value: js.Array[String]): Self = this.set("creativeGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupIds: Self = this.set("creativeGroupIds", js.undefined)
    
    @scala.inline
    def setCreativeOptimizationConfiguration(value: SchemaCreativeOptimizationConfiguration): Self = this.set("creativeOptimizationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeOptimizationConfiguration: Self = this.set("creativeOptimizationConfiguration", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = this.set("defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClickThroughEventTagProperties: Self = this.set("defaultClickThroughEventTagProperties", js.undefined)
    
    @scala.inline
    def setDefaultLandingPageId(value: String): Self = this.set("defaultLandingPageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLandingPageId: Self = this.set("defaultLandingPageId", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEventTagOverridesVarargs(value: SchemaEventTagOverride*): Self = this.set("eventTagOverrides", js.Array(value :_*))
    
    @scala.inline
    def setEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = this.set("eventTagOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTagOverrides: Self = this.set("eventTagOverrides", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: SchemaLookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNielsenOcrEnabled(value: Boolean): Self = this.set("nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenOcrEnabled: Self = this.set("nielsenOcrEnabled", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTraffickerEmailsVarargs(value: String*): Self = this.set("traffickerEmails", js.Array(value :_*))
    
    @scala.inline
    def setTraffickerEmails(value: js.Array[String]): Self = this.set("traffickerEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraffickerEmails: Self = this.set("traffickerEmails", js.undefined)
  }
}
