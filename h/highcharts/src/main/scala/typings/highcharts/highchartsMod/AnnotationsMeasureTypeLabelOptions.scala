package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsMeasureTypeLabelOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the label text (min, max, average, bins
    * values).
    *
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Formatter function for the label text.
    *
    * Available data are:
    *
    *  (see online documentation for example)
    */
  var formatter: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highstock) CSS styles for the measure label.
    */
  var style: js.UndefOr[AnnotationsMeasureTypeLabelStyleOptions | CSSObject] = js.undefined
}

object AnnotationsMeasureTypeLabelOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    formatter: js.Function = null,
    style: AnnotationsMeasureTypeLabelStyleOptions | CSSObject = null
  ): AnnotationsMeasureTypeLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelOptions]
  }
}

