package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPieChartLegend
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The name of the element to turn into a legend.
    */
  var element: js.UndefOr[String] = js.undefined
  /**
    * The height of the legend. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Type of the legend.
    *
    * Valid values:
    * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
    * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The width of the legend. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IgPieChartLegend {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    element: String = null,
    height: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): IgPieChartLegend = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPieChartLegend]
  }
}

