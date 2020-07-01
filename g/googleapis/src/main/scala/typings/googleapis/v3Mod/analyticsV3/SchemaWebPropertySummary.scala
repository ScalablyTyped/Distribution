package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics WebPropertySummary. WebPropertySummary
  * returns basic information (i.e., summary) for a web property.
  */
@js.native
trait SchemaWebPropertySummary extends js.Object {
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics WebPropertySummary.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String] = js.native
  /**
    * Web property name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of profiles under this web property.
    */
  var profiles: js.UndefOr[js.Array[SchemaProfileSummary]] = js.native
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaWebPropertySummary {
  @scala.inline
  def apply(
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    level: String = null,
    name: String = null,
    profiles: js.Array[SchemaProfileSummary] = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    websiteUrl: String = null
  ): SchemaWebPropertySummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.get.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebPropertySummary]
  }
}

