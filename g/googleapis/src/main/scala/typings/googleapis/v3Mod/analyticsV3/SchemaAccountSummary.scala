package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics AccountSummary. An AccountSummary is a
  * lightweight tree comprised of properties/profiles.
  */
@js.native
trait SchemaAccountSummary extends js.Object {
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics AccountSummary.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  /**
    * List of web properties under this account.
    */
  var webProperties: js.UndefOr[js.Array[SchemaWebPropertySummary]] = js.native
}

object SchemaAccountSummary {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    name: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    webProperties: js.Array[SchemaWebPropertySummary] = null
  ): SchemaAccountSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.get.asInstanceOf[js.Any])
    if (webProperties != null) __obj.updateDynamic("webProperties")(webProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountSummary]
  }
}

