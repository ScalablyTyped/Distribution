package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A chart can have from 0 axes (pie chart) to multiples. In a normal, single series cartesian chart, there is one X
     * axis and one Y axis.
     *
     * The X axis or axes are referenced by chart.xAxis, which is an array of Axis objects. If there is only one axis, it
     * can be referenced through chart.xAxis[0], and multiple axes have increasing indices. The same pattern goes for Y
     * axes.
     *
     * If you need to get the axes from a series object, use the series.xAxis andseries.yAxis properties. These are not
     * arrays, as one series can only be associated to one X and one Y axis.
     *
     * A third way to reference the axis programmatically is by id. Add an id in the axis configuration options, and get the
     * axis by chart.get(id).
     *
     * Configuration options for the axes are given in options.xAxis and options.yAxis.
     */
@js.native
trait AxisObject extends js.Object {
  var bottom: scala.Double = js.native
  var dataMax: scala.Double = js.native
  var dataMin: scala.Double = js.native
  var left: scala.Double = js.native
  var userMax: scala.Double = js.native
  var userMin: scala.Double = js.native
  var width: scala.Double = js.native
  /**
           * Add a plot band after render time.
           * @param options A configuration object consisting of the same members as options.xAxis.plotBands
           * @since 1.2.0
           */
  def addPlotBand(options: PlotBands): scala.Unit = js.native
  /**
           * Add a plot line after render time.
           * @param options A configuration object consisting of the same members as options.xAxis.plotLines
           * @since 1.2.0
           */
  def addPlotLine(options: PlotLines): scala.Unit = js.native
  def defaultLabelFormatter(`this`: AxisLabelFormatterOptions): java.lang.String = js.native
  /**
           * Get the current extremes for the axis.
           * @since 1.2.0
           */
  def getExtremes(): Extremes = js.native
  /**
           * Remove an axis from the chart.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart following the remove.
           * @since 3.0
           */
  def remove(): scala.Unit = js.native
  /**
           * Remove an axis from the chart.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart following the remove.
           * @since 3.0
           */
  def remove(redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Remove a plot band by its id.
           * @param id The plot band's id as given in the original configuration object or in the addPlotBand method.
           * @since 1.2.0
           */
  def removePlotBand(id: java.lang.String): scala.Unit = js.native
  /**
           * Remove a plot line by its id.
           * @param id The plot line's id as given in the original configuration object or in the addPlotLine method.
           * @since 1.2.0
           */
  def removePlotLine(id: java.lang.String): scala.Unit = js.native
  /**
           * Set new categories for the axis. Redraws.
           * @param categories The new category names.
           * @since 1.2.0
           */
  def setCategories(categories: js.Array[java.lang.String]): scala.Unit = js.native
  /**
           * Set new categories for the axis.
           * @param categories The new category names.
           * @param  redraw     Whether to redraw the axis or wait for an explicit call to chart.redraw().
           * @since 1.2.0
           */
  def setCategories(categories: js.Array[java.lang.String], redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(min: scala.Double): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(min: scala.Double, max: scala.Double): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(min: scala.Double, max: scala.Double, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(min: scala.Double, max: scala.Double, redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(
    min: scala.Double,
    max: scala.Double,
    redraw: scala.Boolean,
    animation: Animation,
    eventArguments: js.Any
  ): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(min: scala.Double, max: scala.Double, redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the
           * minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to
           * false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which
           * by default is the range of five points.
           * @param min The new minimum value
           * @param max The new maximum value
           * @param redraw Whether to redraw the chart or wait for an explicit call to chart.redraw().
           * @param animation When true, the resize will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def setExtremes(
    min: scala.Double,
    max: scala.Double,
    redraw: scala.Boolean,
    animation: scala.Boolean,
    eventArguments: js.Any
  ): scala.Unit = js.native
  /**
           * Update the title of the axis after render time.
           * @param title  The new title options on the same format as given in xAxis.title.
           * @param             redraw Whether to redraw the chart now or hold until the next chart.redraw()
           * @since 2.2
           */
  def setTitle(title: AxisTitle): scala.Unit = js.native
  /**
           * Update the title of the axis after render time.
           * @param title  The new title options on the same format as given in xAxis.title.
           * @param             redraw Whether to redraw the chart now or hold until the next chart.redraw()
           * @since 2.2
           */
  def setTitle(title: AxisTitle, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Translates a value in terms of axis units in to pixels within the chart.
           * @param   value           A value in terms of axis units.
           * @param  paneCoordinates Whether to return the pixel coordinate relative to the chart or just the axis/pane itself.
           * @since 3.0
           */
  def toPixels(value: scala.Double): scala.Double = js.native
  /**
           * Translates a value in terms of axis units in to pixels within the chart.
           * @param   value           A value in terms of axis units.
           * @param  paneCoordinates Whether to return the pixel coordinate relative to the chart or just the axis/pane itself.
           * @since 3.0
           */
  def toPixels(value: scala.Double, paneCoordinates: scala.Boolean): scala.Double = js.native
  /**
           * Translate a pixel position along the axis to a value in terms of axis units.
           * @param   pixel           A pixel position along the axis.
           * @param  paneCoordinates Whether the input pixel position is relative to the chart or just the axis/pane itself.
           * @since 3.0
           */
  def toValue(pixel: scala.Double): scala.Double = js.native
  /**
           * Translate a pixel position along the axis to a value in terms of axis units.
           * @param   pixel           A pixel position along the axis.
           * @param  paneCoordinates Whether the input pixel position is relative to the chart or just the axis/pane itself.
           * @since 3.0
           */
  def toValue(pixel: scala.Double, paneCoordinates: scala.Boolean): scala.Double = js.native
  /**
           * Update an axis object with a new set of options. The options are merged with the existing options, so only new or
           * altered options need to be specified.
           * @param options The new options that will be merged in with existing options on the axis.
           * @param               redraw  Defaults to true. Whether to redraw the chart after the new options are set.
           * @since 3.0
           */
  def update(options: AxisOptions): scala.Unit = js.native
  /**
           * Update an axis object with a new set of options. The options are merged with the existing options, so only new or
           * altered options need to be specified.
           * @param options The new options that will be merged in with existing options on the axis.
           * @param               redraw  Defaults to true. Whether to redraw the chart after the new options are set.
           * @since 3.0
           */
  def update(options: AxisOptions, redraw: scala.Boolean): scala.Unit = js.native
}

