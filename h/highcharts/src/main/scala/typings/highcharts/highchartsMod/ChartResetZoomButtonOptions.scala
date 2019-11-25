package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartResetZoomButtonOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The position of the button.
    */
  var position: js.UndefOr[AlignObject | ChartResetZoomButtonPositionOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) What frame the button placement
    * should be related to. Can be either `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of attributes for
    * the button. The object takes SVG attributes like `fill`, `stroke`,
    * `stroke-width` or `r`, the border radius. The theme also supports
    * `style`, a collection of CSS properties for the text. Equivalent
    * attributes for the hover state are given in `theme.states.hover`.
    */
  var theme: js.UndefOr[SVGAttributes] = js.undefined
}

object ChartResetZoomButtonOptions {
  @scala.inline
  def apply(
    position: AlignObject | ChartResetZoomButtonPositionOptions = null,
    relativeTo: ButtonRelativeToValue = null,
    theme: SVGAttributes = null
  ): ChartResetZoomButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartResetZoomButtonOptions]
  }
}

