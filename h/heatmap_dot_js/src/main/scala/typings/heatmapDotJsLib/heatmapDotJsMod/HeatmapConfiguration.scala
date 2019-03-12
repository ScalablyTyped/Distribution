package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapConfiguration[V /* <: java.lang.String */, X /* <: java.lang.String */, Y /* <: java.lang.String */] extends BaseHeatmapConfiguration[V] {
  /**
    * A DOM node where the heatmap canvas should be appended (heatmap will adapt to
    * the node's size)
    */
  var container: stdLib.HTMLElement
  /**
    * The property name of your x coordinate in a datapoint
    * Default value: 'x'
    */
  var xField: js.UndefOr[X] = js.undefined
  /**
    * The property name of your y coordinate in a datapoint
    * Default value: 'y'
    */
  var yField: js.UndefOr[Y] = js.undefined
}

object HeatmapConfiguration {
  @scala.inline
  def apply[V /* <: java.lang.String */, X /* <: java.lang.String */, Y /* <: java.lang.String */](
    container: stdLib.HTMLElement,
    backgroundColor: java.lang.String = null,
    blur: scala.Int | scala.Double = null,
    gradient: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    maxOpacity: scala.Int | scala.Double = null,
    minOpacity: scala.Int | scala.Double = null,
    onExtremaChange: () => scala.Unit = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    scaleRadius: js.UndefOr[scala.Boolean] = js.undefined,
    useLocalExtrema: js.UndefOr[scala.Boolean] = js.undefined,
    valueField: V = null,
    xField: X = null,
    yField: Y = null
  ): HeatmapConfiguration[V, X, Y] = {
    val __obj = js.Dynamic.literal(container = container)
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
    if (xField != null) __obj.updateDynamic("xField")(xField.asInstanceOf[js.Any])
    if (yField != null) __obj.updateDynamic("yField")(yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapConfiguration[V, X, Y]]
  }
}

