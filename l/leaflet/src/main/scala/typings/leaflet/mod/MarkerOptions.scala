package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerOptions extends InteractiveLayerOptions {
  /** Text for the `alt` attribute of the icon image (useful for accessibility). */
  var alt: js.UndefOr[String] = js.native
  /** Whether to pan the map when dragging this marker near its edge or not. */
  var autoPan: js.UndefOr[Boolean] = js.native
  /** Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map. */
  var autoPanPadding: js.UndefOr[PointExpression] = js.native
  /** Number of pixels the map should pan by. */
  var autoPanSpeed: js.UndefOr[Double] = js.native
  /** Whether the marker is draggable with mouse/touch or not. */
  var draggable: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  /** Whether the marker can be tabbed to with a keyboard and clicked by pressing enter. */
  var keyboard: js.UndefOr[Boolean] = js.native
  /** The opacity of the marker. */
  var opacity: js.UndefOr[Double] = js.native
  /** The z-index offset used for the `riseOnHover` feature. */
  var riseOffset: js.UndefOr[Double] = js.native
  /** If `true`, the marker will get on top of others when you hover the mouse over it. */
  var riseOnHover: js.UndefOr[Boolean] = js.native
  /** `Map pane` where the markers shadow will be added. */
  var shadowPane: js.UndefOr[String] = js.native
  /** Text for the browser tooltip that appear on marker hover (no tooltip by default). */
  var title: js.UndefOr[String] = js.native
  /** Option for putting the marker on top of all others (or below). */
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAutoPan(value: Boolean): Self = this.set("autoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPan: Self = this.set("autoPan", js.undefined)
    @scala.inline
    def setAutoPanPadding(value: PointExpression): Self = this.set("autoPanPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanPadding: Self = this.set("autoPanPadding", js.undefined)
    @scala.inline
    def setAutoPanSpeed(value: Double): Self = this.set("autoPanSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPanSpeed: Self = this.set("autoPanSpeed", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRiseOffset(value: Double): Self = this.set("riseOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiseOffset: Self = this.set("riseOffset", js.undefined)
    @scala.inline
    def setRiseOnHover(value: Boolean): Self = this.set("riseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiseOnHover: Self = this.set("riseOnHover", js.undefined)
    @scala.inline
    def setShadowPane(value: String): Self = this.set("shadowPane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowPane: Self = this.set("shadowPane", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setZIndexOffset(value: Double): Self = this.set("zIndexOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexOffset: Self = this.set("zIndexOffset", js.undefined)
  }
  
}

