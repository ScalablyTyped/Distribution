package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification for a basic chart.  See BasicChartType for the list of
  * charts this supports.
  */
@js.native
trait SchemaBasicChartSpec extends js.Object {
  
  /**
    * The axis on the chart.
    */
  var axis: js.UndefOr[js.Array[SchemaBasicChartAxis]] = js.native
  
  /**
    * The type of the chart.
    */
  var chartType: js.UndefOr[String] = js.native
  
  /**
    * The behavior of tooltips and data highlighting when hovering on data and
    * chart area.
    */
  var compareMode: js.UndefOr[String] = js.native
  
  /**
    * The domain of data this is charting. Only a single domain is supported.
    */
  var domains: js.UndefOr[js.Array[SchemaBasicChartDomain]] = js.native
  
  /**
    * The number of rows or columns in the data that are &quot;headers&quot;.
    * If not set, Google Sheets will guess how many rows are headers based on
    * the data.  (Note that BasicChartAxis.title may override the axis title
    * inferred from the header values.)
    */
  var headerCount: js.UndefOr[Double] = js.native
  
  /**
    * If some values in a series are missing, gaps may appear in the chart
    * (e.g, segments of lines in a line chart will be missing).  To eliminate
    * these gaps set this to true. Applies to Line, Area, and Combo charts.
    */
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  
  /**
    * The position of the chart legend.
    */
  var legendPosition: js.UndefOr[String] = js.native
  
  /**
    * Gets whether all lines should be rendered smooth or straight by default.
    * Applies to Line charts.
    */
  var lineSmoothing: js.UndefOr[Boolean] = js.native
  
  /**
    * The data this chart is visualizing.
    */
  var series: js.UndefOr[js.Array[SchemaBasicChartSeries]] = js.native
  
  /**
    * The stacked type for charts that support vertical stacking. Applies to
    * Area, Bar, Column, Combo, and Stepped Area charts.
    */
  var stackedType: js.UndefOr[String] = js.native
  
  /**
    * True to make the chart 3D. Applies to Bar and Column charts.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}
object SchemaBasicChartSpec {
  
  @scala.inline
  def apply(): SchemaBasicChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartSpec]
  }
  
  @scala.inline
  implicit class SchemaBasicChartSpecOps[Self <: SchemaBasicChartSpec] (val x: Self) extends AnyVal {
    
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
    def setAxisVarargs(value: SchemaBasicChartAxis*): Self = this.set("axis", js.Array(value :_*))
    
    @scala.inline
    def setAxis(value: js.Array[SchemaBasicChartAxis]): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setChartType(value: String): Self = this.set("chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    
    @scala.inline
    def setCompareMode(value: String): Self = this.set("compareMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareMode: Self = this.set("compareMode", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: SchemaBasicChartDomain*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[SchemaBasicChartDomain]): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setHeaderCount(value: Double): Self = this.set("headerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderCount: Self = this.set("headerCount", js.undefined)
    
    @scala.inline
    def setInterpolateNulls(value: Boolean): Self = this.set("interpolateNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolateNulls: Self = this.set("interpolateNulls", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setLineSmoothing(value: Boolean): Self = this.set("lineSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSmoothing: Self = this.set("lineSmoothing", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: SchemaBasicChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[SchemaBasicChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setStackedType(value: String): Self = this.set("stackedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedType: Self = this.set("stackedType", js.undefined)
    
    @scala.inline
    def setThreeDimensional(value: Boolean): Self = this.set("threeDimensional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreeDimensional: Self = this.set("threeDimensional", js.undefined)
  }
}
