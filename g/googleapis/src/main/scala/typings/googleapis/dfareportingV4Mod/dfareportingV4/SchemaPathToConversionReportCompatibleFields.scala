package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathToConversionReportCompatibleFields extends StObject {
  
  /**
    * Conversion dimensions which are compatible to be selected in the "conversionDimensions" section of the report.
    */
  var conversionDimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Custom floodlight variables which are compatible to be selected in the "customFloodlightVariables" section of the report.
    */
  var customFloodlightVariables: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics which are compatible to be selected in the "metricNames" section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * Per-interaction dimensions which are compatible to be selected in the "perInteractionDimensions" section of the report.
    */
  var perInteractionDimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
}
object SchemaPathToConversionReportCompatibleFields {
  
  inline def apply(): SchemaPathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathToConversionReportCompatibleFields]
  }
  
  extension [Self <: SchemaPathToConversionReportCompatibleFields](x: Self) {
    
    inline def setConversionDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    inline def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    inline def setConversionDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value*))
    
    inline def setCustomFloodlightVariables(value: js.Array[SchemaDimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    inline def setCustomFloodlightVariablesVarargs(value: SchemaDimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setPerInteractionDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    inline def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    inline def setPerInteractionDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value*))
  }
}
