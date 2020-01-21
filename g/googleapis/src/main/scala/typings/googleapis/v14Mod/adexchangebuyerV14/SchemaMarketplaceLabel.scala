package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMarketplaceLabel extends js.Object {
  /**
    * The accountId of the party that created the label.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The creation time (in ms since epoch) for the label.
    */
  var createTimeMs: js.UndefOr[String] = js.native
  /**
    * Information about the party that created the label.
    */
  var deprecatedMarketplaceDealParty: js.UndefOr[SchemaMarketplaceDealParty] = js.native
  /**
    * The label to use.
    */
  var label: js.UndefOr[String] = js.native
}

object SchemaMarketplaceLabel {
  @scala.inline
  def apply(
    accountId: String = null,
    createTimeMs: String = null,
    deprecatedMarketplaceDealParty: SchemaMarketplaceDealParty = null,
    label: String = null
  ): SchemaMarketplaceLabel = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (createTimeMs != null) __obj.updateDynamic("createTimeMs")(createTimeMs.asInstanceOf[js.Any])
    if (deprecatedMarketplaceDealParty != null) __obj.updateDynamic("deprecatedMarketplaceDealParty")(deprecatedMarketplaceDealParty.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMarketplaceLabel]
  }
}

