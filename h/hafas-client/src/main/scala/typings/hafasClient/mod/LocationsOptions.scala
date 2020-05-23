package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsOptions extends js.Object {
   // return stops/stations?
  var addresses: js.UndefOr[Boolean] = js.undefined
  var fuzzy: js.UndefOr[Boolean] = js.undefined
   // parse & expose lines at each stop/station?
  var language: js.UndefOr[String] = js.undefined
   // points of interest
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  var poi: js.UndefOr[Boolean] = js.undefined
   // find only exact matches?
  var results: js.UndefOr[Double] = js.undefined
   // how many search results?
  var stops: js.UndefOr[Boolean] = js.undefined
}

object LocationsOptions {
  @scala.inline
  def apply(
    addresses: js.UndefOr[Boolean] = js.undefined,
    fuzzy: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    linesOfStops: js.UndefOr[Boolean] = js.undefined,
    poi: js.UndefOr[Boolean] = js.undefined,
    results: js.UndefOr[Double] = js.undefined,
    stops: js.UndefOr[Boolean] = js.undefined
  ): LocationsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addresses)) __obj.updateDynamic("addresses")(addresses.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fuzzy)) __obj.updateDynamic("fuzzy")(fuzzy.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(linesOfStops)) __obj.updateDynamic("linesOfStops")(linesOfStops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poi)) __obj.updateDynamic("poi")(poi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stops)) __obj.updateDynamic("stops")(stops.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsOptions]
  }
}

