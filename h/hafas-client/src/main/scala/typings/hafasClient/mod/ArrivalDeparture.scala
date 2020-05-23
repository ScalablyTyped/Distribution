package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrivalDeparture extends js.Object {
  var arrival: js.UndefOr[Double] = js.undefined
  var departure: js.UndefOr[Double] = js.undefined
}

object ArrivalDeparture {
  @scala.inline
  def apply(arrival: js.UndefOr[Double] = js.undefined, departure: js.UndefOr[Double] = js.undefined): ArrivalDeparture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrival)) __obj.updateDynamic("arrival")(arrival.get.asInstanceOf[js.Any])
    if (!js.isUndefined(departure)) __obj.updateDynamic("departure")(departure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrivalDeparture]
  }
}

