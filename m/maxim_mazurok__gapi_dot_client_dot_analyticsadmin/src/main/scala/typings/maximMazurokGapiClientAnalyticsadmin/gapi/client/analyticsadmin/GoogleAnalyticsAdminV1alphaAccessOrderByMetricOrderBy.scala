package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy extends StObject {
  
  /** A metric name in the request to order by. */
  var metricName: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
