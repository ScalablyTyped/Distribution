package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoDataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
    * the no-data label.
    */
  var attr: js.UndefOr[SVGAttributes] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The position of the no-data label,
    * relative to the plot area.
    */
  var position: js.UndefOr[AlignObject | NoDataPositionOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
    * pseudo-HTML rendered with SVG.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
}

object NoDataOptions {
  @scala.inline
  def apply(
    attr: SVGAttributes = null,
    position: AlignObject | NoDataPositionOptions = null,
    style: CSSObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined
  ): NoDataOptions = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoDataOptions]
  }
}

