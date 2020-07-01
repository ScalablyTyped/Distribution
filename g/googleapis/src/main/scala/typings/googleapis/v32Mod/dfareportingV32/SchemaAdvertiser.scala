package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager advertiser.
  */
@js.native
trait SchemaAdvertiser extends js.Object {
  /**
    * Account ID of this advertiser.This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * ID of the advertiser group this advertiser belongs to. You can group
    * advertisers for reporting purposes, allowing you to see aggregated
    * information for all advertisers in each group.
    */
  var advertiserGroupId: js.UndefOr[String] = js.native
  /**
    * Suffix added to click-through URL of ad creative associations under this
    * advertiser. Must be less than 129 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  /**
    * ID of the click-through event tag to apply by default to the landing
    * pages of this advertiser&#39;s campaigns.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  /**
    * Default email address used in sender field for tag emails.
    */
  var defaultEmail: js.UndefOr[String] = js.native
  /**
    * Floodlight configuration ID of this advertiser. The floodlight
    * configuration ID will be created automatically, so on insert this field
    * should be left blank. This field can be set to another advertiser&#39;s
    * floodlight configuration ID in order to share that advertiser&#39;s
    * floodlight configuration with this advertiser, so long as:  - This
    * advertiser&#39;s original floodlight configuration is not already
    * associated with floodlight activities or floodlight activity groups.  -
    * This advertiser&#39;s original floodlight configuration is not already
    * shared with another advertiser.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * ID of this advertiser. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this advertiser. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this advertiser. This is a required field and must be less than
    * 256 characters long and unique among advertisers of the same account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Original floodlight configuration before any sharing occurred. Set the
    * floodlightConfigurationId of this advertiser to
    * originalFloodlightConfigurationId to unshare the advertiser&#39;s current
    * floodlight configuration. You cannot unshare an advertiser&#39;s
    * floodlight configuration if the shared configuration has activities
    * associated with any campaign or placement.
    */
  var originalFloodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Status of this advertiser.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this advertiser.This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Suspension status of this advertiser.
    */
  var suspended: js.UndefOr[Boolean] = js.native
}

object SchemaAdvertiser {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserGroupId: String = null,
    clickThroughUrlSuffix: String = null,
    defaultClickThroughEventTagId: String = null,
    defaultEmail: String = null,
    floodlightConfigurationId: String = null,
    floodlightConfigurationIdDimensionValue: SchemaDimensionValue = null,
    id: String = null,
    idDimensionValue: SchemaDimensionValue = null,
    kind: String = null,
    name: String = null,
    originalFloodlightConfigurationId: String = null,
    status: String = null,
    subaccountId: String = null,
    suspended: js.UndefOr[Boolean] = js.undefined
  ): SchemaAdvertiser = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId.asInstanceOf[js.Any])
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix.asInstanceOf[js.Any])
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId.asInstanceOf[js.Any])
    if (defaultEmail != null) __obj.updateDynamic("defaultEmail")(defaultEmail.asInstanceOf[js.Any])
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId.asInstanceOf[js.Any])
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalFloodlightConfigurationId != null) __obj.updateDynamic("originalFloodlightConfigurationId")(originalFloodlightConfigurationId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdvertiser]
  }
}

