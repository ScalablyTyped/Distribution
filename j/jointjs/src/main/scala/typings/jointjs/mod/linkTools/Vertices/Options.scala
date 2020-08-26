package typings.jointjs.mod.linkTools.Vertices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.jointjs.mod.dia.ToolView.Options {
  var handleClass: js.UndefOr[js.Any] = js.native
  var redundancyRemoval: js.UndefOr[Boolean] = js.native
  var snapRadius: js.UndefOr[Double] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var vertexAdding: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setHandleClass(value: js.Any): Self = this.set("handleClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleClass: Self = this.set("handleClass", js.undefined)
    @scala.inline
    def setRedundancyRemoval(value: Boolean): Self = this.set("redundancyRemoval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedundancyRemoval: Self = this.set("redundancyRemoval", js.undefined)
    @scala.inline
    def setSnapRadius(value: Double): Self = this.set("snapRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapRadius: Self = this.set("snapRadius", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setVertexAdding(value: Boolean): Self = this.set("vertexAdding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexAdding: Self = this.set("vertexAdding", js.undefined)
  }
  
}

