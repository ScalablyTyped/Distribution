package typings.keystonejsOembedAdapters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keystonejs/oembed-adapters", "IframelyOEmbedAdapter")
  @js.native
  open class IframelyOEmbedAdapter protected () extends StObject {
    def this(options: OEmbedAdapterConfig) = this()
    
    // Unlikely to be used in client apps, hence the any, but if you're using this, feel free to
    // type it properly. It's a res.json response from Fetch, just didn't want to pull that in
    // when it's unlikely to be actually used in client apps, Keystone calls this.
    def fetch(parameters: Any): js.Promise[Any] = js.native
  }
  
  trait OEmbedAdapterConfig extends StObject {
    
    var apiKey: String
  }
  object OEmbedAdapterConfig {
    
    inline def apply(apiKey: String): OEmbedAdapterConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[OEmbedAdapterConfig]
    }
    
    extension [Self <: OEmbedAdapterConfig](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    }
  }
}
