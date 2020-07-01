package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshJourneyOptions extends js.Object {
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  /**
    * language
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * return a shape for each leg?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  /**
    * return stations on the way?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  /**
    * return tickets? only available with some profiles
    * @default false
    */
  var tickets: js.UndefOr[Boolean] = js.undefined
}

object RefreshJourneyOptions {
  @scala.inline
  def apply(
    entrances: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    polylines: js.UndefOr[Boolean] = js.undefined,
    remarks: js.UndefOr[Boolean] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined,
    subStops: js.UndefOr[Boolean] = js.undefined,
    tickets: js.UndefOr[Boolean] = js.undefined
  ): RefreshJourneyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entrances)) __obj.updateDynamic("entrances")(entrances.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(polylines)) __obj.updateDynamic("polylines")(polylines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subStops)) __obj.updateDynamic("subStops")(subStops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickets)) __obj.updateDynamic("tickets")(tickets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshJourneyOptions]
  }
}

