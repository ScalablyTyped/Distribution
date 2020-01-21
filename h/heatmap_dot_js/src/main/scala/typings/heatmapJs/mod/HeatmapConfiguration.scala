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
  def apply[V /* <: String */, X /* <: String */, Y /* <: String */](
    container: HTMLElement,
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
    valueField: V = null,
    xField: X = null,
    yField: Y = null
  ): HeatmapConfiguration[V, X, Y] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (onExtremaChange != null) __obj.updateDynamic("onExtremaChange")(js.Any.fromFunction0(onExtremaChange))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRadius)) __obj.updateDynamic("scaleRadius")(scaleRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalExtrema)) __obj.updateDynamic("useLocalExtrema")(useLocalExtrema.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (xField != null) __obj.updateDynamic("xField")(xField.asInstanceOf[js.Any])
    if (yField != null) __obj.updateDynamic("yField")(yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapConfiguration[V, X, Y]]
  }
}

