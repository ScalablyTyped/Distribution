package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewKnuddelPayout extends js.Object {
  var newKnuddelPayout: js.UndefOr[Double] = js.undefined
  var newPriceCents: js.UndefOr[Double] = js.undefined
  var origKnuddelPayout: Double
  var origPriceCents: Double
  var productId: String
}

object NewKnuddelPayout {
  @scala.inline
  def apply(
    origKnuddelPayout: Double,
    origPriceCents: Double,
    productId: String,
    newKnuddelPayout: js.UndefOr[Double] = js.undefined,
    newPriceCents: js.UndefOr[Double] = js.undefined
  ): NewKnuddelPayout = {
    val __obj = js.Dynamic.literal(origKnuddelPayout = origKnuddelPayout.asInstanceOf[js.Any], origPriceCents = origPriceCents.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    if (!js.isUndefined(newKnuddelPayout)) __obj.updateDynamic("newKnuddelPayout")(newKnuddelPayout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newPriceCents)) __obj.updateDynamic("newPriceCents")(newPriceCents.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewKnuddelPayout]
  }
}

