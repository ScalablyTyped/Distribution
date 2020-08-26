package typings.leafletPm.mod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var deleteLayer: js.UndefOr[Boolean] = js.native
   // topleft | topright | bottomleft | bottomright
  var drawMarker: js.UndefOr[Boolean] = js.native
  var drawPolygon: js.UndefOr[Boolean] = js.native
  var drawPolyline: js.UndefOr[Boolean] = js.native
  var editPolygon: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
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
    def setDeleteLayer(value: Boolean): Self = this.set("deleteLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteLayer: Self = this.set("deleteLayer", js.undefined)
    @scala.inline
    def setDrawMarker(value: Boolean): Self = this.set("drawMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawMarker: Self = this.set("drawMarker", js.undefined)
    @scala.inline
    def setDrawPolygon(value: Boolean): Self = this.set("drawPolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawPolygon: Self = this.set("drawPolygon", js.undefined)
    @scala.inline
    def setDrawPolyline(value: Boolean): Self = this.set("drawPolyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawPolyline: Self = this.set("drawPolyline", js.undefined)
    @scala.inline
    def setEditPolygon(value: Boolean): Self = this.set("editPolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditPolygon: Self = this.set("editPolygon", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

