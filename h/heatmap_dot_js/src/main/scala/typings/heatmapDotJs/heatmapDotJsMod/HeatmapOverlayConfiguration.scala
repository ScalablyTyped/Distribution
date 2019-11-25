package typings.heatmapDotJs.heatmapDotJsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapOverlayConfiguration[V /* <: String */, TLat /* <: String */, TLong /* <: String */] extends BaseHeatmapConfiguration[V] {
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
  def apply[V /* <: String */, TLat /* <: String */, TLong /* <: String */](
    backgroundColor: String = null,
    blur: Int | Double = null,
    gradient: StringDictionary[String] = null,
    latField: TLat = null,
    lngField: TLong = null,
    maxOpacity: Int | Double = null,
    minOpacity: Int | Double = null,
    onExtremaChange: () => Unit = null,
    opacity: Int | Double = null,
    radius: Int | Double = null,
    scaleRadius: js.UndefOr[Boolean] = js.undefined,
    useLocalExtrema: js.UndefOr[Boolean] = js.undefined,
    valueField: V = null
  ): HeatmapOverlayConfiguration[V, TLat, TLong] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (latField != null) __obj.updateDynamic("latField")(latField.asInstanceOf[js.Any])
    if (lngField != null) __obj.updateDynamic("lngField")(lngField.asInstanceOf[js.Any])
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (onExtremaChange != null) __obj.updateDynamic("onExtremaChange")(js.Any.fromFunction0(onExtremaChange))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRadius)) __obj.updateDynamic("scaleRadius")(scaleRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalExtrema)) __obj.updateDynamic("useLocalExtrema")(useLocalExtrema.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapOverlayConfiguration[V, TLat, TLong]]
  }
}

