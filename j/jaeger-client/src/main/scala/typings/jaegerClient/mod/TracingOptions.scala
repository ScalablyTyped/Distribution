package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingOptions extends StObject {
  
  var contextKey: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[Logger] = js.undefined
  
  var metrics: js.UndefOr[PrometheusMetricsFactory] = js.undefined
  
  var reporter: js.UndefOr[Reporter] = js.undefined
  
  var tags: js.UndefOr[Any] = js.undefined
  
  var traceId128bit: js.UndefOr[Boolean] = js.undefined
}
object TracingOptions {
  
  inline def apply(): TracingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingOptions]
  }
  
  extension [Self <: TracingOptions](x: Self) {
    
    inline def setContextKey(value: String): Self = StObject.set(x, "contextKey", value.asInstanceOf[js.Any])
    
    inline def setContextKeyUndefined: Self = StObject.set(x, "contextKey", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMetrics(value: PrometheusMetricsFactory): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setTags(value: Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTraceId128bit(value: Boolean): Self = StObject.set(x, "traceId128bit", value.asInstanceOf[js.Any])
    
    inline def setTraceId128bitUndefined: Self = StObject.set(x, "traceId128bit", js.undefined)
  }
}
