package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingConfig extends StObject {
  
  var disable: js.UndefOr[Boolean] = js.undefined
  
  var reporter: js.UndefOr[ReporterConfig] = js.undefined
  
  var sampler: js.UndefOr[SamplerConfig] = js.undefined
  
  var serviceName: js.UndefOr[String] = js.undefined
  
  var shareRpcSpan: js.UndefOr[Boolean] = js.undefined
  
  var traceId128bit: js.UndefOr[Boolean] = js.undefined
}
object TracingConfig {
  
  inline def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TracingConfig] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setReporter(value: ReporterConfig): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setSampler(value: SamplerConfig): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
    
    inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setShareRpcSpan(value: Boolean): Self = StObject.set(x, "shareRpcSpan", value.asInstanceOf[js.Any])
    
    inline def setShareRpcSpanUndefined: Self = StObject.set(x, "shareRpcSpan", js.undefined)
    
    inline def setTraceId128bit(value: Boolean): Self = StObject.set(x, "traceId128bit", value.asInstanceOf[js.Any])
    
    inline def setTraceId128bitUndefined: Self = StObject.set(x, "traceId128bit", js.undefined)
  }
}
