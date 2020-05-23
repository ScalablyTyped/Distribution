package typings.heatmapJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapConfiguration[V /* <: String */, X /* <: String */, Y /* <: String */] extends BaseHeatmapConfiguration[V] {
  /**
    * A DOM node where the heatmap canvas should be appended (heatmap will adapt to
    * the node's size)
    */
  var container: HTMLElement
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
  def apply[V, X, Y](
    container: HTMLElement,
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
    valueField: V = null,
    xField: X = null,
    yField: Y = null
  ): HeatmapConfiguration[V, X, Y] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
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
    if (xField != null) __obj.updateDynamic("xField")(xField.asInstanceOf[js.Any])
    if (yField != null) __obj.updateDynamic("yField")(yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapConfiguration[V, X, Y]]
  }
}

