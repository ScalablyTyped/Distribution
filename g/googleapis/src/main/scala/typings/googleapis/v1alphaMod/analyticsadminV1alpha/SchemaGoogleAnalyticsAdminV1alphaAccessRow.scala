package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessRow extends StObject {
  
  /**
    * List of dimension values. These values are in the same order as specified in the request.
    */
  var dimensionValues: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessDimensionValue]] = js.undefined
  
  /**
    * List of metric values. These values are in the same order as specified in the request.
    */
  var metricValues: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessMetricValue]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessRow {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessRow]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessRow](x: Self) {
    
    inline def setDimensionValues(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
    
    inline def setMetricValues(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccessMetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    inline def setMetricValuesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccessMetricValue*): Self = StObject.set(x, "metricValues", js.Array(value*))
  }
}
