package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;CROSS_DIMENSION_REACH&quot;.
  */
trait SchemaCrossDimensionReachReportCompatibleFields extends StObject {
  
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;breakdown&quot; section of the report.
    */
  var breakdown: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * The kind of resource this is, in this case
    * dfareporting#crossDimensionReachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the
    * &quot;overlapMetricNames&quot; section of the report.
    */
  var overlapMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
}
object SchemaCrossDimensionReachReportCompatibleFields {
  
  inline def apply(): SchemaCrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrossDimensionReachReportCompatibleFields]
  }
  
  extension [Self <: SchemaCrossDimensionReachReportCompatibleFields](x: Self) {
    
    inline def setBreakdown(value: js.Array[SchemaDimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    inline def setBreakdownVarargs(value: SchemaDimension*): Self = StObject.set(x, "breakdown", js.Array(value :_*))
    
    inline def setDimensionFilters(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setOverlapMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "overlapMetrics", value.asInstanceOf[js.Any])
    
    inline def setOverlapMetricsUndefined: Self = StObject.set(x, "overlapMetrics", js.undefined)
    
    inline def setOverlapMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "overlapMetrics", js.Array(value :_*))
  }
}
