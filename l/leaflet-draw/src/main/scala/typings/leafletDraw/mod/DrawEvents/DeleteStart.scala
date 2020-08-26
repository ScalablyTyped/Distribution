package typings.leafletDraw.mod.DrawEvents

import typings.leaflet.mod.LeafletEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStart extends LeafletEvent {
  /**
    * The type of edit this is. One of: remove
    */
  var handler: String = js.native
}

object DeleteStart {
  @scala.inline
  def apply(
    handler: String,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): DeleteStart = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStart]
  }
  @scala.inline
  implicit class DeleteStartOps[Self <: DeleteStart] (val x: Self) extends AnyVal {
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
    def setHandler(value: String): Self = this.set("handler", value.asInstanceOf[js.Any])
  }
  
}

