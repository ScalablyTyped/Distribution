package typings.highcharts.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartEventsOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
    * the chart after load time, using the `addSeries` method. One parameter,
    * `event`, is passed to the function, containing common event information.
    * Through `event.options` you can access the series options that were
    * passed to the `addSeries` method. Returning false prevents the series
    * from being added.
    */
  var addSeries: js.UndefOr[ChartAddSeriesCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
    * through the context menu item or the `Chart.print` method.
    */
  var afterPrint: js.UndefOr[ExportingAfterPrintCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
    * through the context menu item or the `Chart.print` method.
    */
  var beforePrint: js.UndefOr[ExportingBeforePrintCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
    * background. One parameter, `event`, is passed to the function, containing
    * common event information.
    *
    * Information on the clicked spot can be found through `event.xAxis` and
    * `event.yAxis`, which are arrays containing the axes of each dimension and
    * each axis' value at the clicked spot. The primary axes are
    * `event.xAxis[0]` and `event.yAxis[0]`. Remember the unit of a datetime
    * axis is milliseconds since 1970-01-01 00:00:00. (see online documentation
    * for example)
    */
  var click: js.UndefOr[ChartClickCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highmaps) Fires when a drilldown point is clicked, before
    * the new series is added. This event is also utilized for async drilldown,
    * where the seriesOptions are not added by option, but rather loaded async.
    * Note that when clicking a category label to trigger multiple series
    * drilldown, one `drilldown` event is triggered per point in the category.
    *
    * Event arguments:
    *
    * - `category`: If a category label was clicked, which index.
    *
    * - `originalEvent`: The original browser event (usually click) that
    * triggered the drilldown.
    *
    * - `point`: The originating point.
    *
    * - `points`: If a category label was clicked, this array holds all points
    * corresponding to the category.
    *
    * - `seriesOptions`: Options for the new series.
    */
  var drilldown: js.UndefOr[DrilldownCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
    */
  var drillup: js.UndefOr[DrillupCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
    * event fires after all the series have been drilled up.
    */
  var drillupall: js.UndefOr[DrillupAllCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
    * exporting data. This allows the modification of data rows before
    * processed into the final format.
    */
  var exportData: js.UndefOr[ExportDataCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
    * loading. Since v4.2.2, it also waits for images to be loaded, for example
    * from point markers. One parameter, `event`, is passed to the function,
    * containing common event information.
    *
    * There is also a second parameter to the chart constructor where a
    * callback function can be passed to be executed on chart.load.
    */
  var load: js.UndefOr[ChartLoadCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
    * either after a call to `chart.redraw()` or after an axis, series or point
    * is modified with the `redraw` option set to `true`. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var redraw: js.UndefOr[ChartRedrawCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
    * chart (directly after the `load` event), and after each redraw (directly
    * after the `redraw` event).
    */
  var render: js.UndefOr[ChartRenderCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
    * has been selected. Selection is enabled by setting the chart's zoomType.
    * One parameter, `event`, is passed to the function, containing common
    * event information. The default action for the selection event is to zoom
    * the chart to the selected area. It can be prevented by calling
    * `event.preventDefault()` or return false.
    *
    * Information on the selected area can be found through `event.xAxis` and
    * `event.yAxis`, which are arrays containing the axes of each dimension and
    * each axis' min and max values. The primary axes are `event.xAxis[0]` and
    * `event.yAxis[0]`. Remember the unit of a datetime axis is milliseconds
    * since 1970-01-01 00:00:00. (see online documentation for example)
    */
  var selection: js.UndefOr[ChartSelectionCallbackFunction] = js.native
}
object ChartEventsOptions {
  
  @scala.inline
  def apply(): ChartEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartEventsOptions]
  }
  
  @scala.inline
  implicit class ChartEventsOptionsOps[Self <: ChartEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddSeries(value: ChartAddSeriesCallbackFunction): Self = this.set("addSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSeries: Self = this.set("addSeries", js.undefined)
    
    @scala.inline
    def setAfterPrint(value: (/* chart */ Chart_, /* event */ Event) => Unit): Self = this.set("afterPrint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterPrint: Self = this.set("afterPrint", js.undefined)
    
    @scala.inline
    def setBeforePrint(value: (/* chart */ Chart_, /* event */ Event) => Unit): Self = this.set("beforePrint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforePrint: Self = this.set("beforePrint", js.undefined)
    
    @scala.inline
    def setClick(value: ChartClickCallbackFunction): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDrilldown(value: DrilldownCallbackFunction): Self = this.set("drilldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrilldown: Self = this.set("drilldown", js.undefined)
    
    @scala.inline
    def setDrillup(value: DrillupCallbackFunction): Self = this.set("drillup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillup: Self = this.set("drillup", js.undefined)
    
    @scala.inline
    def setDrillupall(value: DrillupAllCallbackFunction): Self = this.set("drillupall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillupall: Self = this.set("drillupall", js.undefined)
    
    @scala.inline
    def setExportData(value: ExportDataCallbackFunction): Self = this.set("exportData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportData: Self = this.set("exportData", js.undefined)
    
    @scala.inline
    def setLoad(value: ChartLoadCallbackFunction): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setRedraw(value: ChartRedrawCallbackFunction): Self = this.set("redraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    
    @scala.inline
    def setRender(value: ChartRenderCallbackFunction): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSelection(value: ChartSelectionCallbackFunction): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
  }
}
