package typings.httpBasic

import typings.httpBasic.anon.PickCachedResponseheaders
import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-basic/lib/ICache", JSImport.Namespace)
@js.native
object icacheMod extends js.Object {
  
  @js.native
  trait ICache extends js.Object {
    
    def getResponse(url: String, cb: js.Function2[/* err */ Error | Null, /* response */ CachedResponse | Null, Unit]): Unit = js.native
    
    def invalidateResponse(url: String, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    def setResponse(url: String): Unit = js.native
    def setResponse(url: String, response: CachedResponse): Unit = js.native
    
    var updateResponseHeaders: js.UndefOr[js.Function2[/* url */ String, /* response */ PickCachedResponseheaders, Unit]] = js.native
  }
}
