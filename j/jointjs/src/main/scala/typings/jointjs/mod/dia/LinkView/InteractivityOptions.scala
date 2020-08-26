package typings.jointjs.mod.dia.LinkView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractivityOptions extends js.Object {
  var arrowheadMove: js.UndefOr[Boolean] = js.native
  var labelMove: js.UndefOr[Boolean] = js.native
  var linkMove: js.UndefOr[Boolean] = js.native
  var useLinkTools: js.UndefOr[Boolean] = js.native
  var vertexAdd: js.UndefOr[Boolean] = js.native
  var vertexMove: js.UndefOr[Boolean] = js.native
  var vertexRemove: js.UndefOr[Boolean] = js.native
}

object InteractivityOptions {
  @scala.inline
  def apply(): InteractivityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractivityOptions]
  }
  @scala.inline
  implicit class InteractivityOptionsOps[Self <: InteractivityOptions] (val x: Self) extends AnyVal {
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
    def setArrowheadMove(value: Boolean): Self = this.set("arrowheadMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowheadMove: Self = this.set("arrowheadMove", js.undefined)
    @scala.inline
    def setLabelMove(value: Boolean): Self = this.set("labelMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMove: Self = this.set("labelMove", js.undefined)
    @scala.inline
    def setLinkMove(value: Boolean): Self = this.set("linkMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkMove: Self = this.set("linkMove", js.undefined)
    @scala.inline
    def setUseLinkTools(value: Boolean): Self = this.set("useLinkTools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLinkTools: Self = this.set("useLinkTools", js.undefined)
    @scala.inline
    def setVertexAdd(value: Boolean): Self = this.set("vertexAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexAdd: Self = this.set("vertexAdd", js.undefined)
    @scala.inline
    def setVertexMove(value: Boolean): Self = this.set("vertexMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexMove: Self = this.set("vertexMove", js.undefined)
    @scala.inline
    def setVertexRemove(value: Boolean): Self = this.set("vertexRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexRemove: Self = this.set("vertexRemove", js.undefined)
  }
  
}

