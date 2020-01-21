package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSeller extends js.Object {
  /**
    * The unique id for the seller. The seller fills in this field. The seller
    * account id is then available to buyer in the product.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Optional sub-account id for the seller.
    */
  var subAccountId: js.UndefOr[String] = js.native
}

object SchemaSeller {
  @scala.inline
  def apply(accountId: String = null, subAccountId: String = null): SchemaSeller = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeller]
  }
}

