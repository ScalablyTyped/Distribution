package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathToConversionReportCompatibleFields extends StObject {
  
  /** Conversion dimensions which are compatible to be selected in the "conversionDimensions" section of the report. */
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** Custom floodlight variables which are compatible to be selected in the "customFloodlightVariables" section of the report. */
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  
  /** Per-interaction dimensions which are compatible to be selected in the "perInteractionDimensions" section of the report. */
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
}
object PathToConversionReportCompatibleFields {
  
  inline def apply(): PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToConversionReportCompatibleFields]
  }
  
  extension [Self <: PathToConversionReportCompatibleFields](x: Self) {
    
    inline def setConversionDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    inline def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    inline def setConversionDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value :_*))
    
    inline def setCustomFloodlightVariables(value: js.Array[Dimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    inline def setCustomFloodlightVariablesVarargs(value: Dimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setPerInteractionDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    inline def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    inline def setPerInteractionDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value :_*))
  }
}
