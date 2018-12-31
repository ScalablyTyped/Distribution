package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewLocationRequest extends js.Object {
  var location: LatLng | LatLngLiteral
  var preference: js.UndefOr[StreetViewPreference] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[StreetViewSource] = js.undefined
}

