package typings.isomorphicFetch

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def apply(input: URL): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def apply(input: URL, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("isomorphic-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
