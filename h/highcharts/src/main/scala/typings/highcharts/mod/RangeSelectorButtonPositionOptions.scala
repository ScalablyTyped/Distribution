package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonPositionOptions extends js.Object {
  /**
    * (Highstock, Gantt) The alignment of the input box. Allowed properties are
    * `left`, `center`, `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highstock, Gantt) X offset of the button row.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Y offset of the button row.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object RangeSelectorButtonPositionOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): RangeSelectorButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorButtonPositionOptions]
  }
}

