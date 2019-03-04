package typings
package heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
  * @property total {number} - The total number of markers, inclusive markers with not ready icons
  * @property markers {Array<H.map.AbstractMarker>} - The marker objects for the bounding rectangle (only ready)
  */
trait Response extends js.Object {
  var markers: js.Array[heremapsLib.HNs.mapNs.AbstractMarker]
  var total: scala.Double
}

object Response {
  @scala.inline
  def apply(markers: js.Array[heremapsLib.HNs.mapNs.AbstractMarker], total: scala.Double): Response = {
    val __obj = js.Dynamic.literal(markers = markers, total = total)
  
    __obj.asInstanceOf[Response]
  }
}

