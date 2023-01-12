package typings.isOnline

import typings.isOnline.isOnlineInts.`4`
import typings.isOnline.isOnlineInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-online", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Boolean]]
  inline def default(options: Options): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  trait Options extends StObject {
    
    /**
    	[Internet Protocol version](https://en.wikipedia.org/wiki/Internet_Protocol#Version_history) to use.
    	This is an advanced option that is usually not necessary to be set, but it can prove useful to specifically assert IPv6 connectivity.
    	@default 4
    	*/
    val ipVersion: js.UndefOr[`4` | `6`] = js.undefined
    
    /**
    	Milliseconds to wait for a server to respond.
    	@default 5000
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
      
      inline def setIpVersion(value: `4` | `6`): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
      
      inline def setIpVersionUndefined: Self = StObject.set(x, "ipVersion", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
