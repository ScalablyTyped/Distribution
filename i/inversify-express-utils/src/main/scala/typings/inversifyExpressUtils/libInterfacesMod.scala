package typings.inversifyExpressUtils

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE
import typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfacesMod {
  
  trait AuthProvider extends StObject {
    
    def getUser(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): js.Promise[Principal]
  }
  object AuthProvider {
    
    inline def apply(
      getUser: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]], NextFunction) => js.Promise[Principal]
    ): AuthProvider = {
      val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction3(getUser))
      __obj.asInstanceOf[AuthProvider]
    }
    
    extension [Self <: AuthProvider](x: Self) {
      
      inline def setGetUser(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], Response_[Any, Record[String, Any]], NextFunction) => js.Promise[Principal]
      ): Self = StObject.set(x, "getUser", js.Any.fromFunction3(value))
    }
  }
  
  type ConfigFunction = js.Function1[/* app */ Application_, Unit]
  
  trait Controller extends StObject
  
  trait ControllerMetadata extends StObject {
    
    var middleware: js.Array[Middleware]
    
    var path: String
    
    var target: Any
  }
  object ControllerMetadata {
    
    inline def apply(middleware: js.Array[Middleware], path: String, target: Any): ControllerMetadata = {
      val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControllerMetadata]
    }
    
    extension [Self <: ControllerMetadata](x: Self) {
      
      inline def setMiddleware(value: js.Array[Middleware]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareVarargs(value: Middleware*): Self = StObject.set(x, "middleware", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControllerMethodMetadata
    extends StObject
       with ControllerMetadata {
    
    var key: String
    
    var method: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTP_VERBS_ENUM * / any */ String
  }
  object ControllerMethodMetadata {
    
    inline def apply(
      key: String,
      method: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTP_VERBS_ENUM * / any */ String,
      middleware: js.Array[Middleware],
      path: String,
      target: Any
    ): ControllerMethodMetadata = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControllerMethodMetadata]
    }
    
    extension [Self <: ControllerMethodMetadata](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMethod(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTP_VERBS_ENUM * / any */ String
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  type ControllerParameterMetadata = StringDictionary[js.Array[ParameterMetadata]]
  
  type HandlerDecorator = js.Function3[/* target */ Any, /* key */ String, /* value */ Any, Unit]
  
  trait HttpContext extends StObject {
    
    var container: Container
    
    var request: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    var response: Response_[Any, Record[String, Any]]
    
    var user: Principal
  }
  object HttpContext {
    
    inline def apply(
      container: Container,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      response: Response_[Any, Record[String, Any]],
      user: Principal
    ): HttpContext = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpContext]
    }
    
    extension [Self <: HttpContext](x: Self) {
      
      inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setRequest(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response_[Any, Record[String, Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
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
  
  type Middleware = ServiceIdentifier[Any] | (RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ])
  
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
    
    var details: Any
    
    def isAuthenticated(): js.Promise[Boolean]
    
    def isInRole(role: String): js.Promise[Boolean]
    
    def isResourceOwner(resourceId: Any): js.Promise[Boolean]
  }
  object Principal {
    
    inline def apply(
      details: Any,
      isAuthenticated: () => js.Promise[Boolean],
      isInRole: String => js.Promise[Boolean],
      isResourceOwner: Any => js.Promise[Boolean]
    ): Principal = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
      __obj.asInstanceOf[Principal]
    }
    
    extension [Self <: Principal](x: Self) {
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setIsAuthenticated(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAuthenticated", js.Any.fromFunction0(value))
      
      inline def setIsInRole(value: String => js.Promise[Boolean]): Self = StObject.set(x, "isInRole", js.Any.fromFunction1(value))
      
      inline def setIsResourceOwner(value: Any => js.Promise[Boolean]): Self = StObject.set(x, "isResourceOwner", js.Any.fromFunction1(value))
    }
  }
  
  trait RawMetadata extends StObject {
    
    var controllerMetadata: ControllerMetadata
    
    var methodMetadata: js.Array[ControllerMethodMetadata]
    
    var parameterMetadata: ControllerParameterMetadata
  }
  object RawMetadata {
    
    inline def apply(
      controllerMetadata: ControllerMetadata,
      methodMetadata: js.Array[ControllerMethodMetadata],
      parameterMetadata: ControllerParameterMetadata
    ): RawMetadata = {
      val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawMetadata]
    }
    
    extension [Self <: RawMetadata](x: Self) {
      
      inline def setControllerMetadata(value: ControllerMetadata): Self = StObject.set(x, "controllerMetadata", value.asInstanceOf[js.Any])
      
      inline def setMethodMetadata(value: js.Array[ControllerMethodMetadata]): Self = StObject.set(x, "methodMetadata", value.asInstanceOf[js.Any])
      
      inline def setMethodMetadataVarargs(value: ControllerMethodMetadata*): Self = StObject.set(x, "methodMetadata", js.Array(value*))
      
      inline def setParameterMetadata(value: ControllerParameterMetadata): Self = StObject.set(x, "parameterMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteDetails extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var route: String
  }
  object RouteDetails {
    
    inline def apply(route: String): RouteDetails = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDetails]
    }
    
    extension [Self <: RouteDetails](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteInfo extends StObject {
    
    var controller: Any
    
    var endpoints: js.Array[RouteDetails]
  }
  object RouteInfo {
    
    inline def apply(controller: Any, endpoints: js.Array[RouteDetails]): RouteInfo = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo]
    }
    
    extension [Self <: RouteInfo](x: Self) {
      
      inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setEndpoints(value: js.Array[RouteDetails]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: RouteDetails*): Self = StObject.set(x, "endpoints", js.Array(value*))
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
