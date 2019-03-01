package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureOptions extends js.Object {
  var geometry: js.UndefOr[
    Geometry | googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var properties: js.UndefOr[js.Object] = js.undefined
}

object FeatureOptions {
  @scala.inline
  def apply(
    geometry: Geometry | googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    id: scala.Double | java.lang.String = null,
    properties: js.Object = null
  ): FeatureOptions = {
    val __obj = js.Dynamic.literal()
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[FeatureOptions]
  }
}

