package typings.inversifyDashRestifyDashUtils.inversifyDashRestifyDashUtilsMod

import typings.inversifyDashRestifyDashUtils.dtsInterfacesMod.interfacesNs.HandlerDecorator
import typings.inversifyDashRestifyDashUtils.dtsInterfacesMod.interfacesNs.Middleware
import typings.inversifyDashRestifyDashUtils.dtsInterfacesMod.interfacesNs.RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-restify-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
}

