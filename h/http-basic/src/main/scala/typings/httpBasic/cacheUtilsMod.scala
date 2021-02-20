package typings.httpBasic

import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.httpBasic.headersMod.Headers
import typings.httpResponseObject.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheUtilsMod {
  
  @JSImport("http-basic/lib/cache-utils", "canCache")
  @js.native
  def canCache[T](res: ^[T]): Boolean = js.native
  
  @JSImport("http-basic/lib/cache-utils", "isExpired")
  @js.native
  def isExpired(cachedResponse: CachedResponse): Boolean = js.native
  
  @JSImport("http-basic/lib/cache-utils", "isMatch")
  @js.native
  def isMatch(requestHeaders: Headers, cachedResponse: CachedResponse): Boolean = js.native
}
