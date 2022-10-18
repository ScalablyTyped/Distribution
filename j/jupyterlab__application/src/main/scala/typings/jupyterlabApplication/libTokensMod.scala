package typings.jupyterlabApplication

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libTokensMod.IRouter.ILocation
import typings.jupyterlabApplication.libTokensMod.IRouter.INavOptions
import typings.jupyterlabApplication.libTokensMod.IRouter.IRegisterOptions
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.jupyterlabServices.mod.ServerConnection.NetworkError
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.mod.Token
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/application/lib/tokens", "IConnectionLost")
  @js.native
  val IConnectionLost: Token[typings.jupyterlabApplication.libTokensMod.IConnectionLost] = js.native
  type IConnectionLost = js.Function3[
    /* manager */ IManager, 
    /* err */ NetworkError, 
    /* translator */ js.UndefOr[ITranslator], 
    js.Promise[Unit]
  ]
  
  @js.native
  trait IRouter extends StObject {
    
    /**
      * The base URL for the router.
      */
    val base: String = js.native
    
    /**
      * The command registry used by the router.
      */
    val commands: CommandRegistry = js.native
    
    /**
      * The parsed current URL of the application.
      */
    val current: ILocation = js.native
    
    /**
      * Navigate to a new path within the application.
      *
      * @param path - The new path or empty string if redirecting to root.
      *
      * @param options - The navigation options.
      */
    def navigate(path: String): Unit = js.native
    def navigate(path: String, options: INavOptions): Unit = js.native
    
    /**
      * Register a rule that maps a path pattern to a command.
      *
      * @param options - The route registration options.
      *
      * @returns A disposable that removes the registered rule from the router.
      */
    def register(options: IRegisterOptions): IDisposable = js.native
    
    /**
      * Cause a hard reload of the document.
      */
    def reload(): Unit = js.native
    
    /**
      * Route a specific path to an action.
      *
      * @param url - The URL string that will be routed.
      *
      * #### Notes
      * If a pattern is matched, its command will be invoked with arguments that
      * match the `IRouter.ILocation` interface.
      */
    def route(url: String): Unit = js.native
    
    /**
      * A signal emitted when the router routes a route.
      */
    val routed: ISignal[IRouter, ILocation] = js.native
    
    /**
      * If a matching rule's command resolves with the `stop` token during routing,
      * no further matches will execute.
      */
    val stop: Token[Unit] = js.native
  }
  object IRouter extends Shortcut {
    
    @JSImport("@jupyterlab/application/lib/tokens", "IRouter")
    @js.native
    val ^ : Token[IRouter] = js.native
    
    /**
      * The parsed location currently being routed.
      */
    trait ILocation
      extends StObject
         with ReadonlyPartialJSONObject {
      
      /**
        * The location hash.
        */
      var hash: String
      
      /**
        * The path that matched a routing pattern.
        */
      var path: String
      
      /**
        * The request being routed with the router `base` omitted.
        *
        * #### Notes
        * This field includes the query string and hash, if they exist.
        */
      var request: String
      
      /**
        * The search element, including leading question mark (`'?'`), if any,
        * of the path.
        */
      var search: js.UndefOr[String] = js.undefined
    }
    object ILocation {
      
      inline def apply(hash: String, path: String, request: String): ILocation = {
        val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[ILocation]
      }
      
      extension [Self <: ILocation](x: Self) {
        
        inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      }
    }
    
    /**
      * The options passed into a navigation request.
      */
    trait INavOptions extends StObject {
      
      /**
        * Whether the navigation should be hard URL change instead of an HTML
        * history API change.
        */
      var hard: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Should the routing stage be skipped when navigating? This will simply rewrite the URL
        * and push the new state to the history API, no routing commands will be triggered.
        */
      var skipRouting: js.UndefOr[Boolean] = js.undefined
    }
    object INavOptions {
      
      inline def apply(): INavOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[INavOptions]
      }
      
      extension [Self <: INavOptions](x: Self) {
        
        inline def setHard(value: Boolean): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
        
        inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
        
        inline def setSkipRouting(value: Boolean): Self = StObject.set(x, "skipRouting", value.asInstanceOf[js.Any])
        
        inline def setSkipRoutingUndefined: Self = StObject.set(x, "skipRouting", js.undefined)
      }
    }
    
    /**
      * The specification for registering a route with the router.
      */
    trait IRegisterOptions extends StObject {
      
      /**
        * The command string that will be invoked upon matching.
        */
      var command: String
      
      /**
        * The regular expression that will be matched against URLs.
        */
      var pattern: js.RegExp
      
      /**
        * The rank order of the registered rule. A lower rank denotes a higher
        * priority. The default rank is `100`.
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IRegisterOptions {
      
      inline def apply(command: String, pattern: js.RegExp): IRegisterOptions = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRegisterOptions]
      }
      
      extension [Self <: IRegisterOptions](x: Self) {
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    type _To = Token[IRouter]
    
    /* This means you don't have to write `^`, but can instead just say `IRouter.foo` */
    override def _to: Token[IRouter] = ^
  }
}
