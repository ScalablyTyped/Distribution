package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification for a basic chart.  See BasicChartType for the list of
  * charts this supports.
  */
@js.native
trait SchemaBasicChartSpec extends StObject {
  
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
  implicit class SchemaBasicChartSpecMutableBuilder[Self <: SchemaBasicChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: js.Array[SchemaBasicChartAxis]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setAxisVarargs(value: SchemaBasicChartAxis*): Self = StObject.set(x, "axis", js.Array(value :_*))
    
    @scala.inline
    def setChartType(value: String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    @scala.inline
    def setCompareMode(value: String): Self = StObject.set(x, "compareMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareModeUndefined: Self = StObject.set(x, "compareMode", js.undefined)
    
    @scala.inline
    def setDomains(value: js.Array[SchemaBasicChartDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: SchemaBasicChartDomain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setHeaderCount(value: Double): Self = StObject.set(x, "headerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderCountUndefined: Self = StObject.set(x, "headerCount", js.undefined)
    
    @scala.inline
    def setInterpolateNulls(value: Boolean): Self = StObject.set(x, "interpolateNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateNullsUndefined: Self = StObject.set(x, "interpolateNulls", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    @scala.inline
    def setLineSmoothing(value: Boolean): Self = StObject.set(x, "lineSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSmoothingUndefined: Self = StObject.set(x, "lineSmoothing", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[SchemaBasicChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: SchemaBasicChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
    
    @scala.inline
    def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
  }
}
