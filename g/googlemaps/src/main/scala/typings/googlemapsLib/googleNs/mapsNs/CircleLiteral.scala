package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleLiteral
  extends CircleOptions
     with googlemapsLib.googleNs.mapsNs.placesNs._LocationBias

object CircleLiteral {
  @scala.inline
  def apply(
    center: LatLng | LatLngLiteral = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    map: Map = null,
    radius: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokePosition: StrokePosition = null,
    strokeWeight: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): CircleLiteral = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokePosition != null) __obj.updateDynamic("strokePosition")(strokePosition)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLiteral]
  }
}

