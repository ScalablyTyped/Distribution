package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
import typings.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import typings.std.ParameterDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils/dts/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  
  def all(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  def cookies(): ParameterDecorator = js.native
  def cookies(cookieName: String): ParameterDecorator = js.native
  
  def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def httpGet(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def httpHead(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def httpMethod(method: String, path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def httpPost(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def httpPut(path: String, middleware: Middleware*): HandlerDecorator = js.native
  
  def injectHttpContext(target: js.Any, targetKey: String): Unit = js.native
  def injectHttpContext(target: js.Any, targetKey: String, index: Double): Unit = js.native
  
  def next(): ParameterDecorator = js.native
  
  def params(`type`: PARAMETER_TYPE): js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit] = js.native
  def params(`type`: PARAMETER_TYPE, parameterName: String): js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit] = js.native
  
  def principal(): ParameterDecorator = js.native
  
  def queryParam(): ParameterDecorator = js.native
  def queryParam(queryParamName: String): ParameterDecorator = js.native
  
  def request(): ParameterDecorator = js.native
  
  def requestBody(): ParameterDecorator = js.native
  
  def requestHeaders(): ParameterDecorator = js.native
  def requestHeaders(headerName: String): ParameterDecorator = js.native
  
  def requestParam(): ParameterDecorator = js.native
  def requestParam(paramName: String): ParameterDecorator = js.native
  
  def response(): ParameterDecorator = js.native
}
