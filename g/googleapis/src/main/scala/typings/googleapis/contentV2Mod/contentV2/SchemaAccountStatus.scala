package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of an account, i.e., information about its products, which is
  * computed offline and not returned immediately at insertion time.
  */
@js.native
trait SchemaAccountStatus extends js.Object {
  /**
    * The ID of the account for which the status is reported.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of account level issues.
    */
  var accountLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusAccountLevelIssue]] = js.native
  /**
    * DEPRECATED - never populated.
    */
  var dataQualityIssues: js.UndefOr[js.Array[SchemaAccountStatusDataQualityIssue]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of product-related data by channel, destination, and country. Data
    * in this field may be delayed by up to 30 minutes.
    */
  var products: js.UndefOr[js.Array[SchemaAccountStatusProducts]] = js.native
  /**
    * Whether the account&#39;s website is claimed or not.
    */
  var websiteClaimed: js.UndefOr[Boolean] = js.native
}

object SchemaAccountStatus {
  @scala.inline
  def apply(
    accountId: String = null,
    accountLevelIssues: js.Array[SchemaAccountStatusAccountLevelIssue] = null,
    dataQualityIssues: js.Array[SchemaAccountStatusDataQualityIssue] = null,
    kind: String = null,
    products: js.Array[SchemaAccountStatusProducts] = null,
    websiteClaimed: js.UndefOr[Boolean] = js.undefined
  ): SchemaAccountStatus = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountLevelIssues != null) __obj.updateDynamic("accountLevelIssues")(accountLevelIssues.asInstanceOf[js.Any])
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (!js.isUndefined(websiteClaimed)) __obj.updateDynamic("websiteClaimed")(websiteClaimed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountStatus]
  }
}

