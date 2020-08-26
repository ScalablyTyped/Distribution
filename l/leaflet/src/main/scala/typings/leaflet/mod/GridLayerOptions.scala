package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridLayerOptions extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var className: js.UndefOr[String] = js.native
  var keepBuffer: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var pane: js.UndefOr[String] = js.native
  var tileSize: js.UndefOr[Double | Point_] = js.native
  var updateInterval: js.UndefOr[Double] = js.native
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
  var updateWhenZooming: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object GridLayerOptions {
  @scala.inline
  def apply(): GridLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLayerOptions]
  }
  @scala.inline
  implicit class GridLayerOptionsOps[Self <: GridLayerOptions] (val x: Self) extends AnyVal {
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setKeepBuffer(value: Double): Self = this.set("keepBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepBuffer: Self = this.set("keepBuffer", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setTileSize(value: Double | Point_): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateInterval: Self = this.set("updateInterval", js.undefined)
    @scala.inline
    def setUpdateWhenIdle(value: Boolean): Self = this.set("updateWhenIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateWhenIdle: Self = this.set("updateWhenIdle", js.undefined)
    @scala.inline
    def setUpdateWhenZooming(value: Boolean): Self = this.set("updateWhenZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateWhenZooming: Self = this.set("updateWhenZooming", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

