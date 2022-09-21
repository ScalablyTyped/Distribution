package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaXyChart extends StObject {
  
  /**
    * Display options for the chart.
    */
  var chartOptions: js.UndefOr[SchemaChartOptions] = js.undefined
  
  /**
    * Required. The data displayed in this chart.
    */
  var dataSets: js.UndefOr[js.Array[SchemaDataSet]] = js.undefined
  
  /**
    * Threshold lines drawn horizontally across the chart.
    */
  var thresholds: js.UndefOr[js.Array[SchemaThreshold]] = js.undefined
  
  /**
    * The duration used to display a comparison chart. A comparison chart simultaneously shows values from two similar-length time periods (e.g., week-over-week metrics). The duration must be positive, and it can only be applied to charts with data sets of LINE plot type.
    */
  var timeshiftDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The properties applied to the X axis.
    */
  var xAxis: js.UndefOr[SchemaAxis] = js.undefined
  
  /**
    * The properties applied to the Y2 axis.
    */
  var y2Axis: js.UndefOr[SchemaAxis] = js.undefined
  
  /**
    * The properties applied to the Y axis.
    */
  var yAxis: js.UndefOr[SchemaAxis] = js.undefined
}
object SchemaXyChart {
  
  inline def apply(): SchemaXyChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXyChart]
  }
  
  extension [Self <: SchemaXyChart](x: Self) {
    
    inline def setChartOptions(value: SchemaChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setChartOptionsUndefined: Self = StObject.set(x, "chartOptions", js.undefined)
    
    inline def setDataSets(value: js.Array[SchemaDataSet]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: SchemaDataSet*): Self = StObject.set(x, "dataSets", js.Array(value*))
    
    inline def setThresholds(value: js.Array[SchemaThreshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: SchemaThreshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTimeshiftDuration(value: String): Self = StObject.set(x, "timeshiftDuration", value.asInstanceOf[js.Any])
    
    inline def setTimeshiftDurationNull: Self = StObject.set(x, "timeshiftDuration", null)
    
    inline def setTimeshiftDurationUndefined: Self = StObject.set(x, "timeshiftDuration", js.undefined)
    
    inline def setXAxis(value: SchemaAxis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setY2Axis(value: SchemaAxis): Self = StObject.set(x, "y2Axis", value.asInstanceOf[js.Any])
    
    inline def setY2AxisUndefined: Self = StObject.set(x, "y2Axis", js.undefined)
    
    inline def setYAxis(value: SchemaAxis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
