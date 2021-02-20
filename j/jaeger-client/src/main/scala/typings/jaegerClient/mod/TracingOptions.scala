package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracingOptions extends StObject {
  
  var logger: js.UndefOr[Logger] = js.native
  
  var metrics: js.UndefOr[PrometheusMetricsFactory] = js.native
  
  var reporter: js.UndefOr[Reporter] = js.native
  
  var tags: js.UndefOr[js.Any] = js.native
}
object TracingOptions {
  
  @scala.inline
  def apply(): TracingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingOptions]
  }
  
  @scala.inline
  implicit class TracingOptionsMutableBuilder[Self <: TracingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMetrics(value: PrometheusMetricsFactory): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    @scala.inline
    def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
