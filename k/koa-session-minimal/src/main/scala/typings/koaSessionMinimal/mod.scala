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
  
  inline def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def apply(opts: Cookie): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-session-minimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Context extends StObject {
      
      var session: js.Any
      
      var sessionHandler: RegenerateId
    }
    object Context {
      
      inline def apply(session: js.Any, sessionHandler: RegenerateId): Context = {
        val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      extension [Self <: Context](x: Self) {
        
        inline def setSession(value: js.Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionHandler(value: RegenerateId): Self = StObject.set(x, "sessionHandler", value.asInstanceOf[js.Any])
      }
    }
  }
}
