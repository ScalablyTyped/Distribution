package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorHandlesOptions extends js.Object {
  /**
    * (Highstock, Gantt) The fill for the handle.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock, Gantt) The stroke for the handle border and the stripes
    * inside.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock, Gantt) Allows to enable/disable handles.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Height for handles.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The width for the handle border and the stripes
    * inside.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
    * 1-index for right.
    *
    * Additionally, the URL to a graphic can be given on this form:
    * `url(graphic.png)`. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbols: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highstock, Gantt) Width for handles.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NavigatorHandlesOptions {
  @scala.inline
  def apply(
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    symbols: js.Array[String] = null,
    width: js.UndefOr[Double] = js.undefined
  ): NavigatorHandlesOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorHandlesOptions]
  }
}

