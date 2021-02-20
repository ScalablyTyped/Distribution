package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMapCodecOptions extends StObject {
  
  var baggagePrefix: js.UndefOr[String] = js.native
  
  var contextKey: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[MetricsFactory] = js.native
  
  var urlEncoding: js.UndefOr[Boolean] = js.native
}
object TextMapCodecOptions {
  
  @scala.inline
  def apply(): TextMapCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextMapCodecOptions]
  }
  
  @scala.inline
  implicit class TextMapCodecOptionsMutableBuilder[Self <: TextMapCodecOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaggagePrefix(value: String): Self = StObject.set(x, "baggagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaggagePrefixUndefined: Self = StObject.set(x, "baggagePrefix", js.undefined)
    
    @scala.inline
    def setContextKey(value: String): Self = StObject.set(x, "contextKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextKeyUndefined: Self = StObject.set(x, "contextKey", js.undefined)
    
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
