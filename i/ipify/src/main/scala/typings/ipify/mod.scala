package typings.ipify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  inline def default(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait Options extends StObject {
    
    /**
    	Custom API endpoint.
    	@default 'https://api6.ipify.org'
    	*/
    val endpoint: js.UndefOr[String] = js.undefined
    
    /**
    	Use the IPv6 API endpoint. The IPv6 endpoint will return an IPv6 address if available, IPv4 address otherwise.
    	Setting the `endpoint` option will override this.
    	@default true
    	@example
    	```
    	import ipify from 'ipify';
    	console.log(await ipify({useIPv6: false}));
    	//=> '82.142.31.236'
    	```
    	*/
    val useIPv6: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setUseIPv6(value: Boolean): Self = StObject.set(x, "useIPv6", value.asInstanceOf[js.Any])
      
      inline def setUseIPv6Undefined: Self = StObject.set(x, "useIPv6", js.undefined)
    }
  }
}
