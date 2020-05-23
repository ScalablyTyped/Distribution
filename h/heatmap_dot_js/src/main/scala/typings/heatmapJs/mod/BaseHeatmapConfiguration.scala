package typings.heatmapJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHeatmapConfiguration[V /* <: String */] extends js.Object {
  /**
    * A background color string in form of hexcode, color name, or rgb(a)
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The blur factor that will be applied to all datapoints. The higher the
    * blur factor is, the smoother the gradients will be
    * Default value: 0.85
    */
  var blur: js.UndefOr[Double] = js.undefined
  /**
    * An object that represents the gradient.
    * Syntax: {[key: number in range [0,1]]: color}
    */
  var gradient: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The maximal opacity the highest value in the heatmap will have. (will be
    * overridden if opacity set)
    * Default value: 0.6
    */
  var maxOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The minimum opacity the lowest value in the heatmap will have (will be
    * overridden if opacity set)
    */
  var minOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Pass a callback to receive extrema change updates. Useful for DOM
    * legends.
    */
  var onExtremaChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A global opacity for the whole heatmap. This overrides maxOpacity and
    * minOpacity if set
    * Default value: 0.6
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The radius each datapoint will have (if not specified on the datapoint
    * itself)
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Scales the radius based on map zoom.
    */
  var scaleRadius: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicate whether the heatmap should use a global extrema or a local
    * extrema (the maximum and minimum of the currently displayed viewport)
    */
  var useLocalExtrema: js.UndefOr[Boolean] = js.undefined
  /**
    * The property name of the value/weight in a datapoint
    * Default value: 'value'
    */
  var valueField: js.UndefOr[V] = js.undefined
}

object BaseHeatmapConfiguration {
  @scala.inline
  def apply[V](
    backgroundColor: String = null,
    blur: js.UndefOr[Double] = js.undefined,
    gradient: StringDictionary[String] = null,
    maxOpacity: js.UndefOr[Double] = js.undefined,
    minOpacity: js.UndefOr[Double] = js.undefined,
    onExtremaChange: () => Unit = null,
    opacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    scaleRadius: js.UndefOr[Boolean] = js.undefined,
    useLocalExtrema: js.UndefOr[Boolean] = js.undefined,
    valueField: V = null
  ): BaseHeatmapConfiguration[V] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOpacity)) __obj.updateDynamic("maxOpacity")(maxOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOpacity)) __obj.updateDynamic("minOpacity")(minOpacity.get.asInstanceOf[js.Any])
    if (onExtremaChange != null) __obj.updateDynamic("onExtremaChange")(js.Any.fromFunction0(onExtremaChange))
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRadius)) __obj.updateDynamic("scaleRadius")(scaleRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalExtrema)) __obj.updateDynamic("useLocalExtrema")(useLocalExtrema.get.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHeatmapConfiguration[V]]
  }
}

