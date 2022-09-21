package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSet extends StObject {
  
  /**
    * A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name\}, which will resolve to the label's value.
    */
  var legendTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
    */
  var minAlignmentPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How this data should be plotted on the chart.
    */
  var plotType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The target axis to use for plotting the metric.
    */
  var targetAxis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Fields for querying time series data from the Stackdriver metrics API.
    */
  var timeSeriesQuery: js.UndefOr[SchemaTimeSeriesQuery] = js.undefined
}
object SchemaDataSet {
  
  inline def apply(): SchemaDataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSet]
  }
  
  extension [Self <: SchemaDataSet](x: Self) {
    
    inline def setLegendTemplate(value: String): Self = StObject.set(x, "legendTemplate", value.asInstanceOf[js.Any])
    
    inline def setLegendTemplateNull: Self = StObject.set(x, "legendTemplate", null)
    
    inline def setLegendTemplateUndefined: Self = StObject.set(x, "legendTemplate", js.undefined)
    
    inline def setMinAlignmentPeriod(value: String): Self = StObject.set(x, "minAlignmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setMinAlignmentPeriodNull: Self = StObject.set(x, "minAlignmentPeriod", null)
    
    inline def setMinAlignmentPeriodUndefined: Self = StObject.set(x, "minAlignmentPeriod", js.undefined)
    
    inline def setPlotType(value: String): Self = StObject.set(x, "plotType", value.asInstanceOf[js.Any])
    
    inline def setPlotTypeNull: Self = StObject.set(x, "plotType", null)
    
    inline def setPlotTypeUndefined: Self = StObject.set(x, "plotType", js.undefined)
    
    inline def setTargetAxis(value: String): Self = StObject.set(x, "targetAxis", value.asInstanceOf[js.Any])
    
    inline def setTargetAxisNull: Self = StObject.set(x, "targetAxis", null)
    
    inline def setTargetAxisUndefined: Self = StObject.set(x, "targetAxis", js.undefined)
    
    inline def setTimeSeriesQuery(value: SchemaTimeSeriesQuery): Self = StObject.set(x, "timeSeriesQuery", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesQueryUndefined: Self = StObject.set(x, "timeSeriesQuery", js.undefined)
  }
}
