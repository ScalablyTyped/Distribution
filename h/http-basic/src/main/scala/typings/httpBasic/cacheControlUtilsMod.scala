package typings.httpBasic

import typings.httpBasic.cachedResponseMod.CachedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheControlUtilsMod {
  
  @JSImport("http-basic/lib/cache-control-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cachePolicy[T](res: CachedResponse): Policy | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cachePolicy")(res.asInstanceOf[js.Any]).asInstanceOf[Policy | Null]
  @scala.inline
  def cachePolicy[T](res: typings.httpResponseObject.mod.^[T]): Policy | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cachePolicy")(res.asInstanceOf[js.Any]).asInstanceOf[Policy | Null]
  
  @scala.inline
  def isCacheable[T](res: CachedResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCacheable")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isCacheable[T](res: typings.httpResponseObject.mod.^[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCacheable")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Policy extends StObject {
    
    var maxage: Double | Null
  }
  object Policy {
    
    @scala.inline
    def apply(): Policy = {
      val __obj = js.Dynamic.literal(maxage = null)
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
