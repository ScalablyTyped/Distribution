package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy extends StObject {
  
  /**
    * A metric name in the request to order by.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
