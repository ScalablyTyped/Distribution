package typings.leafletDraw.anon

import typings.leaflet.mod.FillRule
import typings.leaflet.mod.LineCapShape
import typings.leaflet.mod.LineJoinShape
import typings.leaflet.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.PolylineOptions & {  clickable ? :boolean} */
trait PolylineOptionsclickableb extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dashArray: js.UndefOr[String | js.Array[Double]] = js.undefined
  var dashOffset: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var fillRule: js.UndefOr[FillRule] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var lineCap: js.UndefOr[LineCapShape] = js.undefined
  var lineJoin: js.UndefOr[LineJoinShape] = js.undefined
  var noClip: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  var smoothFactor: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[Boolean] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object PolylineOptionsclickableb {
  @scala.inline
  def apply(
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dashArray: String | js.Array[Double] = null,
    dashOffset: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    fillRule: FillRule = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    lineCap: LineCapShape = null,
    lineJoin: LineJoinShape = null,
    noClip: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    renderer: Renderer = null,
    smoothFactor: js.UndefOr[Double] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): PolylineOptionsclickableb = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (dashOffset != null) __obj.updateDynamic("dashOffset")(dashOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(noClip)) __obj.updateDynamic("noClip")(noClip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothFactor)) __obj.updateDynamic("smoothFactor")(smoothFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptionsclickableb]
  }
}

