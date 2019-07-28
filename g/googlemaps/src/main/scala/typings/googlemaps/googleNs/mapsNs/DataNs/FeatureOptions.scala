package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureOptions extends js.Object {
  var geometry: js.UndefOr[Geometry | LatLng | LatLngLiteral] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var properties: js.UndefOr[js.Object] = js.undefined
}

object FeatureOptions {
  @scala.inline
  def apply(
    geometry: Geometry | LatLng | LatLngLiteral = null,
    id: Double | String = null,
    properties: js.Object = null
  ): FeatureOptions = {
    val __obj = js.Dynamic.literal()
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[FeatureOptions]
  }
}

