package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeEvent extends LeafletEvent {
  var newSize: Point_ = js.native
  var oldSize: Point_ = js.native
}

object ResizeEvent {
  @scala.inline
  def apply(
    layer: js.Any,
    newSize: Point_,
    oldSize: Point_,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): ResizeEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], oldSize = oldSize.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEvent]
  }
  @scala.inline
  implicit class ResizeEventOps[Self <: ResizeEvent] (val x: Self) extends AnyVal {
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
    def setNewSize(value: Point_): Self = this.set("newSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldSize(value: Point_): Self = this.set("oldSize", value.asInstanceOf[js.Any])
  }
  
}

