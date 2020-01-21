package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a seller of inventory. Each seller is identified by a unique Ad
  * Manager account ID.
  */
@js.native
trait SchemaSeller extends js.Object {
  /**
    * The unique ID for the seller. The seller fills in this field. The seller
    * account ID is then available to buyer in the product.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Optional sub-account ID for the seller.
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

