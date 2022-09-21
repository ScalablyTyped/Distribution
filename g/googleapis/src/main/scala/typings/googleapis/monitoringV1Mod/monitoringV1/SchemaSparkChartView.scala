package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSparkChartView extends StObject {
  
  /**
    * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
    */
  var minAlignmentPeriod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of sparkchart to show in this chartView.
    */
  var sparkChartType: js.UndefOr[String | Null] = js.undefined
}
object SchemaSparkChartView {
  
  inline def apply(): SchemaSparkChartView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkChartView]
  }
  
  extension [Self <: SchemaSparkChartView](x: Self) {
    
    inline def setMinAlignmentPeriod(value: String): Self = StObject.set(x, "minAlignmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setMinAlignmentPeriodNull: Self = StObject.set(x, "minAlignmentPeriod", null)
    
    inline def setMinAlignmentPeriodUndefined: Self = StObject.set(x, "minAlignmentPeriod", js.undefined)
    
    inline def setSparkChartType(value: String): Self = StObject.set(x, "sparkChartType", value.asInstanceOf[js.Any])
    
    inline def setSparkChartTypeNull: Self = StObject.set(x, "sparkChartType", null)
    
    inline def setSparkChartTypeUndefined: Self = StObject.set(x, "sparkChartType", js.undefined)
  }
}
