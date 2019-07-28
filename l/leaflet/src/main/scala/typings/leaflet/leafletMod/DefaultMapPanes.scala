package typings.leaflet.leafletMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMapPanes extends js.Object {
  var mapPane: HTMLElement
  var markerPane: HTMLElement
  var overlayPane: HTMLElement
  var popupPane: HTMLElement
  var shadowPane: HTMLElement
  var tilePane: HTMLElement
  var tooltipPane: HTMLElement
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
    val __obj = js.Dynamic.literal(mapPane = mapPane, markerPane = markerPane, overlayPane = overlayPane, popupPane = popupPane, shadowPane = shadowPane, tilePane = tilePane, tooltipPane = tooltipPane)
  
    __obj.asInstanceOf[DefaultMapPanes]
  }
}

