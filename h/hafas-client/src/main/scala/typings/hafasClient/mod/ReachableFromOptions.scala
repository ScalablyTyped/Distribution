package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReachableFromOptions extends js.Object {
   // maximum of 5 transfers
  var maxDuration: js.UndefOr[Double] = js.undefined
  var maxTransfers: js.UndefOr[Double] = js.undefined
   // maximum travel duration in minutes, pass `null` for infinite
  var products: js.UndefOr[Products] = js.undefined
  var when: js.UndefOr[Date] = js.undefined
}

object ReachableFromOptions {
  @scala.inline
  def apply(
    maxDuration: js.UndefOr[Double] = js.undefined,
    maxTransfers: js.UndefOr[Double] = js.undefined,
    products: Products = null,
    when: Date = null
  ): ReachableFromOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTransfers)) __obj.updateDynamic("maxTransfers")(maxTransfers.get.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReachableFromOptions]
  }
}

