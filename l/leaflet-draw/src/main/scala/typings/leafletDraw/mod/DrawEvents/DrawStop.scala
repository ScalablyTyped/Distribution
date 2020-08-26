package typings.leafletDraw.mod.DrawEvents

import typings.leaflet.mod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawStop extends LeafletEvent {
  /**
    * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
    */
  var layerType: String = js.native
}

object DrawStop {
  @scala.inline
  def apply(
    layer: js.Any,
    layerType: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): DrawStop = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawStop]
  }
  @scala.inline
  implicit class DrawStopOps[Self <: DrawStop] (val x: Self) extends AnyVal {
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
    def setLayerType(value: String): Self = this.set("layerType", value.asInstanceOf[js.Any])
  }
  
}

