package typings.isomorphicUnfetch

import typings.std.Body
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("isomorphic-unfetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  object unfetch extends js.Object {
    
    type IsomorphicBody = Body | typings.nodeFetch.mod.Body
    
    type IsomorphicHeaders = Headers | typings.nodeFetch.mod.Headers
    
    type IsomorphicRequest = Request | typings.nodeFetch.mod.Request
    
    type IsomorphicRequestInit = RequestInit | typings.nodeFetch.mod.RequestInit
    
    type IsomorphicResponse = Response | typings.nodeFetch.mod.Response
  }
}
