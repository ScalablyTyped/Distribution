package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a buyer of inventory. Each buyer is identified by a unique
  * Authorized Buyers account ID.
  */
@js.native
trait SchemaBuyer extends js.Object {
  /**
    * Authorized Buyers account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.native
}

object SchemaBuyer {
  @scala.inline
  def apply(accountId: String = null): SchemaBuyer = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuyer]
  }
}

