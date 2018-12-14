package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgChartLegend
  extends /**
	 * Option for igChartLegend
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The height of the legend. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Occurs when the left mouse pointer enters an element of this legend.
  	 * Function takes arguments evt and ui.
  	 * Use ui.legend to get reference to current legend object.
  	 * Use ui.chart to get reference to chart owner object.
  	 * Use ui.series to get reference to current series owner object.
  	 * Use ui.actualItemBrush to get legend item brush.
  	 * Use ui.actualSeriesBrush to get series owner brush.
  	 * Use ui.item to get reference to chart item related to event.
  	 */
  var legendItemMouseEnter: js.UndefOr[LegendItemMouseEnterEvent] = js.undefined
  /**
  	 * Occurs when the left mouse pointer leaves an element of this legend.
  	 * Function takes arguments evt and ui.
  	 * Use ui.legend to get reference to current legend object.
  	 * Use ui.chart to get reference to chart owner object.
  	 * Use ui.series to get reference to current series owner object.
  	 * Use ui.actualItemBrush to get legend item brush.
  	 * Use ui.actualSeriesBrush to get series owner brush.
  	 * Use ui.item to get reference to chart item related to event.
  	 */
  var legendItemMouseLeave: js.UndefOr[LegendItemMouseLeaveEvent] = js.undefined
  /**
  	 * Occurs when the left mouse button is pressed while the mouse pointer is over an element of this legend.
  	 * Function takes arguments evt and ui.
  	 * Use ui.legend to get reference to current legend object.
  	 * Use ui.chart to get reference to chart owner object.
  	 * Use ui.series to get reference to current series owner object.
  	 * Use ui.actualItemBrush to get legend item brush.
  	 * Use ui.actualSeriesBrush to get series owner brush.
  	 * Use ui.item to get reference to chart item related to event.
  	 */
  var legendItemMouseLeftButtonDown: js.UndefOr[LegendItemMouseLeftButtonDownEvent] = js.undefined
  /**
  	 * Occurs when the left mouse button is released while the mouse pointer is over an element of this legend.
  	 * Function takes arguments evt and ui.
  	 * Use ui.legend to get reference to current legend object.
  	 * Use ui.chart to get reference to chart owner object.
  	 * Use ui.series to get reference to current series owner object.
  	 * Use ui.actualItemBrush to get legend item brush.
  	 * Use ui.actualSeriesBrush to get series owner brush.
  	 * Use ui.item to get reference to chart item related to event.
  	 */
  var legendItemMouseLeftButtonUp: js.UndefOr[LegendItemMouseLeftButtonUpEvent] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Type of the legend.
  	 *
  	 * Valid values:
  	 * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
  	 * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
  	 * "scale" Specify the legend as a scale legend. It displays a color/size scale for the bubble series.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The width of the legend. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

