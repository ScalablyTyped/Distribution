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
  def apply(): SchemaAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatus]
  }
  @scala.inline
  implicit class SchemaAccountStatusOps[Self <: SchemaAccountStatus] (val x: Self) extends AnyVal {
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
    def setAccountLevelIssuesVarargs(value: SchemaAccountStatusAccountLevelIssue*): Self = this.set("accountLevelIssues", js.Array(value :_*))
    @scala.inline
    def setAccountLevelIssues(value: js.Array[SchemaAccountStatusAccountLevelIssue]): Self = this.set("accountLevelIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountLevelIssues: Self = this.set("accountLevelIssues", js.undefined)
    @scala.inline
    def setDataQualityIssuesVarargs(value: SchemaAccountStatusDataQualityIssue*): Self = this.set("dataQualityIssues", js.Array(value :_*))
    @scala.inline
    def setDataQualityIssues(value: js.Array[SchemaAccountStatusDataQualityIssue]): Self = this.set("dataQualityIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataQualityIssues: Self = this.set("dataQualityIssues", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProductsVarargs(value: SchemaAccountStatusProducts*): Self = this.set("products", js.Array(value :_*))
    @scala.inline
    def setProducts(value: js.Array[SchemaAccountStatusProducts]): Self = this.set("products", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    @scala.inline
    def setWebsiteClaimed(value: Boolean): Self = this.set("websiteClaimed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteClaimed: Self = this.set("websiteClaimed", js.undefined)
  }
  
}

