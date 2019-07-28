package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoDataPositionOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Horizontal alignment of the label.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Vertical alignment of the label.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Horizontal offset of the label, in pixels.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Vertical offset of the label, in pixels.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NoDataPositionOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): NoDataPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoDataPositionOptions]
  }
}

