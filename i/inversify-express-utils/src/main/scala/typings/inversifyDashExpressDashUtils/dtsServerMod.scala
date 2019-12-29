package typings.inversifyDashExpressDashUtils

import typings.express.expressMod.Application
import typings.express.expressMod.Router
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.ConfigFunction
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.RoutingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/server", JSImport.Namespace)
@js.native
object dtsServerMod extends js.Object {
  @js.native
  class InversifyExpressServer protected () extends js.Object {
    /**
      * Wrapper for the express server.
      *
      * @param container Container loaded with all controllers and their dependencies.
      * @param customRouter optional express.Router custom router
      * @param routingConfig optional interfaces.RoutingConfig routing config
      * @param customApp optional express.Application custom app
      * @param authProvider optional interfaces.AuthProvider auth provider
      * @param forceControllers optional boolean setting to force controllers (defaults do true)
      */
    def this(container: Container) = this()
    def this(container: Container, customRouter: Router) = this()
    def this(container: Container, customRouter: Null, routingConfig: RoutingConfig) = this()
    def this(container: Container, customRouter: Router, routingConfig: RoutingConfig) = this()
    def this(container: Container, customRouter: Null, routingConfig: Null, customApp: Application) = this()
    def this(container: Container, customRouter: Null, routingConfig: RoutingConfig, customApp: Application) = this()
    def this(container: Container, customRouter: Router, routingConfig: Null, customApp: Application) = this()
    def this(container: Container, customRouter: Router, routingConfig: RoutingConfig, customApp: Application) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: Null,
      customApp: Null,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: Null,
      customApp: Application,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: RoutingConfig,
      customApp: Null,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: RoutingConfig,
      customApp: Application,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: Null,
      customApp: Null,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: Null,
      customApp: Application,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: RoutingConfig,
      customApp: Null,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: RoutingConfig,
      customApp: Application,
      authProvider: Anon_AuthProvider
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: Null,
      customApp: Null,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: Null,
      customApp: Null,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: Null,
      customApp: Application,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: Null,
      customApp: Application,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: RoutingConfig,
      customApp: Null,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: RoutingConfig,
      customApp: Null,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: RoutingConfig,
      customApp: Application,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Null,
      routingConfig: RoutingConfig,
      customApp: Application,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: Null,
      customApp: Null,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: Null,
      customApp: Null,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: Null,
      customApp: Application,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: Null,
      customApp: Application,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: RoutingConfig,
      customApp: Null,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: RoutingConfig,
      customApp: Null,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: RoutingConfig,
      customApp: Application,
      authProvider: Null,
      forceControllers: Boolean
    ) = this()
    def this(
      container: Container,
      customRouter: Router,
      routingConfig: RoutingConfig,
      customApp: Application,
      authProvider: Anon_AuthProvider,
      forceControllers: Boolean
    ) = this()
    var _AuthProvider: js.Any = js.native
    var _app: js.Any = js.native
    var _configFn: js.Any = js.native
    var _container: js.Any = js.native
    var _errorConfigFn: js.Any = js.native
    var _forceControllers: js.Any = js.native
    var _router: js.Any = js.native
    var _routingConfig: js.Any = js.native
    /* private */ def _createHttpContext(req: js.Any, res: js.Any, next: js.Any): js.Any = js.native
    /* private */ def _getCurrentUser(req: js.Any, res: js.Any, next: js.Any): js.Any = js.native
    /* private */ def _getHttpContext(req: js.Any): js.Any = js.native
    /* private */ def _getPrincipal(req: js.Any): js.Any = js.native
    /**
      * Applies all routes and configuration to the server, returning the express application.
      */
    def build(): Application = js.native
    /* private */ def copyHeadersTo(headers: js.Any, target: js.Any): js.Any = js.native
    /* private */ def extractParameters(req: js.Any, res: js.Any, next: js.Any, params: js.Any): js.Any = js.native
    /* private */ def getParam(source: js.Any, paramType: js.Any, injectRoot: js.Any): js.Any = js.native
    /* private */ def getParam(source: js.Any, paramType: js.Any, injectRoot: js.Any, name: js.Any): js.Any = js.native
    /* private */ def handleHttpResponseMessage(message: js.Any, res: js.Any): js.Any = js.native
    /* private */ def handlerFactory(controllerName: js.Any, key: js.Any, parameterMetadata: js.Any): js.Any = js.native
    /* private */ def registerControllers(): js.Any = js.native
    /* private */ def resolveMidleware(
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param middleware because its type <none> is not an array type */ middleware: js.Any
    ): js.Any = js.native
    /**
      * Sets the configuration function to be applied to the application.
      * Note that the config function is not actually executed until a call to InversifyExpresServer.build().
      *
      * This method is chainable.
      *
      * @param fn Function in which app-level middleware can be registered.
      */
    def setConfig(fn: ConfigFunction): InversifyExpressServer = js.native
    /**
      * Sets the error handler configuration function to be applied to the application.
      * Note that the error config function is not actually executed until a call to InversifyExpresServer.build().
      *
      * This method is chainable.
      *
      * @param fn Function in which app-level error handlers can be registered.
      */
    def setErrorConfig(fn: ConfigFunction): InversifyExpressServer = js.native
  }
  
}

