package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A profile is a specific customisation for each endpoint.
  * It parses data from the API differently, add additional information, or enable non-default methods.
  */
trait Profile extends js.Object {
  var endpoint: String
  var locale: String
  var products: js.Array[ProductType]
  var radar: js.UndefOr[Boolean] = js.undefined
  var reachableFrom: js.UndefOr[Boolean] = js.undefined
  var refreshJourney: js.UndefOr[Boolean] = js.undefined
  var timezone: String
  var trip: js.UndefOr[Boolean] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    endpoint: String,
    locale: String,
    products: js.Array[ProductType],
    timezone: String,
    radar: js.UndefOr[Boolean] = js.undefined,
    reachableFrom: js.UndefOr[Boolean] = js.undefined,
    refreshJourney: js.UndefOr[Boolean] = js.undefined,
    trip: js.UndefOr[Boolean] = js.undefined
  ): Profile = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(radar)) __obj.updateDynamic("radar")(radar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reachableFrom)) __obj.updateDynamic("reachableFrom")(reachableFrom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshJourney)) __obj.updateDynamic("refreshJourney")(refreshJourney.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trip)) __obj.updateDynamic("trip")(trip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

