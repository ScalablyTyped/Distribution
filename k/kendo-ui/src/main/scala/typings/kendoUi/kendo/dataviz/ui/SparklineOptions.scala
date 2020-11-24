package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineOptions extends js.Object {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var axisDefaults: js.UndefOr[js.Any] = js.native
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, Unit]] = js.native
  
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.native
  
  var chartArea: js.UndefOr[SparklineChartArea] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, Unit]] = js.native
  
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, Unit]] = js.native
  
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, Unit]] = js.native
  
  var plotArea: js.UndefOr[SparklinePlotArea] = js.native
  
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, Unit]] = js.native
  
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, Unit]] = js.native
  
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, Unit]] = js.native
  
  var pointWidth: js.UndefOr[Double] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.native
  
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, Unit]] = js.native
  
  var seriesColors: js.UndefOr[js.Any] = js.native
  
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.native
  
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, Unit]] = js.native
  
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, Unit]] = js.native
  
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, Unit]] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[SparklineTooltip] = js.native
  
  var transitions: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.native
  
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, Unit]] = js.native
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, Unit]] = js.native
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, Unit]] = js.native
}
object SparklineOptions {
  
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  
  @scala.inline
  implicit class SparklineOptionsOps[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setAxisDefaults(value: js.Any): Self = this.set("axisDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisDefaults: Self = this.set("axisDefaults", js.undefined)
    
    @scala.inline
    def setAxisLabelClick(value: /* e */ SparklineAxisLabelClickEvent => Unit): Self = this.set("axisLabelClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxisLabelClick: Self = this.set("axisLabelClick", js.undefined)
    
    @scala.inline
    def setCategoryAxisVarargs(value: SparklineCategoryAxisItem*): Self = this.set("categoryAxis", js.Array(value :_*))
    
    @scala.inline
    def setCategoryAxis(value: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    
    @scala.inline
    def setChartArea(value: SparklineChartArea): Self = this.set("chartArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartArea: Self = this.set("chartArea", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ SparklineEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ SparklineDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragEnd(value: /* e */ SparklineDragEndEvent => Unit): Self = this.set("dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragEnd: Self = this.set("dragEnd", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ SparklineDragStartEvent => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaneRender(value: /* e */ SparklinePaneRenderEvent => Unit): Self = this.set("paneRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaneRender: Self = this.set("paneRender", js.undefined)
    
    @scala.inline
    def setPlotArea(value: SparklinePlotArea): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    
    @scala.inline
    def setPlotAreaClick(value: /* e */ SparklinePlotAreaClickEvent => Unit): Self = this.set("plotAreaClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlotAreaClick: Self = this.set("plotAreaClick", js.undefined)
    
    @scala.inline
    def setPlotAreaHover(value: /* e */ SparklinePlotAreaHoverEvent => Unit): Self = this.set("plotAreaHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlotAreaHover: Self = this.set("plotAreaHover", js.undefined)
    
    @scala.inline
    def setPlotAreaLeave(value: /* e */ SparklinePlotAreaLeaveEvent => Unit): Self = this.set("plotAreaLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePlotAreaLeave: Self = this.set("plotAreaLeave", js.undefined)
    
    @scala.inline
    def setPointWidth(value: Double): Self = this.set("pointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointWidth: Self = this.set("pointWidth", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = this.set("renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAs: Self = this.set("renderAs", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: SparklineSeriesItem*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[SparklineSeriesItem]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesClick(value: /* e */ SparklineSeriesClickEvent => Unit): Self = this.set("seriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesClick: Self = this.set("seriesClick", js.undefined)
    
    @scala.inline
    def setSeriesColors(value: js.Any): Self = this.set("seriesColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesColors: Self = this.set("seriesColors", js.undefined)
    
    @scala.inline
    def setSeriesDefaults(value: SparklineSeriesDefaults): Self = this.set("seriesDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesDefaults: Self = this.set("seriesDefaults", js.undefined)
    
    @scala.inline
    def setSeriesHover(value: /* e */ SparklineSeriesHoverEvent => Unit): Self = this.set("seriesHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesHover: Self = this.set("seriesHover", js.undefined)
    
    @scala.inline
    def setSeriesLeave(value: /* e */ SparklineSeriesLeaveEvent => Unit): Self = this.set("seriesLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesLeave: Self = this.set("seriesLeave", js.undefined)
    
    @scala.inline
    def setSeriesOver(value: /* e */ SparklineSeriesOverEvent => Unit): Self = this.set("seriesOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSeriesOver: Self = this.set("seriesOver", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: SparklineTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueAxisVarargs(value: SparklineValueAxisItem*): Self = this.set("valueAxis", js.Array(value :_*))
    
    @scala.inline
    def setValueAxis(value: SparklineValueAxisItem | js.Array[SparklineValueAxisItem]): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
    
    @scala.inline
    def setZoom(value: /* e */ SparklineZoomEvent => Unit): Self = this.set("zoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomEnd(value: /* e */ SparklineZoomEndEvent => Unit): Self = this.set("zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomEnd: Self = this.set("zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ SparklineZoomStartEvent => Unit): Self = this.set("zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomStart: Self = this.set("zoomStart", js.undefined)
  }
}
