package typings.inversifyExpressUtils

import org.scalablytyped.runtime.Instantiable0
import typings.express.mod.Application_
import typings.express.mod.Router
import typings.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE
import typings.inversifyExpressUtils.libInterfacesMod.AuthProvider
import typings.inversifyExpressUtils.libInterfacesMod.Controller
import typings.inversifyExpressUtils.libInterfacesMod.ControllerMetadata
import typings.inversifyExpressUtils.libInterfacesMod.ControllerMethodMetadata
import typings.inversifyExpressUtils.libInterfacesMod.ControllerParameterMetadata
import typings.inversifyExpressUtils.libInterfacesMod.HandlerDecorator
import typings.inversifyExpressUtils.libInterfacesMod.Middleware
import typings.inversifyExpressUtils.libInterfacesMod.RawMetadata
import typings.inversifyExpressUtils.libInterfacesMod.RouteInfo
import typings.inversifyExpressUtils.libInterfacesMod.RoutingConfig
import typings.node.urlMod.URL_
import typings.std.ParameterDecorator
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-express-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify-express-utils", "BaseHttpController")
  @js.native
  open class BaseHttpController ()
    extends typings.inversifyExpressUtils.libBaseHttpControllerMod.BaseHttpController
  
  /* note: abstract class */ @JSImport("inversify-express-utils", "BaseMiddleware")
  @js.native
  open class BaseMiddleware ()
    extends typings.inversifyExpressUtils.libBaseMiddlewareMod.BaseMiddleware
  
  @JSImport("inversify-express-utils", "DEFAULT_ROUTING_ROOT_PATH")
  @js.native
  val DEFAULT_ROUTING_ROOT_PATH: /* "/" */ String = js.native
  
  inline def DUPLICATED_CONTROLLER_NAME(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DUPLICATED_CONTROLLER_NAME")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("inversify-express-utils", "HTTP_VERBS_ENUM")
  @js.native
  object HTTP_VERBS_ENUM extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM & String] = js.native
    
    /* "ALL" */ val all: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.all & String = js.native
    
    /* "CONNECT" */ val connect: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.connect & String = js.native
    
    /* "DELETE" */ val delete: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.delete & String = js.native
    
    /* "GET" */ val get: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.get & String = js.native
    
    /* "HEAD" */ val head: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.head & String = js.native
    
    /* "OPTIONS" */ val options: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.options & String = js.native
    
    /* "PATCH" */ val patch: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.patch & String = js.native
    
    /* "POST" */ val post: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.post & String = js.native
    
    /* "PROPFIND" */ val propfind: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.propfind & String = js.native
    
    /* "PUT" */ val put: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.put & String = js.native
    
    /* "TRACE" */ val trace: typings.inversifyExpressUtils.libConstantsMod.HTTP_VERBS_ENUM.trace & String = js.native
  }
  
  /* note: abstract class */ @JSImport("inversify-express-utils", "HttpContent")
  @js.native
  open class HttpContent ()
    extends typings.inversifyExpressUtils.libContentHttpContentMod.HttpContent
  
  @JSImport("inversify-express-utils", "HttpResponseMessage")
  @js.native
  open class HttpResponseMessage ()
    extends typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage {
    def this(statusCode: Double) = this()
  }
  
  @JSImport("inversify-express-utils", "InversifyExpressServer")
  @js.native
  open class InversifyExpressServer protected ()
    extends typings.inversifyExpressUtils.libServerMod.InversifyExpressServer {
    def this(
      container: Container,
      customRouter: js.UndefOr[Router | Null],
      routingConfig: js.UndefOr[RoutingConfig | Null],
      customApp: js.UndefOr[Application_ | Null],
      authProvider: js.UndefOr[Instantiable0[AuthProvider] | Null],
      forceControllers: js.UndefOr[Boolean]
    ) = this()
  }
  
  @JSImport("inversify-express-utils", "JsonContent")
  @js.native
  open class JsonContent protected ()
    extends typings.inversifyExpressUtils.libContentJsonContentMod.JsonContent {
    def this(content: Any) = this()
  }
  
  object METADATA_KEY {
    
    @JSImport("inversify-express-utils", "METADATA_KEY")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils", "METADATA_KEY.controller")
    @js.native
    def controller: String = js.native
    
    @JSImport("inversify-express-utils", "METADATA_KEY.controllerMethod")
    @js.native
    def controllerMethod: String = js.native
    inline def controllerMethod_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controllerMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "METADATA_KEY.controllerParameter")
    @js.native
    def controllerParameter: String = js.native
    inline def controllerParameter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controllerParameter")(x.asInstanceOf[js.Any])
    
    inline def controller_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "METADATA_KEY.httpContext")
    @js.native
    def httpContext: String = js.native
    inline def httpContext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("httpContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inversify-express-utils", "NO_CONTROLLERS_FOUND")
  @js.native
  val NO_CONTROLLERS_FOUND: /* "No controllers have been found! Please ensure that you have register at least one Controller." */ String = js.native
  
  @JSImport("inversify-express-utils", "PARAMETER_TYPE")
  @js.native
  object PARAMETER_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE & Double] = js.native
    
    /* 4 */ val BODY: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.BODY & Double = js.native
    
    /* 6 */ val COOKIES: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.COOKIES & Double = js.native
    
    /* 5 */ val HEADERS: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.HEADERS & Double = js.native
    
    /* 7 */ val NEXT: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.NEXT & Double = js.native
    
    /* 2 */ val PARAMS: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.PARAMS & Double = js.native
    
    /* 8 */ val PRINCIPAL: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.PRINCIPAL & Double = js.native
    
    /* 3 */ val QUERY: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.QUERY & Double = js.native
    
    /* 0 */ val REQUEST: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.REQUEST & Double = js.native
    
    /* 1 */ val RESPONSE: typings.inversifyExpressUtils.libConstantsMod.PARAMETER_TYPE.RESPONSE & Double = js.native
  }
  
  @JSImport("inversify-express-utils", "StringContent")
  @js.native
  open class StringContent protected ()
    extends typings.inversifyExpressUtils.libContentStringContentMod.StringContent {
    def this(content: String) = this()
  }
  
  object TYPE {
    
    @JSImport("inversify-express-utils", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-express-utils", "TYPE.AuthProvider")
    @js.native
    def AuthProvider: js.Symbol = js.native
    inline def AuthProvider_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "TYPE.Controller")
    @js.native
    def Controller: js.Symbol = js.native
    inline def Controller_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "TYPE.HttpContext")
    @js.native
    def HttpContext: js.Symbol = js.native
    inline def HttpContext_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpContext")(x.asInstanceOf[js.Any])
  }
  
  inline def all(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def cleanUpMetadata(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpMetadata")().asInstanceOf[Unit]
  
  inline def controller(path: String, middleware: Middleware*): js.Function1[/* target */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("controller")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  inline def cookies(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")().asInstanceOf[ParameterDecorator]
  inline def cookies(cookieName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")(cookieName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def getControllerMetadata(constructor: Any): ControllerMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[ControllerMetadata]
  
  inline def getControllerMethodMetadata(constructor: Any): js.Array[ControllerMethodMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerMethodMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[js.Array[ControllerMethodMetadata]]
  
  inline def getControllerParameterMetadata(constructor: Any): ControllerParameterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerParameterMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[ControllerParameterMetadata]
  
  inline def getControllersFromContainer(container: Container, forceControllers: Boolean): js.Array[Controller] = (^.asInstanceOf[js.Dynamic].applyDynamic("getControllersFromContainer")(container.asInstanceOf[js.Any], forceControllers.asInstanceOf[js.Any])).asInstanceOf[js.Array[Controller]]
  
  inline def getControllersFromMetadata(): js.Array[Instantiable0[Controller]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllersFromMetadata")().asInstanceOf[js.Array[Instantiable0[Controller]]]
  
  inline def getRawMetadata(container: Container): js.Array[RawMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawMetadata")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[RawMetadata]]
  
  inline def getRouteInfo(container: Container): js.Array[RouteInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteInfo")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteInfo]]
  
  inline def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("httpDelete")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def httpGet(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("httpGet")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def httpHead(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("httpHead")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def httpMethod(
    method: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTTP_VERBS_ENUM * / any */ String,
    path: String,
    middleware: Middleware*
  ): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpMethod")((scala.List(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(middleware.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HandlerDecorator]
  
  inline def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("httpPatch")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def httpPost(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("httpPost")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def httpPut(path: String, middleware: Middleware*): HandlerDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("httpPut")(scala.List(path.asInstanceOf[js.Any]).`++`(middleware.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HandlerDecorator]
  
  inline def injectHttpContext(target: DecoratorTarget[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def injectHttpContext(target: DecoratorTarget[Any], targetKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(target: DecoratorTarget[Any], targetKey: String, indexOrPropertyDescriptor: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], indexOrPropertyDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(
    target: DecoratorTarget[Any],
    targetKey: String,
    indexOrPropertyDescriptor: TypedPropertyDescriptor[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], indexOrPropertyDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(target: DecoratorTarget[Any], targetKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(target: DecoratorTarget[Any], targetKey: js.Symbol, indexOrPropertyDescriptor: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], indexOrPropertyDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(
    target: DecoratorTarget[Any],
    targetKey: js.Symbol,
    indexOrPropertyDescriptor: TypedPropertyDescriptor[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], indexOrPropertyDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(target: DecoratorTarget[Any], targetKey: Unit, indexOrPropertyDescriptor: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], indexOrPropertyDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(
    target: DecoratorTarget[Any],
    targetKey: Unit,
    indexOrPropertyDescriptor: TypedPropertyDescriptor[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], indexOrPropertyDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def instanceOfIHttpActionResult(value: Any): /* is inversify-express-utils.inversify-express-utils/lib/interfaces.IHttpActionResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfIHttpActionResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is inversify-express-utils.inversify-express-utils/lib/interfaces.IHttpActionResult */ Boolean]
  
  inline def next(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[ParameterDecorator]
  
  inline def params(`type`: PARAMETER_TYPE): js.Function3[/* target */ Controller, /* methodName */ String | js.Symbol, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("params")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Controller, /* methodName */ String | js.Symbol, /* index */ Double, Unit]]
  inline def params(`type`: PARAMETER_TYPE, parameterName: String): js.Function3[/* target */ Controller, /* methodName */ String | js.Symbol, /* index */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(`type`.asInstanceOf[js.Any], parameterName.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ Controller, /* methodName */ String | js.Symbol, /* index */ Double, Unit]]
  
  inline def principal(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("principal")().asInstanceOf[ParameterDecorator]
  
  inline def queryParam(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParam")().asInstanceOf[ParameterDecorator]
  inline def queryParam(queryParamName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParam")(queryParamName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def request(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[ParameterDecorator]
  
  inline def requestBody(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestBody")().asInstanceOf[ParameterDecorator]
  
  inline def requestHeaders(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHeaders")().asInstanceOf[ParameterDecorator]
  inline def requestHeaders(headerName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHeaders")(headerName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def requestParam(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestParam")().asInstanceOf[ParameterDecorator]
  inline def requestParam(paramName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestParam")(paramName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def response(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("response")().asInstanceOf[ParameterDecorator]
  
  object results {
    
    @JSImport("inversify-express-utils", "results.BadRequestErrorMessageResult")
    @js.native
    open class BadRequestErrorMessageResult protected ()
      extends typings.inversifyExpressUtils.libResultsMod.BadRequestErrorMessageResult {
      def this(message: String) = this()
    }
    
    @JSImport("inversify-express-utils", "results.BadRequestResult")
    @js.native
    open class BadRequestResult ()
      extends typings.inversifyExpressUtils.libResultsMod.BadRequestResult
    
    @JSImport("inversify-express-utils", "results.ConflictResult")
    @js.native
    open class ConflictResult ()
      extends typings.inversifyExpressUtils.libResultsMod.ConflictResult
    
    @JSImport("inversify-express-utils", "results.CreatedNegotiatedContentResult")
    @js.native
    open class CreatedNegotiatedContentResult[T] protected ()
      extends typings.inversifyExpressUtils.libResultsMod.CreatedNegotiatedContentResult[T] {
      def this(location: String, content: T) = this()
      def this(location: URL_, content: T) = this()
    }
    
    @JSImport("inversify-express-utils", "results.ExceptionResult")
    @js.native
    open class ExceptionResult protected ()
      extends typings.inversifyExpressUtils.libResultsMod.ExceptionResult {
      def this(error: js.Error) = this()
    }
    
    @JSImport("inversify-express-utils", "results.InternalServerErrorResult")
    @js.native
    open class InternalServerErrorResult ()
      extends typings.inversifyExpressUtils.libResultsMod.InternalServerErrorResult
    
    @JSImport("inversify-express-utils", "results.JsonResult")
    @js.native
    open class JsonResult protected ()
      extends typings.inversifyExpressUtils.libResultsMod.JsonResult {
      def this(json: Any, statusCode: Double) = this()
    }
    
    @JSImport("inversify-express-utils", "results.NotFoundResult")
    @js.native
    open class NotFoundResult ()
      extends typings.inversifyExpressUtils.libResultsMod.NotFoundResult
    
    @JSImport("inversify-express-utils", "results.OkNegotiatedContentResult")
    @js.native
    open class OkNegotiatedContentResult[T] protected ()
      extends typings.inversifyExpressUtils.libResultsMod.OkNegotiatedContentResult[T] {
      def this(content: T) = this()
    }
    
    @JSImport("inversify-express-utils", "results.OkResult")
    @js.native
    open class OkResult ()
      extends typings.inversifyExpressUtils.libResultsMod.OkResult
    
    @JSImport("inversify-express-utils", "results.RedirectResult")
    @js.native
    open class RedirectResult protected ()
      extends typings.inversifyExpressUtils.libResultsMod.RedirectResult {
      def this(location: String) = this()
      def this(location: URL_) = this()
    }
    
    @JSImport("inversify-express-utils", "results.ResponseMessageResult")
    @js.native
    open class ResponseMessageResult protected ()
      extends typings.inversifyExpressUtils.libResultsMod.ResponseMessageResult {
      def this(message: typings.inversifyExpressUtils.libHttpResponseMessageMod.HttpResponseMessage) = this()
    }
    
    @JSImport("inversify-express-utils", "results.StatusCodeResult")
    @js.native
    open class StatusCodeResult protected ()
      extends typings.inversifyExpressUtils.libResultsMod.StatusCodeResult {
      def this(statusCode: Double) = this()
    }
  }
}
