package typings.makeFetchHappen

import typings.std.CacheQueryOptions
import typings.std.RequestInfo
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(request: RequestInfo): js.Promise[Boolean] = js.native
    def apply(request: RequestInfo, options: CacheQueryOptions): js.Promise[Boolean] = js.native
    def apply(request: URL): js.Promise[Boolean] = js.native
    def apply(request: URL, options: CacheQueryOptions): js.Promise[Boolean] = js.native
  }
}
