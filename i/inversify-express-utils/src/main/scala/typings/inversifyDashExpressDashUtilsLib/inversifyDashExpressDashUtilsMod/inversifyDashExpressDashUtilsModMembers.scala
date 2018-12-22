package typings
package inversifyDashExpressDashUtilsLib.inversifyDashExpressDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", JSImport.Namespace)
@js.native
object inversifyDashExpressDashUtilsModMembers extends js.Object {
  val TYPE: inversifyDashExpressDashUtilsLib.Anon_HttpContext = js.native
  def all(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def cleanUpMetadata(): scala.Unit = js.native
  def controller(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def cookies(): stdLib.ParameterDecorator = js.native
  def cookies(cookieName: java.lang.String): stdLib.ParameterDecorator = js.native
  def getRawMetadata(container: js.Any): js.Array[inversifyDashExpressDashUtilsLib.Anon_MethodMetadata] = js.native
  def getRouteInfo(container: js.Any): js.Array[inversifyDashExpressDashUtilsLib.Anon_Endpoints] = js.native
  def httpDelete(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def httpGet(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def httpHead(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def httpMethod(
    method: java.lang.String,
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def httpPatch(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def httpPost(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def httpPut(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def injectHttpContext(target: js.Any, targetKey: java.lang.String): scala.Unit = js.native
  def injectHttpContext(target: js.Any, targetKey: java.lang.String, index: scala.Double): scala.Unit = js.native
  def next(): stdLib.ParameterDecorator = js.native
  def principal(): stdLib.ParameterDecorator = js.native
  def queryParam(): stdLib.ParameterDecorator = js.native
  def queryParam(queryParamName: java.lang.String): stdLib.ParameterDecorator = js.native
  def request(): stdLib.ParameterDecorator = js.native
  def requestBody(): stdLib.ParameterDecorator = js.native
  def requestHeaders(): stdLib.ParameterDecorator = js.native
  def requestHeaders(headerName: java.lang.String): stdLib.ParameterDecorator = js.native
  def requestParam(): stdLib.ParameterDecorator = js.native
  def requestParam(paramName: java.lang.String): stdLib.ParameterDecorator = js.native
  def response(): stdLib.ParameterDecorator = js.native
}

