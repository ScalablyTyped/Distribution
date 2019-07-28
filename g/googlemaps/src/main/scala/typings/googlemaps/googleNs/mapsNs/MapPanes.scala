package typings.googlemaps.googleNs.mapsNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanes extends js.Object {
  var floatPane: Element
  var floatShadow: Element
  var mapPane: Element
  var markerLayer: Element
  var overlayImage: Element
  var overlayLayer: Element
  var overlayMouseTarget: Element
  var overlayShadow: Element
}

object MapPanes {
  @scala.inline
  def apply(
    floatPane: Element,
    floatShadow: Element,
    mapPane: Element,
    markerLayer: Element,
    overlayImage: Element,
    overlayLayer: Element,
    overlayMouseTarget: Element,
    overlayShadow: Element
  ): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane, floatShadow = floatShadow, mapPane = mapPane, markerLayer = markerLayer, overlayImage = overlayImage, overlayLayer = overlayLayer, overlayMouseTarget = overlayMouseTarget, overlayShadow = overlayShadow)
  
    __obj.asInstanceOf[MapPanes]
  }
}

