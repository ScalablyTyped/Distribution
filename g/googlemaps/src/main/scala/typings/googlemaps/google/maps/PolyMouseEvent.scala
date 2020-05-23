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
    edge: js.UndefOr[Double] = js.undefined,
    path: js.UndefOr[Double] = js.undefined,
    vertex: js.UndefOr[Double] = js.undefined
  ): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertex)) __obj.updateDynamic("vertex")(vertex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyMouseEvent]
  }
}

