package typings.heremaps.H.map.layer.IMarkerLayer

import typings.heremaps.H.map.AbstractMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
  * @property total {number} - The total number of markers, inclusive markers with not ready icons
  * @property markers {Array<H.map.AbstractMarker>} - The marker objects for the bounding rectangle (only ready)
  */
trait Response extends js.Object {
  var markers: js.Array[AbstractMarker]
  var total: Double
}

object Response {
  @scala.inline
  def apply(markers: js.Array[AbstractMarker], total: Double): Response = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

