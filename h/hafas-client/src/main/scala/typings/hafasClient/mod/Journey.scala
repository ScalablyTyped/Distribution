package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.journey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Journey extends js.Object {
  var cycle: js.UndefOr[Cycle] = js.undefined
  var legs: js.Array[Leg]
  var price: js.UndefOr[Price] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var remarks: js.UndefOr[js.Array[Hint]] = js.undefined
  var `type`: journey
}

object Journey {
  @scala.inline
  def apply(
    legs: js.Array[Leg],
    `type`: journey,
    cycle: Cycle = null,
    price: Price = null,
    refreshToken: String = null,
    remarks: js.Array[Hint] = null
  ): Journey = {
    val __obj = js.Dynamic.literal(legs = legs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cycle != null) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (remarks != null) __obj.updateDynamic("remarks")(remarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Journey]
  }
}

