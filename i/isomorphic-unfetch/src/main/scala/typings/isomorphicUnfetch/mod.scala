package typings.isomorphicUnfetch

import typings.std.Body
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /* was `typeof fetch` */
    inline def apply(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    /* was `typeof fetch` */
    inline def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    /* was `typeof fetch` */
    inline def apply(input: URL): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    /* was `typeof fetch` */
    inline def apply(input: URL, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    
    @JSImport("isomorphic-unfetch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object unfetch {
    
    type IsomorphicBody = Body | typings.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typings.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typings.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typings.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typings.nodeFetch.mod.Response
  }
}
