package typings.inversifyExpressUtils

import typings.express.mod.Application_
import typings.express.mod.Router
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.anon.Controller
import typings.inversifyExpressUtils.anon.ControllerMetadata
import typings.inversifyExpressUtils.anon.Instantiable
import typings.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import typings.inversifyExpressUtils.interfacesMod.interfaces.RoutingConfig
import typings.node.urlMod.URL_
import typings.std.Error
import typings.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-express-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inversify-express-utils", "BaseHttpController")
  @js.native
  class BaseHttpController ()
    extends typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
  
  @JSImport("inversify-express-utils", "BaseMiddleware")
  @js.native
  abstract class BaseMiddleware ()
    extends typings.inversifyExpressUtils.baseMiddlewareMod.BaseMiddleware
  
  @JSImport("inversify-express-utils", "HttpContent")
  @js.native
  abstract class HttpContent ()
    extends typings.inversifyExpressUtils.httpContentMod.HttpContent
  
  @JSImport("inversify-express-utils", "HttpResponseMessage")
  @js.native
  class HttpResponseMessage ()
    extends typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage {
    def this(statusCode: Double) = this()
  }
  
  @JSImport("inversify-express-utils", "InversifyExpressServer")
  @js.native
  class InversifyExpressServer protected ()
    extends typings.inversifyExpressUtils.serverMod.InversifyExpressServer {
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
    def this(
      container: Container,
      customRouter: js.UndefOr[Router | Null],
      routingConfig: js.UndefOr[RoutingConfig | Null],
      customApp: js.UndefOr[Application_ | Null],
      authProvider: js.UndefOr[Instantiable | Null],
      forceControllers: js.UndefOr[Boolean]
    ) = this()
  }
  
  @JSImport("inversify-express-utils", "JsonContent")
  @js.native
  class JsonContent protected ()
    extends typings.inversifyExpressUtils.jsonContentMod.JsonContent {
    def this(content: js.Any) = this()
    def this(content: js.Any, mediaType: String) = this()
  }
  
  @JSImport("inversify-express-utils", "StringContent")
  @js.native
  class StringContent protected ()
    extends typings.inversifyExpressUtils.stringContentMod.StringContent {
    def this(content: String) = this()
    def this(content: String, mediaType: String) = this()
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
  
  inline def all(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def cleanUpMetadata(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpMetadata")().asInstanceOf[Unit]
  
  inline def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  inline def cookies(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")().asInstanceOf[ParameterDecorator]
  inline def cookies(cookieName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")(cookieName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def getRawMetadata(container: Container): js.Array[ControllerMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawMetadata")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[ControllerMetadata]]
  
  inline def getRouteInfo(container: Container): js.Array[Controller] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteInfo")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[Controller]]
  
  inline def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpDelete")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpGet(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpGet")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpHead(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpHead")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpMethod(method: String, path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpMethod")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpPatch")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpPost(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpPost")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpPut(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpPut")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def injectHttpContext(target: js.Any, targetKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(target: js.Any, targetKey: String, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def next(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[ParameterDecorator]
  
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
    class BadRequestErrorMessageResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.BadRequestErrorMessageResult {
      def this(
        message: String,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.BadRequestResult")
    @js.native
    class BadRequestResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.BadRequestResult {
      def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.ConflictResult")
    @js.native
    class ConflictResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.ConflictResult {
      def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.CreatedNegotiatedContentResult")
    @js.native
    class CreatedNegotiatedContentResult[T] protected ()
      extends typings.inversifyExpressUtils.resultsMod.CreatedNegotiatedContentResult[T] {
      def this(
        location: String,
        content: T,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
      def this(
        location: URL_,
        content: T,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.ExceptionResult")
    @js.native
    class ExceptionResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.ExceptionResult {
      def this(
        error: Error,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.InternalServerErrorResult")
    @js.native
    class InternalServerErrorResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.InternalServerErrorResult {
      def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.JsonResult")
    @js.native
    class JsonResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.JsonResult {
      def this(
        json: js.Any,
        statusCode: Double,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.NotFoundResult")
    @js.native
    class NotFoundResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.NotFoundResult {
      def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.OkNegotiatedContentResult")
    @js.native
    class OkNegotiatedContentResult[T] protected ()
      extends typings.inversifyExpressUtils.resultsMod.OkNegotiatedContentResult[T] {
      def this(content: T, apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.OkResult")
    @js.native
    class OkResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.OkResult {
      def this(apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController) = this()
    }
    
    @JSImport("inversify-express-utils", "results.RedirectResult")
    @js.native
    class RedirectResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.RedirectResult {
      def this(
        location: String,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
      def this(
        location: URL_,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.ResponseMessageResult")
    @js.native
    class ResponseMessageResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.ResponseMessageResult {
      def this(
        message: typings.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
    
    @JSImport("inversify-express-utils", "results.StatusCodeResult")
    @js.native
    class StatusCodeResult protected ()
      extends typings.inversifyExpressUtils.resultsMod.StatusCodeResult {
      def this(
        statusCode: Double,
        apiController: typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
      ) = this()
    }
  }
}
