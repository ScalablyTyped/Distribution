package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLineItemProductFee extends js.Object {
  /**
    * Amount of the fee.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  /**
    * Name of the fee.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaOrderLineItemProductFee {
  @scala.inline
  def apply(amount: SchemaPrice = null, name: String = null): SchemaOrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderLineItemProductFee]
  }
}

