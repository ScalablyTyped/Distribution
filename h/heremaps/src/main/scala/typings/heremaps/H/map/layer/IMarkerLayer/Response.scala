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
@js.native
trait Response extends js.Object {
  var markers: js.Array[AbstractMarker] = js.native
  var total: Double = js.native
}

object Response {
  @scala.inline
  def apply(markers: js.Array[AbstractMarker], total: Double): Response = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarkersVarargs(value: AbstractMarker*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[AbstractMarker]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

