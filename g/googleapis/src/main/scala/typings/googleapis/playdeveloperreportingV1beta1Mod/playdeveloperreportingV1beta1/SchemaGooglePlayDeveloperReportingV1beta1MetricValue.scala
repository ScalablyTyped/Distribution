package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1MetricValue extends StObject {
  
  /**
    * Actual value, represented as a decimal number.
    */
  var decimalValue: js.UndefOr[SchemaGoogleTypeDecimal] = js.undefined
  
  /**
    * Name of the metric.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1MetricValue {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1MetricValue]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1MetricValue](x: Self) {
    
    inline def setDecimalValue(value: SchemaGoogleTypeDecimal): Self = StObject.set(x, "decimalValue", value.asInstanceOf[js.Any])
    
    inline def setDecimalValueUndefined: Self = StObject.set(x, "decimalValue", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
