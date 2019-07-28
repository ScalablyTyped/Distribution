package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapDrillUpButtonPositionOptions extends js.Object {
  /**
    * (Highcharts) Horizontal alignment of the button.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts) Vertical alignment of the button.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts) Horizontal offset of the button.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Vertical offset of the button.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PlotTreemapDrillUpButtonPositionOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PlotTreemapDrillUpButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTreemapDrillUpButtonPositionOptions]
  }
}

