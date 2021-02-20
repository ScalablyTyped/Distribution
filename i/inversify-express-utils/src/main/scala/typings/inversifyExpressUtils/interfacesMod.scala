package typings.inversifyExpressUtils

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
import typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object interfaces {
    
    @js.native
    trait AuthProvider extends StObject {
      
      def getUser(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): js.Promise[Principal] = js.native
    }
    object AuthProvider {
      
      @scala.inline
      def apply(
        getUser: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
      ): AuthProvider = {
        val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
        __obj.asInstanceOf[AuthProvider]
      }
      
      @scala.inline
      implicit class AuthProviderMutableBuilder[Self <: AuthProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetUser(
          value: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => js.Promise[Principal]
        ): Self = StObject.set(x, "getUser", js.Any.fromFunction3(value))
      }
    }
    
    type ConfigFunction = js.Function1[/* app */ Application_, Unit]
    
    @js.native
    trait Controller extends StObject
    
    @js.native
    trait ControllerMetadata extends StObject {
      
      var middleware: js.Array[Middleware] = js.native
      
      var path: String = js.native
      
      var target: js.Any = js.native
    }
    object ControllerMetadata {
      
      @scala.inline
      def apply(middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMetadata = {
        val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMetadata]
      }
      
      @scala.inline
      implicit class ControllerMetadataMutableBuilder[Self <: ControllerMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value :_*))
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ControllerMethodMetadata extends ControllerMetadata {
      
      var key: String = js.native
      
      var method: String = js.native
    }
    object ControllerMethodMetadata {
      
      @scala.inline
      def apply(key: String, method: String, middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMethodMetadata = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMethodMetadata]
      }
      
      @scala.inline
      implicit class ControllerMethodMetadataMutableBuilder[Self <: ControllerMethodMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
    
    type ControllerParameterMetadata = StringDictionary[js.Array[ParameterMetadata]]
    
    type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ String, /* value */ js.Any, Unit]
    
    @js.native
    trait HttpContext extends StObject {
      
      var container: Container = js.native
      
      var request: Request_[ParamsDictionary, _, _, Query] = js.native
      
      var response: Response_[_] = js.native
      
      var user: Principal = js.native
    }
    object HttpContext {
      
      @scala.inline
      def apply(
        container: Container,
        request: Request_[ParamsDictionary, _, _, Query],
        response: Response_[_],
        user: Principal
      ): HttpContext = {
        val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpContext]
      }
      
      @scala.inline
      implicit class HttpContextMutableBuilder[Self <: HttpContext] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequest(value: Request_[ParamsDictionary, _, _, Query]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: Response_[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser(value: Principal): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IHttpActionResult extends StObject {
      
      def executeAsync(): js.Promise[HttpResponseMessage] = js.native
    }
    object IHttpActionResult {
      
      @scala.inline
      def apply(executeAsync: () => js.Promise[HttpResponseMessage]): IHttpActionResult = {
        val __obj = js.Dynamic.literal(executeAsync = js.Any.fromFunction0(executeAsync))
        __obj.asInstanceOf[IHttpActionResult]
      }
      
      @scala.inline
      implicit class IHttpActionResultMutableBuilder[Self <: IHttpActionResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExecuteAsync(value: () => js.Promise[HttpResponseMessage]): Self = StObject.set(x, "executeAsync", js.Any.fromFunction0(value))
      }
    }
    
    type Middleware = ServiceIdentifier[js.Any] | (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])
    
    @js.native
    trait ParameterMetadata extends StObject {
      
      var index: Double = js.native
      
      var injectRoot: Boolean = js.native
      
      var parameterName: js.UndefOr[String] = js.native
      
      var `type`: PARAMETER_TYPE = js.native
    }
    object ParameterMetadata {
      
      @scala.inline
      def apply(index: Double, injectRoot: Boolean, `type`: PARAMETER_TYPE): ParameterMetadata = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], injectRoot = injectRoot.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParameterMetadata]
      }
      
      @scala.inline
      implicit class ParameterMetadataMutableBuilder[Self <: ParameterMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInjectRoot(value: Boolean): Self = StObject.set(x, "injectRoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
        
        @scala.inline
        def setType(value: PARAMETER_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Principal extends StObject {
      
      var details: js.Any = js.native
      
      def isAuthenticated(): js.Promise[Boolean] = js.native
      
      def isInRole(role: String): js.Promise[Boolean] = js.native
      
      def isResourceOwner(resourceId: js.Any): js.Promise[Boolean] = js.native
    }
    object Principal {
      
      @scala.inline
      def apply(
        details: js.Any,
        isAuthenticated: () => js.Promise[Boolean],
        isInRole: String => js.Promise[Boolean],
        isResourceOwner: js.Any => js.Promise[Boolean]
      ): Principal = {
        val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
        __obj.asInstanceOf[Principal]
      }
      
      @scala.inline
      implicit class PrincipalMutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsAuthenticated(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAuthenticated", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsInRole(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isInRole", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIsResourceOwner(value: js.Any => js.Promise[Boolean]): Self = StObject.set(x, "isResourceOwner", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait RoutingConfig extends StObject {
      
      var rootPath: String = js.native
    }
    object RoutingConfig {
      
      @scala.inline
      def apply(rootPath: String): RoutingConfig = {
        val __obj = js.Dynamic.literal(rootPath = rootPath.asInstanceOf[js.Any])
        __obj.asInstanceOf[RoutingConfig]
      }
      
      @scala.inline
      implicit class RoutingConfigMutableBuilder[Self <: RoutingConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      }
    }
  }
}
