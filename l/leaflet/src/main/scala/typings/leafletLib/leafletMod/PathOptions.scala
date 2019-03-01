package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends InteractiveLayerOptions {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dashArray: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var dashOffset: js.UndefOr[java.lang.String] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  var fillRule: js.UndefOr[FillRule] = js.undefined
  var lineCap: js.UndefOr[LineCapShape] = js.undefined
  var lineJoin: js.UndefOr[LineJoinShape] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    bubblingMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: java.lang.String = null,
    dashArray: java.lang.String | js.Array[scala.Double] = null,
    dashOffset: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    fillRule: FillRule = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    lineCap: LineCapShape = null,
    lineJoin: LineJoinShape = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    renderer: Renderer = null,
    stroke: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): PathOptions = {
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
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

