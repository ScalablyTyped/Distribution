package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LeafletMouseEvent extends LeafletEvent {
  var containerPoint: Point
  var latlng: LatLng
  var layerPoint: Point
  var originalEvent: stdLib.MouseEvent
}

