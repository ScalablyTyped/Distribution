package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Google Ads account.
  */
@js.native
trait SchemaAdWordsAccount extends js.Object {
  /**
    * True if auto-tagging is enabled on the Google Ads account. Read-only
    * after the insert operation.
    */
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Customer ID. This field is required when creating a Google Ads link.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Resource type for Google Ads account.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAdWordsAccount {
  @scala.inline
  def apply(
    autoTaggingEnabled: js.UndefOr[Boolean] = js.undefined,
    customerId: String = null,
    kind: String = null
  ): SchemaAdWordsAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoTaggingEnabled)) __obj.updateDynamic("autoTaggingEnabled")(autoTaggingEnabled.get.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdWordsAccount]
  }
}

