package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipkinB3TextMapCodecOptions extends StObject {
  
  var baggagePrefix: js.UndefOr[String] = js.undefined
  
  var metrics: js.UndefOr[MetricsFactory] = js.undefined
  
  var urlEncoding: js.UndefOr[Boolean] = js.undefined
}
object ZipkinB3TextMapCodecOptions {
  
  inline def apply(): ZipkinB3TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipkinB3TextMapCodecOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipkinB3TextMapCodecOptions] (val x: Self) extends AnyVal {
    
    inline def setBaggagePrefix(value: String): Self = StObject.set(x, "baggagePrefix", value.asInstanceOf[js.Any])
    
    inline def setBaggagePrefixUndefined: Self = StObject.set(x, "baggagePrefix", js.undefined)
    
    inline def setMetrics(value: MetricsFactory): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setUrlEncoding(value: Boolean): Self = StObject.set(x, "urlEncoding", value.asInstanceOf[js.Any])
    
    inline def setUrlEncodingUndefined: Self = StObject.set(x, "urlEncoding", js.undefined)
  }
}
