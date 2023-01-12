package typings.koaRoles

import typings.koa.mod.DefaultContextExtends
import typings.koa.mod.DefaultStateExtends
import typings.koa.mod.Middleware
import typings.koa.mod.ParameterizedContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-roles", JSImport.Namespace)
  @js.native
  open class ^[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] ()
    extends StObject
       with Roles[StateT, ContextT, ResponseBodyT] {
    def this(options: Options[StateT, ContextT, ResponseBodyT]) = this()
  }
  
  type Handler[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT, Action /* <: String */] = js.Function2[
    /* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], 
    /* action */ Action, 
    Boolean | js.Promise[Boolean]
  ]
  
  trait Options[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] extends StObject {
    
    var failureHandler: js.UndefOr[
        js.Function2[
          /* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], 
          /* action */ String, 
          Unit
        ]
      ] = js.undefined
    
    var userProperty: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT](): Options[StateT, ContextT, ResponseBodyT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[StateT, ContextT, ResponseBodyT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?, ?], StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] (val x: Self & (Options[StateT, ContextT, ResponseBodyT])) extends AnyVal {
      
      inline def setFailureHandler(
        value: (/* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], /* action */ String) => Unit
      ): Self = StObject.set(x, "failureHandler", js.Any.fromFunction2(value))
      
      inline def setFailureHandlerUndefined: Self = StObject.set(x, "failureHandler", js.undefined)
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      inline def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
  
  @js.native
  trait Roles[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] extends StObject {
    
    def can(action: String): Middleware[StateT, ContextT, ResponseBodyT] = js.native
    
    def middleware(): Middleware[StateT, ContextT, ResponseBodyT] = js.native
    
    def use(fn: Handler[StateT, ContextT, ResponseBodyT, String]): Unit = js.native
    def use[Action /* <: String */](action: Action, fn: Handler[StateT, ContextT, ResponseBodyT, Action]): Unit = js.native
  }
}
