package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScorecard extends StObject {
  
  /**
    * Will cause the scorecard to show a gauge chart.
    */
  var gaugeView: js.UndefOr[SchemaGaugeView] = js.undefined
  
  /**
    * Will cause the scorecard to show a spark chart.
    */
  var sparkChartView: js.UndefOr[SchemaSparkChartView] = js.undefined
  
  /**
    * The thresholds used to determine the state of the scorecard given the time series' current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: 'DANGER', trigger: 'ABOVE', \}, { value: 70, category: 'WARNING', trigger: 'ABOVE', \}, { value: 10, category: 'DANGER', trigger: 'BELOW', \}, { value: 20, category: 'WARNING', trigger: 'BELOW', \}Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
    */
  var thresholds: js.UndefOr[js.Array[SchemaThreshold]] = js.undefined
  
  /**
    * Required. Fields for querying time series data from the Stackdriver metrics API.
    */
  var timeSeriesQuery: js.UndefOr[SchemaTimeSeriesQuery] = js.undefined
}
object SchemaScorecard {
  
  inline def apply(): SchemaScorecard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScorecard]
  }
  
  extension [Self <: SchemaScorecard](x: Self) {
    
    inline def setGaugeView(value: SchemaGaugeView): Self = StObject.set(x, "gaugeView", value.asInstanceOf[js.Any])
    
    inline def setGaugeViewUndefined: Self = StObject.set(x, "gaugeView", js.undefined)
    
    inline def setSparkChartView(value: SchemaSparkChartView): Self = StObject.set(x, "sparkChartView", value.asInstanceOf[js.Any])
    
    inline def setSparkChartViewUndefined: Self = StObject.set(x, "sparkChartView", js.undefined)
    
    inline def setThresholds(value: js.Array[SchemaThreshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: SchemaThreshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTimeSeriesQuery(value: SchemaTimeSeriesQuery): Self = StObject.set(x, "timeSeriesQuery", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesQueryUndefined: Self = StObject.set(x, "timeSeriesQuery", js.undefined)
  }
}
