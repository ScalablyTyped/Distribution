package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsItemsOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Inner HTML or text for the label.
    */
  var html: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) CSS styles for each label. To position the label,
    * use left and top like this:
    *
    * (see online documentation for example)
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object LabelsItemsOptions {
  @scala.inline
  def apply(html: String = null, style: CSSObject = null): LabelsItemsOptions = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LabelsItemsOptions]
  }
}

