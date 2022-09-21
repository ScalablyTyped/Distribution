package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1alpha1MetricValue extends StObject {
  
  /**
    * Actual value, represented as a decimal number.
    */
  var decimalValue: js.UndefOr[SchemaGoogleTypeDecimal] = js.undefined
  
  /**
    * Name of the metric.
    */
  var metric: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1alpha1MetricValue {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1alpha1MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1alpha1MetricValue]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1alpha1MetricValue](x: Self) {
    
    inline def setDecimalValue(value: SchemaGoogleTypeDecimal): Self = StObject.set(x, "decimalValue", value.asInstanceOf[js.Any])
    
    inline def setDecimalValueUndefined: Self = StObject.set(x, "decimalValue", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricNull: Self = StObject.set(x, "metric", null)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
