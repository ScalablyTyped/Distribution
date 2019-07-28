package typings.heatmapDotJs.heatmapDotJsMod

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
  def apply[V /* <: String */](
    backgroundColor: String = null,
    blur: Int | Double = null,
    gradient: StringDictionary[String] = null,
    maxOpacity: Int | Double = null,
    minOpacity: Int | Double = null,
    onExtremaChange: () => Unit = null,
    opacity: Int | Double = null,
    radius: Int | Double = null,
    scaleRadius: js.UndefOr[Boolean] = js.undefined,
    useLocalExtrema: js.UndefOr[Boolean] = js.undefined,
    valueField: V = null
  ): BaseHeatmapConfiguration[V] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (onExtremaChange != null) __obj.updateDynamic("onExtremaChange")(js.Any.fromFunction0(onExtremaChange))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRadius)) __obj.updateDynamic("scaleRadius")(scaleRadius)
    if (!js.isUndefined(useLocalExtrema)) __obj.updateDynamic("useLocalExtrema")(useLocalExtrema)
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHeatmapConfiguration[V]]
  }
}

