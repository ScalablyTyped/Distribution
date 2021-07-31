package typings.googleapis.v32Mod.dfareportingV32

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
  
  @scala.inline
  def apply(): SchemaCrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrossDimensionReachReportCompatibleFields]
  }
  
  @scala.inline
  implicit class SchemaCrossDimensionReachReportCompatibleFieldsMutableBuilder[Self <: SchemaCrossDimensionReachReportCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakdown(value: js.Array[SchemaDimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    @scala.inline
    def setBreakdownVarargs(value: SchemaDimension*): Self = StObject.set(x, "breakdown", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setOverlapMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "overlapMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapMetricsUndefined: Self = StObject.set(x, "overlapMetrics", js.undefined)
    
    @scala.inline
    def setOverlapMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "overlapMetrics", js.Array(value :_*))
  }
}
