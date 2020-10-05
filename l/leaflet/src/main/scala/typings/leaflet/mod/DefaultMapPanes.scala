package typings.leaflet.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMapPanes extends js.Object {
  var mapPane: HTMLElement = js.native
  var markerPane: HTMLElement = js.native
  var overlayPane: HTMLElement = js.native
  var popupPane: HTMLElement = js.native
  var shadowPane: HTMLElement = js.native
  var tilePane: HTMLElement = js.native
  var tooltipPane: HTMLElement = js.native
}

object DefaultMapPanes {
  @scala.inline
  def apply(
    mapPane: HTMLElement,
    markerPane: HTMLElement,
    overlayPane: HTMLElement,
    popupPane: HTMLElement,
    shadowPane: HTMLElement,
    tilePane: HTMLElement,
    tooltipPane: HTMLElement
  ): DefaultMapPanes = {
    val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMapPanes]
  }
  @scala.inline
  implicit class DefaultMapPanesOps[Self <: DefaultMapPanes] (val x: Self) extends AnyVal {
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
    def setMapPane(value: HTMLElement): Self = this.set("mapPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerPane(value: HTMLElement): Self = this.set("markerPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayPane(value: HTMLElement): Self = this.set("overlayPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopupPane(value: HTMLElement): Self = this.set("popupPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowPane(value: HTMLElement): Self = this.set("shadowPane", value.asInstanceOf[js.Any])
    @scala.inline
    def setTilePane(value: HTMLElement): Self = this.set("tilePane", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipPane(value: HTMLElement): Self = this.set("tooltipPane", value.asInstanceOf[js.Any])
  }
  
}

