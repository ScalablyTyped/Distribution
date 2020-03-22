package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgChartLegend
  extends /**
	 * Option for igChartLegend
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row -  (if any), etc.null will stretch vertically to fit data, no other height are defined
  	 *
  	 *
  	 * Valid values:
  	 * "null"
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Type of the legend.
  	 *
  	 * Valid values:
  	 * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
  	 * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgChartLegend {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igChartLegend
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    height: String | Double = null,
    `type`: String = null,
    width: String | Double = null
  ): IgChartLegend = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgChartLegend]
  }
}

