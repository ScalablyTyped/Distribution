package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;REACH&quot;.
  */
trait SchemaReachReportCompatibleFields extends StObject {
  
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensions&quot; section of the report.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * The kind of resource this is, in this case
    * dfareporting#reachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Metrics which are compatible to be selected as activity metrics to pivot
    * on in the &quot;activities&quot; section of the report.
    */
  var pivotedActivityMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the
    * &quot;reachByFrequencyMetricNames&quot; section of the report.
    */
  var reachByFrequencyMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
}
object SchemaReachReportCompatibleFields {
  
  @scala.inline
  def apply(): SchemaReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReachReportCompatibleFields]
  }
  
  @scala.inline
  implicit class SchemaReachReportCompatibleFieldsMutableBuilder[Self <: SchemaReachReportCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
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
    def setPivotedActivityMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "pivotedActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotedActivityMetricsUndefined: Self = StObject.set(x, "pivotedActivityMetrics", js.undefined)
    
    @scala.inline
    def setPivotedActivityMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "pivotedActivityMetrics", js.Array(value :_*))
    
    @scala.inline
    def setReachByFrequencyMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "reachByFrequencyMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachByFrequencyMetricsUndefined: Self = StObject.set(x, "reachByFrequencyMetrics", js.undefined)
    
    @scala.inline
    def setReachByFrequencyMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "reachByFrequencyMetrics", js.Array(value :_*))
  }
}
