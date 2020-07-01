package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.journey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A journey is a computed set of directions to get from A to B at a specific time.
  * It would typically be the result of a route planning algorithm.
  */
trait Journey extends js.Object {
  var cycle: js.UndefOr[Cycle] = js.undefined
  var legs: js.Array[Leg]
  var price: js.UndefOr[Price] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var remarks: js.UndefOr[js.Array[Hint]] = js.undefined
  var scheduledDays: js.UndefOr[ScheduledDays] = js.undefined
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
    remarks: js.Array[Hint] = null,
    scheduledDays: ScheduledDays = null
  ): Journey = {
    val __obj = js.Dynamic.literal(legs = legs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cycle != null) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (remarks != null) __obj.updateDynamic("remarks")(remarks.asInstanceOf[js.Any])
    if (scheduledDays != null) __obj.updateDynamic("scheduledDays")(scheduledDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Journey]
  }
}

