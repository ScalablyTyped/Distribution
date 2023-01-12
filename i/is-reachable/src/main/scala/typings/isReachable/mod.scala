package typings.isReachable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Check if servers are reachable.
  The Node.js version will do a TCP handshake with the target's port. It attempts to detect cases where a router redirects the request to itself.
  The browser version is limited by the fact that browsers cannot connect to arbitrary ports. It only supports HTTP and HTTPS and the check relies on the `/favicon.ico` path being present.
  @param targets - One or more targets to check. Can either be `hostname:port`, a URL like `https://hostname:port` or even just `hostname`. `port` must be specified if protocol is not `http:` or `https:` and defaults to `443`. Protocols other than `http:` and `https:` are not supported.
  @returns Whether any of the `targets` are reachable.
  @example
  ```
  import isReachable = require('is-reachable');
  (async () => {
  	console.log(await isReachable('sindresorhus.com'));
  	//=> true
  	console.log(await isReachable('google.com:80'));
  	//=> true
  })();
  ```
  */
  inline def apply(targets: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(targets.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def apply(targets: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(targets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def apply(targets: js.Array[String]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(targets.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def apply(targets: js.Array[String], options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(targets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("is-reachable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Timeout in milliseconds after which a request is considered failed.
    		@default 5000
    		_Node.js only_
    		*/
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
