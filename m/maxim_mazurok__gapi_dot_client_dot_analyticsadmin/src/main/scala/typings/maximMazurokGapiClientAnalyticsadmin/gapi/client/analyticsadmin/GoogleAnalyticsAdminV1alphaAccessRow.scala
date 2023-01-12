package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessRow extends StObject {
  
  /** List of dimension values. These values are in the same order as specified in the request. */
  var dimensionValues: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccessDimensionValue]] = js.undefined
  
  /** List of metric values. These values are in the same order as specified in the request. */
  var metricValues: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaAccessMetricValue]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessRow {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccessRow] (val x: Self) extends AnyVal {
    
    inline def setDimensionValues(value: js.Array[GoogleAnalyticsAdminV1alphaAccessDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: GoogleAnalyticsAdminV1alphaAccessDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
    
    inline def setMetricValues(value: js.Array[GoogleAnalyticsAdminV1alphaAccessMetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    inline def setMetricValuesVarargs(value: GoogleAnalyticsAdminV1alphaAccessMetricValue*): Self = StObject.set(x, "metricValues", js.Array(value*))
  }
}
