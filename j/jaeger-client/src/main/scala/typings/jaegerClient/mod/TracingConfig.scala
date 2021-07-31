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
  
  @scala.inline
  def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  
  @scala.inline
  implicit class TracingConfigMutableBuilder[Self <: TracingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setReporter(value: ReporterConfig): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    @scala.inline
    def setSampler(value: SamplerConfig): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setShareRpcSpan(value: Boolean): Self = StObject.set(x, "shareRpcSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareRpcSpanUndefined: Self = StObject.set(x, "shareRpcSpan", js.undefined)
    
    @scala.inline
    def setTraceId128bit(value: Boolean): Self = StObject.set(x, "traceId128bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceId128bitUndefined: Self = StObject.set(x, "traceId128bit", js.undefined)
  }
}
