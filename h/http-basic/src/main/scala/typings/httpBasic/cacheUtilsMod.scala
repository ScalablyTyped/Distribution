package typings.httpBasic

import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.httpBasic.headersMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheUtilsMod {
  
  @JSImport("http-basic/lib/cache-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canCache[T](res: typings.httpResponseObject.mod.^[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCache")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExpired(cachedResponse: CachedResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(cachedResponse.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMatch(requestHeaders: Headers, cachedResponse: CachedResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(requestHeaders.asInstanceOf[js.Any], cachedResponse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
