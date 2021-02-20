package typings.koaSessionMinimal

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaSessionMinimal.anon.Cookie
import typings.koaSessionMinimal.anon.RegenerateId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-session-minimal", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-session-minimal", JSImport.Namespace)
  @js.native
  def apply(opts: Cookie): Middleware[DefaultState, DefaultContext] = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      var session: js.Any = js.native
      
      var sessionHandler: RegenerateId = js.native
    }
    object Context {
      
      @scala.inline
      def apply(session: js.Any, sessionHandler: RegenerateId): Context = {
        val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSession(value: js.Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionHandler(value: RegenerateId): Self = StObject.set(x, "sessionHandler", value.asInstanceOf[js.Any])
      }
    }
  }
}
