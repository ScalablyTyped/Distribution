package typings.isOnline

import typings.isOnline.isOnlineNumbers.`4`
import typings.isOnline.isOnlineNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Check if the internet connection is up.
  The following checks are run in parallel:
  - Retrieve [icanhazip.com](https://github.com/major/icanhaz) via HTTPS
  - Query `myip.opendns.com` on OpenDNS (Node.js only)
  - Retrieve Apple's Captive Portal test page (Node.js only)
  When the first check succeeds, the returned Promise is resolved to `true`.
  @example
  ```
  import isOnline = require('is-online');
  (async () => {
  	console.log(await isOnline());
  	//=> true
  })();
  ```
  */
  @JSImport("is-online", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Boolean] = js.native
  @JSImport("is-online", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[Boolean] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Internet Protocol version to use. This is an advanced option that is usually not necessary to be set, but it can prove useful to specifically assert IPv6 connectivity.
    		@default 4
    		*/
    val ipVersion: js.UndefOr[`4` | `6`] = js.native
    
    /**
    		Milliseconds to wait for a server to respond.
    		@default 5000
    		*/
    val timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpVersion(value: `4` | `6`): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpVersionUndefined: Self = StObject.set(x, "ipVersion", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
