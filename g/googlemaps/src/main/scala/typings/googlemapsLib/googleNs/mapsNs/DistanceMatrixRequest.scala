package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixRequest extends js.Object {
  var avoidFerries: js.UndefOr[scala.Boolean] = js.undefined
  var avoidHighways: js.UndefOr[scala.Boolean] = js.undefined
  var avoidTolls: js.UndefOr[scala.Boolean] = js.undefined
  var destinations: js.UndefOr[js.Array[LatLng | LatLngLiteral | Place | java.lang.String]] = js.undefined
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  var durationInTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var origins: js.UndefOr[js.Array[LatLng | LatLngLiteral | Place | java.lang.String]] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var transitOptions: js.UndefOr[TransitOptions] = js.undefined
  var travelMode: js.UndefOr[TravelMode] = js.undefined
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
}

object DistanceMatrixRequest {
  @scala.inline
  def apply(
    avoidFerries: js.UndefOr[scala.Boolean] = js.undefined,
    avoidHighways: js.UndefOr[scala.Boolean] = js.undefined,
    avoidTolls: js.UndefOr[scala.Boolean] = js.undefined,
    destinations: js.Array[LatLng | LatLngLiteral | Place | java.lang.String] = null,
    drivingOptions: DrivingOptions = null,
    durationInTraffic: js.UndefOr[scala.Boolean] = js.undefined,
    origins: js.Array[LatLng | LatLngLiteral | Place | java.lang.String] = null,
    region: java.lang.String = null,
    transitOptions: TransitOptions = null,
    travelMode: TravelMode = null,
    unitSystem: UnitSystem = null
  ): DistanceMatrixRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidFerries)) __obj.updateDynamic("avoidFerries")(avoidFerries)
    if (!js.isUndefined(avoidHighways)) __obj.updateDynamic("avoidHighways")(avoidHighways)
    if (!js.isUndefined(avoidTolls)) __obj.updateDynamic("avoidTolls")(avoidTolls)
    if (destinations != null) __obj.updateDynamic("destinations")(destinations)
    if (drivingOptions != null) __obj.updateDynamic("drivingOptions")(drivingOptions)
    if (!js.isUndefined(durationInTraffic)) __obj.updateDynamic("durationInTraffic")(durationInTraffic)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (region != null) __obj.updateDynamic("region")(region)
    if (transitOptions != null) __obj.updateDynamic("transitOptions")(transitOptions)
    if (travelMode != null) __obj.updateDynamic("travelMode")(travelMode)
    if (unitSystem != null) __obj.updateDynamic("unitSystem")(unitSystem)
    __obj.asInstanceOf[DistanceMatrixRequest]
  }
}

