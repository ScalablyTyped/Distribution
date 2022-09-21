package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy extends StObject {
  
  /**
    * If true, sorts by descending order. If false or unspecified, sorts in ascending order.
    */
  var desc: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Sorts results by a dimension's values.
    */
  var dimension: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy] = js.undefined
  
  /**
    * Sorts results by a metric's values.
    */
  var metric: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessOrderBy](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescNull: Self = StObject.set(x, "desc", null)
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDimension(value: SchemaGoogleAnalyticsAdminV1alphaAccessOrderByDimensionOrderBy): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetric(value: SchemaGoogleAnalyticsAdminV1alphaAccessOrderByMetricOrderBy): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
