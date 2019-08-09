package typings.leafletDashGeosearch.leafletDashGeosearchMod

import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`0`
import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderOptionsResultLimitation extends js.Object {
  var bounded: js.UndefOr[`0` | `1`] = js.undefined
  var countrycodes: js.UndefOr[String] = js.undefined
  var exclude_place_ids: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var viewbox: js.UndefOr[String] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object OpenStreetMapProviderOptionsResultLimitation {
  @scala.inline
  def apply(
    bounded: `0` | `1` = null,
    countrycodes: String = null,
    exclude_place_ids: String = null,
    limit: Int | Double = null,
    viewbox: String = null,
    zoom: Int | Double = null
  ): OpenStreetMapProviderOptionsResultLimitation = {
    val __obj = js.Dynamic.literal()
    if (bounded != null) __obj.updateDynamic("bounded")(bounded.asInstanceOf[js.Any])
    if (countrycodes != null) __obj.updateDynamic("countrycodes")(countrycodes)
    if (exclude_place_ids != null) __obj.updateDynamic("exclude_place_ids")(exclude_place_ids)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (viewbox != null) __obj.updateDynamic("viewbox")(viewbox)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLimitation]
  }
}

