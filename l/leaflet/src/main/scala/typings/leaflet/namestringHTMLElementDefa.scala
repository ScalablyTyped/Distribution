package typings.leaflet

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[name: string] : std.HTMLElement} & leaflet.leaflet.DefaultMapPanes */
trait namestringHTMLElementDefa extends /* name */ StringDictionary[HTMLElement] {
  var mapPane: HTMLElement
  var markerPane: HTMLElement
  var overlayPane: HTMLElement
  var popupPane: HTMLElement
  var shadowPane: HTMLElement
  var tilePane: HTMLElement
  var tooltipPane: HTMLElement
}

object namestringHTMLElementDefa {
  @scala.inline
  def apply(
    mapPane: HTMLElement,
    markerPane: HTMLElement,
    overlayPane: HTMLElement,
    popupPane: HTMLElement,
    shadowPane: HTMLElement,
    tilePane: HTMLElement,
    tooltipPane: HTMLElement,
    StringDictionary: /* name */ StringDictionary[HTMLElement] = null
  ): namestringHTMLElementDefa = {
    val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[namestringHTMLElementDefa]
  }
}

