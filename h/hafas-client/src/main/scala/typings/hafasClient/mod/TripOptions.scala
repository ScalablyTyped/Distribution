package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOptions extends js.Object {
   // parse & expose hints & warnings?
  var language: js.UndefOr[String] = js.undefined
   // return stations on the way?
  var polyline: js.UndefOr[Boolean] = js.undefined
   // return a shape for the trip?
  var remarks: js.UndefOr[Boolean] = js.undefined
  var stopovers: js.UndefOr[Boolean] = js.undefined
}

object TripOptions {
  @scala.inline
  def apply(
    language: String = null,
    polyline: js.UndefOr[Boolean] = js.undefined,
    remarks: js.UndefOr[Boolean] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined
  ): TripOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(polyline)) __obj.updateDynamic("polyline")(polyline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripOptions]
  }
}

