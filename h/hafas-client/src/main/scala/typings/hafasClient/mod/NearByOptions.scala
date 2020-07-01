package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearByOptions extends js.Object {
  /**
    * maximum walking distance in meters
    * @default undefined
    */
  var distance: js.UndefOr[Double] = js.undefined
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
    * parse & expose lines at each stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  /**
    * return points of interest?
    * @default false
    */
  var poi: js.UndefOr[Boolean] = js.undefined
  /**
    * maximum number of results
    * @default 8
    */
  var results: js.UndefOr[Double] = js.undefined
  /**
    * return stops/stations?
    * @default true
    */
  var stops: js.UndefOr[Boolean] = js.undefined
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
}

object NearByOptions {
  @scala.inline
  def apply(
    distance: js.UndefOr[Double] = js.undefined,
    entrances: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    linesOfStops: js.UndefOr[Boolean] = js.undefined,
    poi: js.UndefOr[Boolean] = js.undefined,
    results: js.UndefOr[Double] = js.undefined,
    stops: js.UndefOr[Boolean] = js.undefined,
    subStops: js.UndefOr[Boolean] = js.undefined
  ): NearByOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(entrances)) __obj.updateDynamic("entrances")(entrances.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(linesOfStops)) __obj.updateDynamic("linesOfStops")(linesOfStops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poi)) __obj.updateDynamic("poi")(poi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stops)) __obj.updateDynamic("stops")(stops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subStops)) __obj.updateDynamic("subStops")(subStops.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearByOptions]
  }
}

