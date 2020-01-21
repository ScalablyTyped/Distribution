package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBuyer extends js.Object {
  /**
    * Adx account id of the buyer.
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

