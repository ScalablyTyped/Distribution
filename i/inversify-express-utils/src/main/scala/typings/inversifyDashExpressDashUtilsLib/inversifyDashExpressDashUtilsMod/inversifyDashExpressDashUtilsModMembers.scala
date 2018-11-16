package typings
package inversifyDashExpressDashUtilsLib.inversifyDashExpressDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", JSImport.Namespace)
@js.native
object inversifyDashExpressDashUtilsModMembers extends js.Object {
  val TYPE: inversifyDashExpressDashUtilsLib.Anon_HttpContext = js.native
  val cookies: js.Function1[/* cookieName */ js.UndefOr[java.lang.String], stdLib.ParameterDecorator] = js.native
  val injectHttpContext: js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  val next: js.Function0[stdLib.ParameterDecorator] = js.native
  val principal: js.Function0[stdLib.ParameterDecorator] = js.native
  val queryParam: js.Function1[/* queryParamName */ js.UndefOr[java.lang.String], stdLib.ParameterDecorator] = js.native
  val request: js.Function0[stdLib.ParameterDecorator] = js.native
  val requestBody: js.Function0[stdLib.ParameterDecorator] = js.native
  val requestHeaders: js.Function1[/* headerName */ js.UndefOr[java.lang.String], stdLib.ParameterDecorator] = js.native
  val requestParam: js.Function1[/* paramName */ js.UndefOr[java.lang.String], stdLib.ParameterDecorator] = js.native
  val response: js.Function0[stdLib.ParameterDecorator] = js.native
  def all(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HandlerDecorator = js.native
  def cleanUpMetadata(): scala.Unit = js.native
  def controller(
    path: java.lang.String,
    middleware: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Middleware*
  ): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def getRawMetadata(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container): js.Array[inversifyDashExpressDashUtilsLib.Anon_MethodMetadata] = js.native
  def getRouteInfo(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container): js.Array[inversifyDashExpressDashUtilsLib.Anon_Endpoints] = js.native
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
}

