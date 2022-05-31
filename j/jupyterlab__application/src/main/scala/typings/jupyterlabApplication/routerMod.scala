package typings.jupyterlabApplication

import typings.jupyterlabApplication.routerMod.Router.IOptions
import typings.jupyterlabApplication.tokensMod.IRouter
import typings.jupyterlabApplication.tokensMod.IRouter.ILocation
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("@jupyterlab/application/lib/router", "Router")
  @js.native
  class Router protected ()
    extends StObject
       with IRouter {
    /**
      * Create a URL router.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _routed: js.Any = js.native
    
    /* private */ var _rules: js.Any = js.native
    
    /**
      * Returns the parsed current URL of the application.
      */
    @JSName("current")
    def current_MRouter: ILocation = js.native
    
    /**
      * Route a specific path to an action.
      *
      * #### Notes
      * If a pattern is matched, its command will be invoked with arguments that
      * match the `IRouter.ILocation` interface.
      */
    def route(): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the router routes a route.
      */
    @JSName("routed")
    def routed_MRouter: ISignal[this.type, ILocation] = js.native
  }
  object Router {
    
    /**
      * The options for instantiating a JupyterLab URL router.
      */
    trait IOptions extends StObject {
      
      /**
        * The fully qualified base URL for the router.
        */
      var base: String
      
      /**
        * The command registry used by the router.
        */
      var commands: CommandRegistry
    }
    object IOptions {
      
      inline def apply(base: String, commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      }
    }
  }
}
