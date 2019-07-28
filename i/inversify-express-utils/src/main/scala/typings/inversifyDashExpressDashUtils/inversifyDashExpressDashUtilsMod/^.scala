package typings.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsMod

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Container
import typings.inversifyDashExpressDashUtils.Anon_Controller
import typings.inversifyDashExpressDashUtils.Anon_ControllerMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.HandlerDecorator
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.Middleware
import typings.std.ParameterDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def all(path: String, middleware: Middleware*): HandlerDecorator = js.native
  def cleanUpMetadata(): Unit = js.native
  def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  def cookies(): ParameterDecorator = js.native
  def cookies(cookieName: String): ParameterDecorator = js.native
  def getRawMetadata(container: Container): js.Array[Anon_ControllerMetadata] = js.native
  def getRouteInfo(container: Container): js.Array[Anon_Controller] = js.native
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

