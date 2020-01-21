package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgChartLegend
  extends /**
	 * Option for igChartLegend
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The height of the legend. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
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
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[String] = js.undefined
  /**
  	 * Type of the legend.
  	 *
  	 * Valid values:
  	 * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
  	 * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
  	 * "scale" Specify the legend as a scale legend. It displays a color/size scale for the bubble series.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  	 * The width of the legend. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
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
    language: String = null,
    legendItemMouseEnter: (/* event */ Event_, /* ui */ LegendItemMouseEnterEventUIParam) => Unit = null,
    legendItemMouseLeave: (/* event */ Event_, /* ui */ LegendItemMouseLeaveEventUIParam) => Unit = null,
    legendItemMouseLeftButtonDown: (/* event */ Event_, /* ui */ LegendItemMouseLeftButtonDownEventUIParam) => Unit = null,
    legendItemMouseLeftButtonUp: (/* event */ Event_, /* ui */ LegendItemMouseLeftButtonUpEventUIParam) => Unit = null,
    locale: js.Any = null,
    regional: String | js.Object = null,
    theme: String = null,
    `type`: String = null,
    width: String | Double = null
  ): IgChartLegend = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (legendItemMouseEnter != null) __obj.updateDynamic("legendItemMouseEnter")(js.Any.fromFunction2(legendItemMouseEnter))
    if (legendItemMouseLeave != null) __obj.updateDynamic("legendItemMouseLeave")(js.Any.fromFunction2(legendItemMouseLeave))
    if (legendItemMouseLeftButtonDown != null) __obj.updateDynamic("legendItemMouseLeftButtonDown")(js.Any.fromFunction2(legendItemMouseLeftButtonDown))
    if (legendItemMouseLeftButtonUp != null) __obj.updateDynamic("legendItemMouseLeftButtonUp")(js.Any.fromFunction2(legendItemMouseLeftButtonUp))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgChartLegend]
  }
}

