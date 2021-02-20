package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
import typings.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import typings.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("inversify-express-utils/dts/decorators", "all")
  @js.native
  def all(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "controller")
  @js.native
  def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "cookies")
  @js.native
  def cookies(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils/dts/decorators", "cookies")
  @js.native
  def cookies(cookieName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpDelete")
  @js.native
  def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpGet")
  @js.native
  def httpGet(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpHead")
  @js.native
  def httpHead(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpMethod")
  @js.native
  def httpMethod(method: String, path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpPatch")
  @js.native
  def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpPost")
  @js.native
  def httpPost(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "httpPut")
  @js.native
  def httpPut(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "injectHttpContext")
  @js.native
  def injectHttpContext(target: js.Any, targetKey: String): Unit = js.native
  @JSImport("inversify-express-utils/dts/decorators", "injectHttpContext")
  @js.native
  def injectHttpContext(target: js.Any, targetKey: String, index: Double): Unit = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "next")
  @js.native
  def next(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "params")
  @js.native
  def params(`type`: PARAMETER_TYPE): js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit] = js.native
  @JSImport("inversify-express-utils/dts/decorators", "params")
  @js.native
  def params(`type`: PARAMETER_TYPE, parameterName: String): js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit] = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "principal")
  @js.native
  def principal(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "queryParam")
  @js.native
  def queryParam(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils/dts/decorators", "queryParam")
  @js.native
  def queryParam(queryParamName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "request")
  @js.native
  def request(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "requestBody")
  @js.native
  def requestBody(): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "requestHeaders")
  @js.native
  def requestHeaders(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils/dts/decorators", "requestHeaders")
  @js.native
  def requestHeaders(headerName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "requestParam")
  @js.native
  def requestParam(): ParameterDecorator = js.native
  @JSImport("inversify-express-utils/dts/decorators", "requestParam")
  @js.native
  def requestParam(paramName: String): ParameterDecorator = js.native
  
  @JSImport("inversify-express-utils/dts/decorators", "response")
  @js.native
  def response(): ParameterDecorator = js.native
}
