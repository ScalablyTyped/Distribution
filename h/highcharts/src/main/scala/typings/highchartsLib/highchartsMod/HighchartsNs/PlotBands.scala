package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlotBands extends js.Object {
  /**
           * Border color for the plot band. Also requires borderWidth to be set.
           * @default null
           */
  var borderColor: js.UndefOr[Color | scala.Null] = js.undefined
  /**
           * Border width for the plot band. Also requires borderColor to be set.
           * @default 0
           */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * A custom class name, in addition to the default highcharts-plot-band, to apply to each individual band.
           * @since 5.0.0
           */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The color of the plot band.
           */
  var color: js.UndefOr[Color] = js.undefined
  /**
           * An object defining mouse events for the plot band. Supported properties are click, mouseover, mouseout,
           * mousemove.
           * The this keyword refers to the PlotLineOrBand object.
           * @since 1.2
           */
  var events: js.UndefOr[MousePlotEvents] = js.undefined
  /**
           * The start position of the plot band in axis units.
           */
  var from: js.UndefOr[scala.Double] = js.undefined
  /**
           * An id used for identifying the plot band in Axis.removePlotBand.
           */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
           * In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It
           * can be given as a percentage string, like '100%', or as a pixel number, like 100. By default, the inner radius is
           * controlled by the thickness option.
           * Only defined for yAxis.plotBands
           * @default null
           * @since 2.3
           */
  var innerRadius: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
  /**
           * Text labels for the plot bands
           */
  var label: js.UndefOr[PlotLabel] = js.undefined
  /**
           * In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It
           * can be given as a percentage string, like '100%', or as a pixel number, like 100.
           * Only defined for yAxis.plotBands
           * @default '100%'
           * @since 2.3
           */
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as
           * a percentage string, like '10%', or as a pixel number, like 10. The default value 10 is the same as the default
           * tickLength, thus making the plot band act as a background for the tick markers.
           * Only defined for yAxis.plotBands
           * @default 10
           * @since 2.3
           */
  var thickness: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
           * The end position of the plot band in axis units.
           */
  var to: js.UndefOr[scala.Double] = js.undefined
  /**
           * The z index of the plot band within the chart, relative to other elements. Using the same z index as another
           * element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make
           * sense.
           * @since 1.2
           */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

