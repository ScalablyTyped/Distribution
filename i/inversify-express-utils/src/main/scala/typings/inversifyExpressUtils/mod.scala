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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-express-utils", "BaseHttpController")
  @js.native
  class BaseHttpController ()
    extends typings.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
  
  @JSImport("inversify-express-utils", "BaseMiddleware")
  @js.native
  abstract class BaseMiddleware () extends StObject
  
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
    @scala.inline
    def AuthProvider_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "TYPE.Controller")
    @js.native
    def Controller: js.Symbol = js.native
    @scala.inline
    def Controller_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Controller")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-express-utils", "TYPE.HttpContext")
    @js.native
    def HttpContext: js.Symbol = js.native
    @scala.inline
    def HttpContext_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpContext")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("inversify-express-utils", "all")
  @js.native
  def all(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "cleanUpMetadata")
  @js.native
  def cleanUpMetadata(): Unit = js.native
  
  @JSImport("inversify-express-utils", "controller")
  @js.native
  def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("inversify-express-utils", "cookies")
  @js.native
  def cookies(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "cookies")
  @js.native
  def cookies(cookieName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "getRawMetadata")
  @js.native
  def getRawMetadata(container: Container): js.Array[ControllerMetadata] = js.native
  
  @JSImport("inversify-express-utils", "getRouteInfo")
  @js.native
  def getRouteInfo(container: Container): js.Array[Controller] = js.native
  
  @JSImport("inversify-express-utils", "httpDelete")
  @js.native
  def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpGet")
  @js.native
  def httpGet(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpHead")
  @js.native
  def httpHead(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpMethod")
  @js.native
  def httpMethod(method: String, path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpPatch")
  @js.native
  def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpPost")
  @js.native
  def httpPost(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "httpPut")
  @js.native
  def httpPut(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils", "injectHttpContext")
  @js.native
  def injectHttpContext(target: js.Any, targetKey: String): Unit = js.native
  @JSImport("inversify-express-utils", "injectHttpContext")
  @js.native
  def injectHttpContext(target: js.Any, targetKey: String, index: Double): Unit = js.native
  
  @JSImport("inversify-express-utils", "next")
  @js.native
  def next(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "principal")
  @js.native
  def principal(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "queryParam")
  @js.native
  def queryParam(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "queryParam")
  @js.native
  def queryParam(queryParamName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "request")
  @js.native
  def request(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "requestBody")
  @js.native
  def requestBody(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "requestHeaders")
  @js.native
  def requestHeaders(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "requestHeaders")
  @js.native
  def requestHeaders(headerName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "requestParam")
  @js.native
  def requestParam(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils", "requestParam")
  @js.native
  def requestParam(paramName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils", "response")
  @js.native
  def response(): ParameterDecorator = js.native
  
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
