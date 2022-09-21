package typings.isPortReachable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-port-reachable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(port: Double, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait Options extends StObject {
    
    /**
    	The host to check.
    	Can be a domain (optionally, with a sub-domain) or an IP address.
    	@example 'localhost'
    	*/
    val host: String
    
    /**
    	The time to wait in milliseconds before giving up.
    	@default 1000
    	*/
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(host: String): Options = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
