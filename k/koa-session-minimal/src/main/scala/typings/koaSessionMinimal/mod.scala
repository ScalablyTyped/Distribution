package typings.koaSessionMinimal

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaSessionMinimal.anon.Cookie
import typings.koaSessionMinimal.anon.RegenerateId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: Cookie): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-session-minimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Context extends StObject {
      
      var session: Any
      
      var sessionHandler: RegenerateId
    }
    object Context {
      
      inline def apply(session: Any, sessionHandler: RegenerateId): Context = {
        val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionHandler(value: RegenerateId): Self = StObject.set(x, "sessionHandler", value.asInstanceOf[js.Any])
      }
    }
  }
}
