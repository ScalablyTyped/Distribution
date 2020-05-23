package typings.leafletDraw.mod.DrawOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleMarkerOptions extends js.Object {
  /**
    * Whether you can click the circle marker.
    *
    * @default true
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * The stroke color of the circle marker.
    *
    * @default '#3388ff'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Whether to fill the circle marker with color.
    *
    * @default true
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * The fill color of the circle marker. Defaults to the value of the color option.
    *
    * @default null
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the circle marker.
    *
    * @default 0.2
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The stroke opacity of the circle marker.
    *
    * @default 0.5
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Whether to draw stroke around the circle marker.
    *
    * @default true
    */
  var stroke: js.UndefOr[Boolean] = js.undefined
  /**
    * The stroke width in pixels of the circle marker.
    *
    * @default 4
    */
  var weight: js.UndefOr[Double] = js.undefined
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}

object CircleMarkerOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined,
    zIndexOffset: js.UndefOr[Double] = js.undefined
  ): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexOffset)) __obj.updateDynamic("zIndexOffset")(zIndexOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleMarkerOptions]
  }
}

