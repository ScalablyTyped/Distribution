package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstallment extends js.Object {
  /**
    * The amount the buyer has to pay per month.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The number of installments the buyer has to pay.
    */
  var months: js.UndefOr[String] = js.native
}

object SchemaInstallment {
  @scala.inline
  def apply(amount: SchemaPrice = null, months: String = null): SchemaInstallment = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstallment]
  }
}

