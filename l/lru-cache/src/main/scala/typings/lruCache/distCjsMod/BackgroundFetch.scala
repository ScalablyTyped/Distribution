package typings.lruCache.distCjsMod

import typings.std.AbortController
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundFetch[V]
  extends StObject
     with Promise[js.UndefOr[V]] {
  
  var __abortController: AbortController = js.native
  
  var __returned: js.UndefOr[BackgroundFetch[V]] = js.native
  
  var __staleWhileFetching: js.UndefOr[V] = js.native
}
