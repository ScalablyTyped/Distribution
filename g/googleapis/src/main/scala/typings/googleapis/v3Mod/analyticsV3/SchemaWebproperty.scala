package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.AnonEffective
import typings.googleapis.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics web property.
  */
@js.native
trait SchemaWebproperty extends js.Object {
  /**
    * Account ID to which this web property belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Child link for this web property. Points to the list of views (profiles)
    * for this web property.
    */
  var childLink: js.UndefOr[AnonHref] = js.native
  /**
    * Time this web property was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Set to true to reset the retention period of the user identifier with
    * each new event from that user (thus setting the expiration date to
    * current time plus retention period). Set to false to delete data
    * associated with the user identifer automatically after the rentention
    * period. This property cannot be set on insert.
    */
  var dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.native
  /**
    * The length of time for which user and event data is retained. This
    * property cannot be set on insert.
    */
  var dataRetentionTtl: js.UndefOr[String] = js.native
  /**
    * Default view (profile) ID.
    */
  var defaultProfileId: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The industry vertical/category selected for this web property.
    */
  var industryVertical: js.UndefOr[String] = js.native
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics WebProperty.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String] = js.native
  /**
    * Name of this web property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for this web property. Points to the account to which this
    * web property belongs.
    */
  var parentLink: js.UndefOr[AnonHref] = js.native
  /**
    * Permissions the user has for this web property.
    */
  var permissions: js.UndefOr[AnonEffective] = js.native
  /**
    * View (Profile) count for this web property.
    */
  var profileCount: js.UndefOr[Double] = js.native
  /**
    * Link for this web property.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  /**
    * Time this web property was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaWebproperty {
  @scala.inline
  def apply(
    accountId: String = null,
    childLink: AnonHref = null,
    created: String = null,
    dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.undefined,
    dataRetentionTtl: String = null,
    defaultProfileId: String = null,
    id: String = null,
    industryVertical: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    parentLink: AnonHref = null,
    permissions: AnonEffective = null,
    profileCount: Int | Double = null,
    selfLink: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    updated: String = null,
    websiteUrl: String = null
  ): SchemaWebproperty = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (!js.isUndefined(dataRetentionResetOnNewActivity)) __obj.updateDynamic("dataRetentionResetOnNewActivity")(dataRetentionResetOnNewActivity.asInstanceOf[js.Any])
    if (dataRetentionTtl != null) __obj.updateDynamic("dataRetentionTtl")(dataRetentionTtl.asInstanceOf[js.Any])
    if (defaultProfileId != null) __obj.updateDynamic("defaultProfileId")(defaultProfileId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (industryVertical != null) __obj.updateDynamic("industryVertical")(industryVertical.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (profileCount != null) __obj.updateDynamic("profileCount")(profileCount.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebproperty]
  }
}

