package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshJourneyOptions extends js.Object {
   // parse & expose hints & warnings?
  var language: js.UndefOr[String] = js.undefined
   // return stations on the way?
  var polylines: js.UndefOr[Boolean] = js.undefined
   // return tickets? only available with some profiles
  var remarks: js.UndefOr[Boolean] = js.undefined
  var stopovers: js.UndefOr[Boolean] = js.undefined
   // return a shape for each leg?
  var tickets: js.UndefOr[Boolean] = js.undefined
}

object RefreshJourneyOptions {
  @scala.inline
  def apply(
    language: String = null,
    polylines: js.UndefOr[Boolean] = js.undefined,
    remarks: js.UndefOr[Boolean] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined,
    tickets: js.UndefOr[Boolean] = js.undefined
  ): RefreshJourneyOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(polylines)) __obj.updateDynamic("polylines")(polylines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickets)) __obj.updateDynamic("tickets")(tickets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshJourneyOptions]
  }
}

