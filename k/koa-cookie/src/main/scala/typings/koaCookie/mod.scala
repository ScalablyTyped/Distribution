package typings.koaCookie

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-cookie", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait BaseContext extends StObject {
      
      var cookie: Record[String, _] = js.native
    }
    object BaseContext {
      
      @scala.inline
      def apply(cookie: Record[String, _]): BaseContext = {
        val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseContext]
      }
      
      @scala.inline
      implicit class BaseContextMutableBuilder[Self <: BaseContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCookie(value: Record[String, _]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      }
    }
  }
}
