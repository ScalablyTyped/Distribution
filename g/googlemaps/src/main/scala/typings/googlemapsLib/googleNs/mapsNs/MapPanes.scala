package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanes extends js.Object {
  var floatPane: stdLib.Element
  var floatShadow: stdLib.Element
  var mapPane: stdLib.Element
  var markerLayer: stdLib.Element
  var overlayImage: stdLib.Element
  var overlayLayer: stdLib.Element
  var overlayMouseTarget: stdLib.Element
  var overlayShadow: stdLib.Element
}

object MapPanes {
  @scala.inline
  def apply(
    floatPane: stdLib.Element,
    floatShadow: stdLib.Element,
    mapPane: stdLib.Element,
    markerLayer: stdLib.Element,
    overlayImage: stdLib.Element,
    overlayLayer: stdLib.Element,
    overlayMouseTarget: stdLib.Element,
    overlayShadow: stdLib.Element
  ): MapPanes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("floatPane")(floatPane)
    __obj.updateDynamic("floatShadow")(floatShadow)
    __obj.updateDynamic("mapPane")(mapPane)
    __obj.updateDynamic("markerLayer")(markerLayer)
    __obj.updateDynamic("overlayImage")(overlayImage)
    __obj.updateDynamic("overlayLayer")(overlayLayer)
    __obj.updateDynamic("overlayMouseTarget")(overlayMouseTarget)
    __obj.updateDynamic("overlayShadow")(overlayShadow)
    __obj.asInstanceOf[MapPanes]
  }
}

