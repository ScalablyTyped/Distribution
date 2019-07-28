package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleMarkerOptions extends PathOptions {
  var radius: js.UndefOr[Double] = js.undefined
}

object CircleMarkerOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    dashArray: String | js.Array[Double] = null,
    dashOffset: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    fillRule: FillRule = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    lineCap: LineCapShape = null,
    lineJoin: LineJoinShape = null,
    opacity: Int | Double = null,
    pane: String = null,
    radius: Int | Double = null,
    renderer: Renderer = null,
    stroke: js.UndefOr[Boolean] = js.undefined,
    weight: Int | Double = null
  ): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (dashOffset != null) __obj.updateDynamic("dashOffset")(dashOffset)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleMarkerOptions]
  }
}

