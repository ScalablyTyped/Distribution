package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrilldownDrillUpButtonOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Positioning options for the button within the
    * `relativeTo` box. Available properties are `x`, `y`, `align` and
    * `verticalAlign`.
    */
  var position: js.UndefOr[AlignObject | DrilldownDrillUpButtonPositionOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) What box to align the button to. Can be either
    * `plotBox` or `spacingBox`.
    */
  var relativeTo: js.UndefOr[ButtonRelativeToValue] = js.undefined
  /**
    * (Highcharts, Highmaps) A collection of attributes for the button. The
    * object takes SVG attributes like `fill`, `stroke`, `stroke-width` or `r`,
    * the border radius. The theme also supports `style`, a collection of CSS
    * properties for the text. Equivalent attributes for the hover state are
    * given in `theme.states.hover`.
    *
    * In styled mode, drill-up button styles can be applied with the
    * `.highcharts-drillup-button` class.
    */
  var theme: js.UndefOr[js.Object] = js.undefined
}

object DrilldownDrillUpButtonOptions {
  @scala.inline
  def apply(
    position: AlignObject | DrilldownDrillUpButtonPositionOptions = null,
    relativeTo: ButtonRelativeToValue = null,
    theme: js.Object = null
  ): DrilldownDrillUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownDrillUpButtonOptions]
  }
}

