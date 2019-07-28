package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: js.UndefOr[Double] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(amount: Int | Double = null): Anon_Amount = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Amount]
  }
}

