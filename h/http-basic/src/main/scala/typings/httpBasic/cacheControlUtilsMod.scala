package typings.httpBasic

import typings.httpBasic.cachedResponseMod.CachedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheControlUtilsMod {
  
  @JSImport("http-basic/lib/cache-control-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cachePolicy[T](res: CachedResponse): Policy | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cachePolicy")(res.asInstanceOf[js.Any]).asInstanceOf[Policy | Null]
  inline def cachePolicy[T](res: typings.httpResponseObject.mod.^[T]): Policy | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cachePolicy")(res.asInstanceOf[js.Any]).asInstanceOf[Policy | Null]
  
  inline def isCacheable[T](res: CachedResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCacheable")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCacheable[T](res: typings.httpResponseObject.mod.^[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCacheable")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Policy extends StObject {
    
    var maxage: Double | Null
  }
  object Policy {
    
    inline def apply(): Policy = {
      val __obj = js.Dynamic.literal(maxage = null)
      __obj.asInstanceOf[Policy]
    }
    
    extension [Self <: Policy](x: Self) {
      
      inline def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
      
      inline def setMaxageNull: Self = StObject.set(x, "maxage", null)
    }
  }
}
