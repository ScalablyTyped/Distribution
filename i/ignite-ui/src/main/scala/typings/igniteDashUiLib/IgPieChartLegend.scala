package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPieChartLegend
  extends /**
	 * Option for IgPieChartLegend
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The name of the element to turn into a legend.
  	 */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The height of the legend. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Type of the legend.
  	 *
  	 * Valid values:
  	 * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
  	 * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The width of the legend. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IgPieChartLegend {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPieChartLegend
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    element: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): IgPieChartLegend = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (element != null) __obj.updateDynamic("element")(element)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPieChartLegend]
  }
}

