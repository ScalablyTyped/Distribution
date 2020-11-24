package typings.inversifyRestifyUtils

import typings.inversifyRestifyUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyRestifyUtils.interfacesMod.interfaces.Middleware
import typings.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-restify-utils/dts/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  
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
