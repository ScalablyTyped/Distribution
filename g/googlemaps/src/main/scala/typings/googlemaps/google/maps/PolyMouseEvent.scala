package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyMouseEvent extends MouseEvent {
  var edge: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[Double] = js.undefined
  var vertex: js.UndefOr[Double] = js.undefined
}

object PolyMouseEvent {
  @scala.inline
  def apply(
    latLng: LatLng,
    stop: () => Unit,
    edge: Int | Double = null,
    path: Int | Double = null,
    vertex: Int | Double = null
  ): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (vertex != null) __obj.updateDynamic("vertex")(vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyMouseEvent]
  }
}

