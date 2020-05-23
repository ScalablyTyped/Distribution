package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrilldownDrillUpButtonPositionOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Horizontal alignment.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highmaps) Vertical alignment of the button.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts, Highmaps) The X offset of the button.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) The Y offset of the button.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object DrilldownDrillUpButtonPositionOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    verticalAlign: VerticalAlignValue = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DrilldownDrillUpButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownDrillUpButtonPositionOptions]
  }
}

