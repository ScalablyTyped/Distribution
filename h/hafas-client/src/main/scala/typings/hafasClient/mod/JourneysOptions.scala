package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JourneysOptions extends js.Object {
  /**
    * 'none', 'partial' or 'complete'
    *  @default none
    */
  var accessibility: js.UndefOr[String] = js.undefined
  /**
    * arrival date, departure and arrival are mutually exclusive.
    * @default undefined
    */
  var arrival: js.UndefOr[Date] = js.undefined
  /**
    * only bike-friendly journeys
    * @default false
    */
  var bike: js.UndefOr[Boolean] = js.undefined
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var departure: js.UndefOr[Date] = js.undefined
  /**
    * earlierThan, use {@link Journeys#earlierRef}, earlierThan and departure/arrival are mutually exclusive.
    * @default undefined
    */
  var earlierThan: js.UndefOr[String] = js.undefined
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  /**
    * language to get results in
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * laterThan, use {@link Journeys#laterRef}, laterThan and departure/arrival are mutually exclusive.
    *  @default undefined
    */
  var laterThan: js.UndefOr[String] = js.undefined
  /**
    * return a shape for each leg?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.undefined
  var products: js.UndefOr[Products] = js.undefined
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  /**
    * how many search results?
    * @default 3
    */
  var results: js.UndefOr[Double] = js.undefined
  /**
    * parse which days each journey is valid on
    * @default false
    */
  var scheduledDays: js.UndefOr[Boolean] = js.undefined
  /**
    * start with walking
    * @default false
    */
  var startWithWalking: js.UndefOr[Boolean] = js.undefined
  /**
    * return stations on the way?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose sub-stops of stations?
    * @default false
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  /**
    * return tickets? only available with some profiles
    * @default false
    */
  var tickets: js.UndefOr[Boolean] = js.undefined
  /**
    * minimum time for a single transfer in minutes
    * @default 10
    */
  var transferTime: js.UndefOr[Double] = js.undefined
  /**
    * Maximum nr of transfers. Default: Let HAFAS decide.
    * @default 10
    */
  var transfers: js.UndefOr[Double] = js.undefined
  /**
    * let journeys pass this station
    * @default undefined
    */
  var via: js.UndefOr[String] = js.undefined
  /**
    * 'slow', 'normal', 'fast'
    * @default slow
    */
  var walkingSpeed: js.UndefOr[String] = js.undefined
}

object JourneysOptions {
  @scala.inline
  def apply(
    accessibility: String = null,
    arrival: Date = null,
    bike: js.UndefOr[Boolean] = js.undefined,
    departure: Date = null,
    earlierThan: String = null,
    entrances: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    laterThan: String = null,
    polylines: js.UndefOr[Boolean] = js.undefined,
    products: Products = null,
    remarks: js.UndefOr[Boolean] = js.undefined,
    results: js.UndefOr[Double] = js.undefined,
    scheduledDays: js.UndefOr[Boolean] = js.undefined,
    startWithWalking: js.UndefOr[Boolean] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined,
    subStops: js.UndefOr[Boolean] = js.undefined,
    tickets: js.UndefOr[Boolean] = js.undefined,
    transferTime: js.UndefOr[Double] = js.undefined,
    transfers: js.UndefOr[Double] = js.undefined,
    via: String = null,
    walkingSpeed: String = null
  ): JourneysOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (arrival != null) __obj.updateDynamic("arrival")(arrival.asInstanceOf[js.Any])
    if (!js.isUndefined(bike)) __obj.updateDynamic("bike")(bike.get.asInstanceOf[js.Any])
    if (departure != null) __obj.updateDynamic("departure")(departure.asInstanceOf[js.Any])
    if (earlierThan != null) __obj.updateDynamic("earlierThan")(earlierThan.asInstanceOf[js.Any])
    if (!js.isUndefined(entrances)) __obj.updateDynamic("entrances")(entrances.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (laterThan != null) __obj.updateDynamic("laterThan")(laterThan.asInstanceOf[js.Any])
    if (!js.isUndefined(polylines)) __obj.updateDynamic("polylines")(polylines.get.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scheduledDays)) __obj.updateDynamic("scheduledDays")(scheduledDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startWithWalking)) __obj.updateDynamic("startWithWalking")(startWithWalking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subStops)) __obj.updateDynamic("subStops")(subStops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickets)) __obj.updateDynamic("tickets")(tickets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transferTime)) __obj.updateDynamic("transferTime")(transferTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transfers)) __obj.updateDynamic("transfers")(transfers.get.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    if (walkingSpeed != null) __obj.updateDynamic("walkingSpeed")(walkingSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneysOptions]
  }
}

