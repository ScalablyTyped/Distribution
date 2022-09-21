package typings.inversifyExpressUtils

import org.scalablytyped.runtime.Instantiable0
import typings.express.mod.Application_
import typings.express.mod.Router
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.interfacesMod.AuthProvider
import typings.inversifyExpressUtils.interfacesMod.ConfigFunction
import typings.inversifyExpressUtils.interfacesMod.RoutingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("inversify-express-utils/lib/server", "InversifyExpressServer")
  @js.native
  open class InversifyExpressServer protected () extends StObject {
    def this(
      container: Container,
      customRouter: js.UndefOr[Router | Null],
      routingConfig: js.UndefOr[RoutingConfig | Null],
      customApp: js.UndefOr[Application_ | Null],
      authProvider: js.UndefOr[Instantiable0[AuthProvider] | Null],
      forceControllers: js.UndefOr[Boolean]
    ) = this()
    
    /* private */ var _AuthProvider: Any = js.native
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _configFn: Any = js.native
    
    /* private */ var _container: Any = js.native
    
    /* private */ var _createHttpContext: Any = js.native
    
    /* private */ var _errorConfigFn: Any = js.native
    
    /* private */ var _forceControllers: Any = js.native
    
    /* private */ var _getCurrentUser: Any = js.native
    
    /* private */ var _getHttpContext: Any = js.native
    
    /* private */ var _getPrincipal: Any = js.native
    
    /* private */ var _router: Any = js.native
    
    /* private */ var _routingConfig: Any = js.native
    
    def build(): Application_ = js.native
    
    /* private */ var copyHeadersTo: Any = js.native
    
    /* private */ var extractParameters: Any = js.native
    
    /* private */ var getParam: Any = js.native
    
    /* private */ var handleHttpResponseMessage: Any = js.native
    
    /* private */ var handlerFactory: Any = js.native
    
    /* private */ var registerControllers: Any = js.native
    
    /* private */ var resolveMidleware: Any = js.native
    
    def setConfig(fn: ConfigFunction): InversifyExpressServer = js.native
    
    def setErrorConfig(fn: ConfigFunction): InversifyExpressServer = js.native
  }
}
