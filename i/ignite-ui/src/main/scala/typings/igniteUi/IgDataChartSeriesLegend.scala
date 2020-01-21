package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDataChartSeriesLegend
  extends /**
	 * Option for IgDataChartSeriesLegend
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The name of the element to turn into a legend.
  	 */
  var element: js.UndefOr[String] = js.undefined
  /**
  	 * The height of the legend.null will stretch vertically to fit data, no other height are defined
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
  /**
  	 * The width of the legend.
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgDataChartSeriesLegend {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgDataChartSeriesLegend
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    element: String = null,
    height: String | Double = null,
    `type`: String = null,
    width: String | Double = null
  ): IgDataChartSeriesLegend = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDataChartSeriesLegend]
  }
}

