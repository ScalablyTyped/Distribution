package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessOrderBy extends StObject {
  
  /** If true, sorts by descending order. If false or unspecified, sorts in ascending order. */
  var desc: js.UndefOr[Boolean] = js.undefined
  
  /** Sorts results by a dimension's values. */
  var dimension: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy] = js.undefined
  
  /** Sorts results by a metric's values. */
  var metric: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessOrderBy {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessOrderBy]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessOrderBy](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDimension(value: GoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetric(value: GoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
