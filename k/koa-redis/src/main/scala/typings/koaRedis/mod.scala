package typings.koaRedis

import typings.koaSession.mod.stores
import typings.redis.mod.ClientOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: RedisOptions): RedisSessionStore = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RedisSessionStore]
  
  @JSImport("koa-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RedisOptions
    extends StObject
       with ClientOpts {
    
    var client: js.UndefOr[js.Any] = js.undefined
    
    var duplicate: js.UndefOr[Boolean] = js.undefined
  }
  object RedisOptions {
    
    inline def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    extension [Self <: RedisOptions](x: Self) {
      
      inline def setClient(value: js.Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      inline def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
    }
  }
  
  @js.native
  trait RedisSessionStore
    extends StObject
       with stores {
    
    var client: js.Any = js.native
  }
}
