package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathReportCompatibleFields extends StObject {
  
  /**
    * Dimensions which are compatible to be selected in the "channelGroupings" section of the report.
    */
  var channelGroupings: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Dimensions which are compatible to be selected in the "dimensions" section of the report.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#pathReportCompatibleFields.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the "metricNames" section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Dimensions which are compatible to be selected in the "pathFilters" section of the report.
    */
  var pathFilters: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
}
object SchemaPathReportCompatibleFields {
  
  inline def apply(): SchemaPathReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathReportCompatibleFields]
  }
  
  extension [Self <: SchemaPathReportCompatibleFields](x: Self) {
    
    inline def setChannelGroupings(value: js.Array[SchemaDimension]): Self = StObject.set(x, "channelGroupings", value.asInstanceOf[js.Any])
    
    inline def setChannelGroupingsUndefined: Self = StObject.set(x, "channelGroupings", js.undefined)
    
    inline def setChannelGroupingsVarargs(value: SchemaDimension*): Self = StObject.set(x, "channelGroupings", js.Array(value*))
    
    inline def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPathFilters(value: js.Array[SchemaDimension]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    inline def setPathFiltersVarargs(value: SchemaDimension*): Self = StObject.set(x, "pathFilters", js.Array(value*))
  }
}
