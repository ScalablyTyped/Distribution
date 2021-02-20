package typings.httpBasic

import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.httpResponseObject.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheControlUtilsMod {
  
  @JSImport("http-basic/lib/cache-control-utils", "cachePolicy")
  @js.native
  def cachePolicy[T](res: CachedResponse): Policy | Null = js.native
  @JSImport("http-basic/lib/cache-control-utils", "cachePolicy")
  @js.native
  def cachePolicy[T](res: ^[T]): Policy | Null = js.native
  
  @JSImport("http-basic/lib/cache-control-utils", "isCacheable")
  @js.native
  def isCacheable[T](res: CachedResponse): Boolean = js.native
  @JSImport("http-basic/lib/cache-control-utils", "isCacheable")
  @js.native
  def isCacheable[T](res: ^[T]): Boolean = js.native
  
  @js.native
  trait Policy extends StObject {
    
    var maxage: Double | Null = js.native
  }
  object Policy {
    
    @scala.inline
    def apply(): Policy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Policy]
    }
    
    @scala.inline
    implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxageNull: Self = StObject.set(x, "maxage", null)
    }
  }
}
