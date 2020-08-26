package typings.jointjs.mod.dia.Link

import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.connectionPoints.ConnectionPointJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndCellArgs extends js.Object {
  var anchor: js.UndefOr[AnchorJSON] = js.native
  var connectionPoint: js.UndefOr[ConnectionPointJSON] = js.native
  var magnet: js.UndefOr[String] = js.native
  var port: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[String] = js.native
}

object EndCellArgs {
  @scala.inline
  def apply(): EndCellArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndCellArgs]
  }
  @scala.inline
  implicit class EndCellArgsOps[Self <: EndCellArgs] (val x: Self) extends AnyVal {
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
    def setAnchor(value: AnchorJSON): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setConnectionPoint(value: ConnectionPointJSON): Self = this.set("connectionPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionPoint: Self = this.set("connectionPoint", js.undefined)
    @scala.inline
    def setMagnet(value: String): Self = this.set("magnet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagnet: Self = this.set("magnet", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPriority(value: Boolean): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

