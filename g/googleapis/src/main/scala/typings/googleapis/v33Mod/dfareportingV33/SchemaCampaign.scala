package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    accountId: String = null,
    adBlockingConfiguration: SchemaAdBlockingConfiguration = null,
    additionalCreativeOptimizationConfigurations: js.Array[SchemaCreativeOptimizationConfiguration] = null,
    advertiserGroupId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: SchemaDimensionValue = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    audienceSegmentGroups: js.Array[SchemaAudienceSegmentGroup] = null,
    billingInvoiceCode: String = null,
    clickThroughUrlSuffixProperties: SchemaClickThroughUrlSuffixProperties = null,
    comment: String = null,
    createInfo: SchemaLastModifiedInfo = null,
    creativeGroupIds: js.Array[String] = null,
    creativeOptimizationConfiguration: SchemaCreativeOptimizationConfiguration = null,
    defaultClickThroughEventTagProperties: SchemaDefaultClickThroughEventTagProperties = null,
    defaultLandingPageId: String = null,
    endDate: String = null,
    eventTagOverrides: js.Array[SchemaEventTagOverride] = null,
    externalId: String = null,
    id: String = null,
    idDimensionValue: SchemaDimensionValue = null,
    kind: String = null,
    lastModifiedInfo: SchemaLastModifiedInfo = null,
    name: String = null,
    nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined,
    startDate: String = null,
    subaccountId: String = null,
    traffickerEmails: js.Array[String] = null
  ): SchemaCampaign = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (adBlockingConfiguration != null) __obj.updateDynamic("adBlockingConfiguration")(adBlockingConfiguration.asInstanceOf[js.Any])
    if (additionalCreativeOptimizationConfigurations != null) __obj.updateDynamic("additionalCreativeOptimizationConfigurations")(additionalCreativeOptimizationConfigurations.asInstanceOf[js.Any])
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.get.asInstanceOf[js.Any])
    if (audienceSegmentGroups != null) __obj.updateDynamic("audienceSegmentGroups")(audienceSegmentGroups.asInstanceOf[js.Any])
    if (billingInvoiceCode != null) __obj.updateDynamic("billingInvoiceCode")(billingInvoiceCode.asInstanceOf[js.Any])
    if (clickThroughUrlSuffixProperties != null) __obj.updateDynamic("clickThroughUrlSuffixProperties")(clickThroughUrlSuffixProperties.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo.asInstanceOf[js.Any])
    if (creativeGroupIds != null) __obj.updateDynamic("creativeGroupIds")(creativeGroupIds.asInstanceOf[js.Any])
    if (creativeOptimizationConfiguration != null) __obj.updateDynamic("creativeOptimizationConfiguration")(creativeOptimizationConfiguration.asInstanceOf[js.Any])
    if (defaultClickThroughEventTagProperties != null) __obj.updateDynamic("defaultClickThroughEventTagProperties")(defaultClickThroughEventTagProperties.asInstanceOf[js.Any])
    if (defaultLandingPageId != null) __obj.updateDynamic("defaultLandingPageId")(defaultLandingPageId.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (eventTagOverrides != null) __obj.updateDynamic("eventTagOverrides")(eventTagOverrides.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nielsenOcrEnabled)) __obj.updateDynamic("nielsenOcrEnabled")(nielsenOcrEnabled.get.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (traffickerEmails != null) __obj.updateDynamic("traffickerEmails")(traffickerEmails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCampaign]
  }
}

