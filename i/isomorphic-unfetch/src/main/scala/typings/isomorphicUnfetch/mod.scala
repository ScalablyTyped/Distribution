package typings.isomorphicUnfetch

import typings.std.Body
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /* was `typeof fetch` */
    @JSImport("isomorphic-unfetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    /* was `typeof fetch` */
    @JSImport("isomorphic-unfetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  object unfetch {
    
    type IsomorphicBody = Body | typings.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typings.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typings.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typings.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typings.nodeFetch.mod.Response
  }
}
