package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathToConversionReportCompatibleFields extends StObject {
  
  /** Conversion dimensions which are compatible to be selected in the "conversionDimensions" section of the report. */
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Custom floodlight variables which are compatible to be selected in the "customFloodlightVariables" section of the report. */
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Per-interaction dimensions which are compatible to be selected in the "perInteractionDimensions" section of the report. */
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.native
}
object PathToConversionReportCompatibleFields {
  
  @scala.inline
  def apply(): PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToConversionReportCompatibleFields]
  }
  
  @scala.inline
  implicit class PathToConversionReportCompatibleFieldsMutableBuilder[Self <: PathToConversionReportCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    @scala.inline
    def setConversionDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[Dimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: Dimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setPerInteractionDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value :_*))
  }
}
