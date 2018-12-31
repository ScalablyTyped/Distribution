package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixRequest extends js.Object {
  var avoidFerries: js.UndefOr[scala.Boolean] = js.undefined
  var avoidHighways: js.UndefOr[scala.Boolean] = js.undefined
  var avoidTolls: js.UndefOr[scala.Boolean] = js.undefined
  var destinations: js.UndefOr[
    js.Array[java.lang.String] | js.Array[LatLng] | js.Array[LatLngLiteral] | js.Array[Place]
  ] = js.undefined
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  var durationInTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var origins: js.UndefOr[
    js.Array[java.lang.String] | js.Array[LatLng] | js.Array[LatLngLiteral] | js.Array[Place]
  ] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var transitOptions: js.UndefOr[TransitOptions] = js.undefined
  var travelMode: js.UndefOr[TravelMode] = js.undefined
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
}

