package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationEvent extends LeafletEvent {
  var accuracy: scala.Double
  var altitude: scala.Double
  var altitudeAccuracy: scala.Double
  var bounds: LatLngBounds
  var heading: scala.Double
  var latlng: LatLng
  var speed: scala.Double
  var timestamp: scala.Double
}

