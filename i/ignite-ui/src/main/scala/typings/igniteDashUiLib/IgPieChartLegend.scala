package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgPieChartLegend
  extends /**
	 * Option for IgPieChartLegend
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

