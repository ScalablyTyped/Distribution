package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapOverlayConfiguration[V /* <: java.lang.String */, TLat /* <: java.lang.String */, TLong /* <: java.lang.String */] extends BaseHeatmapConfiguration[V] {
  /**
    * The property name of your latitude coordinate in a datapoint
    * Default value: 'x'
    */
  var latField: js.UndefOr[TLat] = js.undefined
  /**
    * The property name of your longitude coordinate in a datapoint
    * Default value: 'y'
    */
  var lngField: js.UndefOr[TLong] = js.undefined
}

object HeatmapOverlayConfiguration {
  @scala.inline
  def apply[V /* <: java.lang.String */, TLat /* <: java.lang.String */, TLong /* <: java.lang.String */](
    backgroundColor: java.lang.String = null,
    blur: scala.Int | scala.Double = null,
    gradient: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    latField: TLat = null,
    lngField: TLong = null,
    maxOpacity: scala.Int | scala.Double = null,
    minOpacity: scala.Int | scala.Double = null,
    onExtremaChange: js.Function0[scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    scaleRadius: js.UndefOr[scala.Boolean] = js.undefined,
    useLocalExtrema: js.UndefOr[scala.Boolean] = js.undefined,
    valueField: V = null
  ): HeatmapOverlayConfiguration[V, TLat, TLong] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (latField != null) __obj.updateDynamic("latField")(latField.asInstanceOf[js.Any])
    if (lngField != null) __obj.updateDynamic("lngField")(lngField.asInstanceOf[js.Any])
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (onExtremaChange != null) __obj.updateDynamic("onExtremaChange")(onExtremaChange)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRadius)) __obj.updateDynamic("scaleRadius")(scaleRadius)
    if (!js.isUndefined(useLocalExtrema)) __obj.updateDynamic("useLocalExtrema")(useLocalExtrema)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapOverlayConfiguration[V, TLat, TLong]]
  }
}

