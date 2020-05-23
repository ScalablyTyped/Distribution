package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesTitleOptions extends js.Object {
  var reserveSpace: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Alignment of the text, can be `"left"`, `"right"` or
    * `"center"`. Default alignment depends on the title.align:
    *
    * Horizontal axes:
    *
    * - for `align` = `"low"`, `textAlign` is set to `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"`, `textAlign` is set to `right`
    *
    * Vertical axes:
    *
    * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
    * `right`
    *
    * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
    * `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
    * `left`
    *
    * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
    * `right`
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
}

object ChartParallelAxesTitleOptions {
  @scala.inline
  def apply(
    reserveSpace: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textAlign: AlignValue = null
  ): ChartParallelAxesTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesTitleOptions]
  }
}

