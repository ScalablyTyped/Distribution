package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JourneysOptions extends js.Object {
   // minimum time for a single transfer in minutes
  var accessibility: js.UndefOr[String] = js.undefined
  var arrival: js.UndefOr[Date] = js.undefined
   // 'none', 'partial' or 'complete'
  var bike: js.UndefOr[Boolean] = js.undefined
  var departure: js.UndefOr[Date] = js.undefined
  var language: js.UndefOr[String] = js.undefined
   // return tickets? only available with some profiles
  var polylines: js.UndefOr[Boolean] = js.undefined
   // only bike-friendly journeys
  var products: js.UndefOr[Products] = js.undefined
   // return a shape for each leg?
  var remarks: js.UndefOr[Boolean] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
   // language to get results in
  var scheduledDays: js.UndefOr[Boolean] = js.undefined
   // 'slow', 'normal', 'fast'
  var startWithWalking: js.UndefOr[Boolean] = js.undefined
   // let journeys pass this station
  var stopovers: js.UndefOr[Boolean] = js.undefined
  var tickets: js.UndefOr[Boolean] = js.undefined
   // Maximum nr of transfers. Default: Let HAFAS decide.
  var transferTime: js.UndefOr[Double] = js.undefined
   // return stations on the way?
  var transfers: js.UndefOr[Double] = js.undefined
   // number of journeys
  var via: js.UndefOr[String] = js.undefined
   // parse & expose hints & warnings?
  var walkingSpeed: js.UndefOr[String] = js.undefined
}

object JourneysOptions {
  @scala.inline
  def apply(
    accessibility: String = null,
    arrival: Date = null,
    bike: js.UndefOr[Boolean] = js.undefined,
    departure: Date = null,
    language: String = null,
    polylines: js.UndefOr[Boolean] = js.undefined,
    products: Products = null,
    remarks: js.UndefOr[Boolean] = js.undefined,
    results: js.UndefOr[Double] = js.undefined,
    scheduledDays: js.UndefOr[Boolean] = js.undefined,
    startWithWalking: js.UndefOr[Boolean] = js.undefined,
    stopovers: js.UndefOr[Boolean] = js.undefined,
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
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(polylines)) __obj.updateDynamic("polylines")(polylines.get.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (!js.isUndefined(remarks)) __obj.updateDynamic("remarks")(remarks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scheduledDays)) __obj.updateDynamic("scheduledDays")(scheduledDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startWithWalking)) __obj.updateDynamic("startWithWalking")(startWithWalking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopovers)) __obj.updateDynamic("stopovers")(stopovers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickets)) __obj.updateDynamic("tickets")(tickets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transferTime)) __obj.updateDynamic("transferTime")(transferTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transfers)) __obj.updateDynamic("transfers")(transfers.get.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    if (walkingSpeed != null) __obj.updateDynamic("walkingSpeed")(walkingSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneysOptions]
  }
}

