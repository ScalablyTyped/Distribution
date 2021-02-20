package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipkinB3TextMapCodecOptions extends StObject {
  
  var baggagePrefix: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[MetricsFactory] = js.native
  
  var urlEncoding: js.UndefOr[Boolean] = js.native
}
object ZipkinB3TextMapCodecOptions {
  
  @scala.inline
  def apply(): ZipkinB3TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipkinB3TextMapCodecOptions]
  }
  
  @scala.inline
  implicit class ZipkinB3TextMapCodecOptionsMutableBuilder[Self <: ZipkinB3TextMapCodecOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaggagePrefix(value: String): Self = StObject.set(x, "baggagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaggagePrefixUndefined: Self = StObject.set(x, "baggagePrefix", js.undefined)
    
    @scala.inline
    def setMetrics(value: MetricsFactory): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setUrlEncoding(value: Boolean): Self = StObject.set(x, "urlEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlEncodingUndefined: Self = StObject.set(x, "urlEncoding", js.undefined)
  }
}
