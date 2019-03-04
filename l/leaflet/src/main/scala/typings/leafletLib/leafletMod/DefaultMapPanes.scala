package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMapPanes extends js.Object {
  var mapPane: stdLib.HTMLElement
  var markerPane: stdLib.HTMLElement
  var overlayPane: stdLib.HTMLElement
  var popupPane: stdLib.HTMLElement
  var shadowPane: stdLib.HTMLElement
  var tilePane: stdLib.HTMLElement
  var tooltipPane: stdLib.HTMLElement
}

object DefaultMapPanes {
  @scala.inline
  def apply(
    mapPane: stdLib.HTMLElement,
    markerPane: stdLib.HTMLElement,
    overlayPane: stdLib.HTMLElement,
    popupPane: stdLib.HTMLElement,
    shadowPane: stdLib.HTMLElement,
    tilePane: stdLib.HTMLElement,
    tooltipPane: stdLib.HTMLElement
  ): DefaultMapPanes = {
    val __obj = js.Dynamic.literal(mapPane = mapPane, markerPane = markerPane, overlayPane = overlayPane, popupPane = popupPane, shadowPane = shadowPane, tilePane = tilePane, tooltipPane = tooltipPane)
  
    __obj.asInstanceOf[DefaultMapPanes]
  }
}

