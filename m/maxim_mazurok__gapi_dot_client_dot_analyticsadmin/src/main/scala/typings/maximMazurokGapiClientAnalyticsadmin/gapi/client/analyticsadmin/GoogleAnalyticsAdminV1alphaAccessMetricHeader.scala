package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessMetricHeader extends StObject {
  
  /** The metric's name; for example 'accessCount'. */
  var metricName: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessMetricHeader {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessMetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessMetricHeader]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessMetricHeader](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
