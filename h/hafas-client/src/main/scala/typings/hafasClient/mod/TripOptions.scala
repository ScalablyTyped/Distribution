package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOptions extends js.Object {
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * return a shape for the trip?
    * @default false
    */
  var polyline: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  /**
    * return stations on the way?
    * @default true
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
}

object TripOptions {
  @scala.inline
  def apply(
    entrances: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    polyline: js.UndefOr[Boolean] = js.undefined,
    remarks: js.UndefOr[Boolean] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined,
    subStops: js.UndefOr[Boolean] = js.undefined
  ): TripOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entrances)) __obj.updateDynamic("entrances")(entrances.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(polyline)) __obj.updateDynamic("polyline")(polyline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subStops)) __obj.updateDynamic("subStops")(subStops.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripOptions]
  }
}

