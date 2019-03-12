package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyMouseEvent extends MouseEvent {
  var edge: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[scala.Double] = js.undefined
  var vertex: js.UndefOr[scala.Double] = js.undefined
}

object PolyMouseEvent {
  @scala.inline
  def apply(
    latLng: LatLng,
    stop: () => scala.Unit,
    edge: scala.Int | scala.Double = null,
    path: scala.Int | scala.Double = null,
    vertex: scala.Int | scala.Double = null
  ): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng, stop = js.Any.fromFunction0(stop))
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (vertex != null) __obj.updateDynamic("vertex")(vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyMouseEvent]
  }
}

