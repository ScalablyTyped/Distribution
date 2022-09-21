package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiagnosticMessage extends StObject {
  
  /**
    * Information about this diagnostic information.
    */
  var info: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The metric.
    */
  var metric: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * Whether this message is specific only for the current metric. By default Diagnostics are shown for all metrics, regardless which metric is the currently selected metric in the UI. However occasionally a metric will generate so many messages that the resulting visual clutter becomes overwhelming. In this case setting this to true, will show the diagnostic messages for that metric only if it is the currently selected metric.
    */
  var metricSpecific: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The severity of the diagnostic message.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The short message.
    */
  var shortMessage: js.UndefOr[SchemaLocalizedString] = js.undefined
}
object SchemaDiagnosticMessage {
  
  inline def apply(): SchemaDiagnosticMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnosticMessage]
  }
  
  extension [Self <: SchemaDiagnosticMessage](x: Self) {
    
    inline def setInfo(value: SchemaLocalizedString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMetric(value: SchemaLocalizedString): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricSpecific(value: Boolean): Self = StObject.set(x, "metricSpecific", value.asInstanceOf[js.Any])
    
    inline def setMetricSpecificNull: Self = StObject.set(x, "metricSpecific", null)
    
    inline def setMetricSpecificUndefined: Self = StObject.set(x, "metricSpecific", js.undefined)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setShortMessage(value: SchemaLocalizedString): Self = StObject.set(x, "shortMessage", value.asInstanceOf[js.Any])
    
    inline def setShortMessageUndefined: Self = StObject.set(x, "shortMessage", js.undefined)
  }
}
