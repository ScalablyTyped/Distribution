package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportCompatibleFields extends StObject {
  
  /**
    * Dimensions which are compatible to be selected in the "dimensionFilters" section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Dimensions which are compatible to be selected in the "dimensions" section of the report.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#reportCompatibleFields.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the "metricNames" section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Metrics which are compatible to be selected as activity metrics to pivot on in the "activities" section of the report.
    */
  var pivotedActivityMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
}
object SchemaReportCompatibleFields {
  
  inline def apply(): SchemaReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportCompatibleFields]
  }
  
  extension [Self <: SchemaReportCompatibleFields](x: Self) {
    
    inline def setDimensionFilters(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value*))
    
    inline def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPivotedActivityMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "pivotedActivityMetrics", value.asInstanceOf[js.Any])
    
    inline def setPivotedActivityMetricsUndefined: Self = StObject.set(x, "pivotedActivityMetrics", js.undefined)
    
    inline def setPivotedActivityMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "pivotedActivityMetrics", js.Array(value*))
  }
}
