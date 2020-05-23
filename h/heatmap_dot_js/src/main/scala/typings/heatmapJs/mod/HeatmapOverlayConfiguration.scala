package typings.heatmapJs.mod

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
  def apply[V, TLat, TLong](
    backgroundColor: String = null,
    blur: js.UndefOr[Double] = js.undefined,
    gradient: StringDictionary[String] = null,
    latField: TLat = null,
    lngField: TLong = null,
    maxOpacity: js.UndefOr[Double] = js.undefined,
    minOpacity: js.UndefOr[Double] = js.undefined,
    onExtremaChange: () => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    scaleRadius: js.UndefOr[Boolean] = js.undefined,
    useLocalExtrema: js.UndefOr[Boolean] = js.undefined,
    valueField: V = null
  ): HeatmapOverlayConfiguration[V, TLat, TLong] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (latField != null) __obj.updateDynamic("latField")(latField.asInstanceOf[js.Any])
    if (lngField != null) __obj.updateDynamic("lngField")(lngField.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOpacity)) __obj.updateDynamic("maxOpacity")(maxOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOpacity)) __obj.updateDynamic("minOpacity")(minOpacity.get.asInstanceOf[js.Any])
    if (onExtremaChange != null) __obj.updateDynamic("onExtremaChange")(js.Any.fromFunction0(onExtremaChange))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRadius)) __obj.updateDynamic("scaleRadius")(scaleRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalExtrema)) __obj.updateDynamic("useLocalExtrema")(useLocalExtrema.get.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapOverlayConfiguration[V, TLat, TLong]]
  }
}

