package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessMetricHeader extends StObject {
  
  /**
    * The metric's name; for example 'accessCount'.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessMetricHeader {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessMetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessMetricHeader]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessMetricHeader](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
