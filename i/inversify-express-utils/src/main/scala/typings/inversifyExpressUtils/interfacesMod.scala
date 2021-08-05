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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  object interfaces {
    
    trait AuthProvider extends StObject {
      
      def getUser(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], next: NextFunction): js.Promise[Principal]
    }
    object AuthProvider {
      
      inline def apply(
        getUser: (Request_[ParamsDictionary, js.Any, js.Any, Query], Response_[js.Any], NextFunction) => js.Promise[Principal]
      ): AuthProvider = {
        val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
        __obj.asInstanceOf[AuthProvider]
      }
      
      extension [Self <: AuthProvider](x: Self) {
        
        inline def setGetUser(
          value: (Request_[ParamsDictionary, js.Any, js.Any, Query], Response_[js.Any], NextFunction) => js.Promise[Principal]
        ): Self = StObject.set(x, "getUser", js.Any.fromFunction3(value))
      }
    }
    
    type ConfigFunction = js.Function1[/* app */ Application_, Unit]
    
    trait Controller extends StObject
    
    trait ControllerMetadata extends StObject {
      
      var middleware: js.Array[Middleware]
      
      var path: String
      
      var target: js.Any
    }
    object ControllerMetadata {
      
      inline def apply(middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMetadata = {
        val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMetadata]
      }
      
      extension [Self <: ControllerMetadata](x: Self) {
        
        inline def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
        
        inline def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value :_*))
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    trait ControllerMethodMetadata
      extends StObject
         with ControllerMetadata {
      
      var key: String
      
      var method: String
    }
    object ControllerMethodMetadata {
      
      inline def apply(key: String, method: String, middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMethodMetadata = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ControllerMethodMetadata]
      }
      
      extension [Self <: ControllerMethodMetadata](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
    
    type ControllerParameterMetadata = StringDictionary[js.Array[ParameterMetadata]]
    
    type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ String, /* value */ js.Any, Unit]
    
    trait HttpContext extends StObject {
      
      var container: Container
      
      var request: Request_[ParamsDictionary, js.Any, js.Any, Query]
      
      var response: Response_[js.Any]
      
      var user: Principal
    }
    object HttpContext {
      
      inline def apply(
        container: Container,
        request: Request_[ParamsDictionary, js.Any, js.Any, Query],
        response: Response_[js.Any],
        user: Principal
      ): HttpContext = {
        val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpContext]
      }
      
      extension [Self <: HttpContext](x: Self) {
        
        inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setRequest(value: Request_[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Response_[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setUser(value: Principal): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    trait IHttpActionResult extends StObject {
      
      def executeAsync(): js.Promise[HttpResponseMessage]
    }
    object IHttpActionResult {
      
      inline def apply(executeAsync: () => js.Promise[HttpResponseMessage]): IHttpActionResult = {
        val __obj = js.Dynamic.literal(executeAsync = js.Any.fromFunction0(executeAsync))
        __obj.asInstanceOf[IHttpActionResult]
      }
      
      extension [Self <: IHttpActionResult](x: Self) {
        
        inline def setExecuteAsync(value: () => js.Promise[HttpResponseMessage]): Self = StObject.set(x, "executeAsync", js.Any.fromFunction0(value))
      }
    }
    
    type Middleware = ServiceIdentifier[js.Any] | (RequestHandler[ParamsDictionary, js.Any, js.Any, Query])
    
    trait ParameterMetadata extends StObject {
      
      var index: Double
      
      var injectRoot: Boolean
      
      var parameterName: js.UndefOr[String] = js.undefined
      
      var `type`: PARAMETER_TYPE
    }
    object ParameterMetadata {
      
      inline def apply(index: Double, injectRoot: Boolean, `type`: PARAMETER_TYPE): ParameterMetadata = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], injectRoot = injectRoot.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParameterMetadata]
      }
      
      extension [Self <: ParameterMetadata](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setInjectRoot(value: Boolean): Self = StObject.set(x, "injectRoot", value.asInstanceOf[js.Any])
        
        inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
        
        inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
        
        inline def setType(value: PARAMETER_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Principal extends StObject {
      
      var details: js.Any
      
      def isAuthenticated(): js.Promise[Boolean]
      
      def isInRole(role: String): js.Promise[Boolean]
      
      def isResourceOwner(resourceId: js.Any): js.Promise[Boolean]
    }
    object Principal {
      
      inline def apply(
        details: js.Any,
        isAuthenticated: () => js.Promise[Boolean],
        isInRole: String => js.Promise[Boolean],
        isResourceOwner: js.Any => js.Promise[Boolean]
      ): Principal = {
        val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
        __obj.asInstanceOf[Principal]
      }
      
      extension [Self <: Principal](x: Self) {
        
        inline def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setIsAuthenticated(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAuthenticated", js.Any.fromFunction0(value))
        
        inline def setIsInRole(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isInRole", js.Any.fromFunction1(value))
        
        inline def setIsResourceOwner(value: js.Any => js.Promise[Boolean]): Self = StObject.set(x, "isResourceOwner", js.Any.fromFunction1(value))
      }
    }
    
    trait RoutingConfig extends StObject {
      
      var rootPath: String
    }
    object RoutingConfig {
      
      inline def apply(rootPath: String): RoutingConfig = {
        val __obj = js.Dynamic.literal(rootPath = rootPath.asInstanceOf[js.Any])
        __obj.asInstanceOf[RoutingConfig]
      }
      
      extension [Self <: RoutingConfig](x: Self) {
        
        inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      }
    }
  }
}
