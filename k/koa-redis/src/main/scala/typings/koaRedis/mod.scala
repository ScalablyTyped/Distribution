package typings.koaRedis

import typings.koaSession.mod.stores
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: RedisOptions): RedisSessionStore = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RedisSessionStore]
  
  @JSImport("koa-redis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts * / any */ trait RedisOptions extends StObject {
    
    var client: js.UndefOr[Any] = js.undefined
    
    var duplicate: js.UndefOr[Boolean] = js.undefined
  }
  object RedisOptions {
    
    inline def apply(): RedisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisOptions] (val x: Self) extends AnyVal {
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
      
      inline def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
    }
  }
  
  @js.native
  trait RedisSessionStore
    extends StObject
       with stores {
    
    var client: Any = js.native
  }
}
