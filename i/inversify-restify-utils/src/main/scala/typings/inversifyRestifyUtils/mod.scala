package typings.inversifyRestifyUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyRestifyUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyRestifyUtils.interfacesMod.interfaces.Middleware
import typings.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import typings.restify.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-restify-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @js.native
  class InversifyRestifyServer protected ()
    extends typings.inversifyRestifyUtils.serverMod.InversifyRestifyServer {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions with typings.inversifyRestifyUtils.interfacesMod.interfaces.ServerOptions
    ) = this()
  }
  
  @js.native
  object TYPE extends js.Object {
    
    var Controller: js.Symbol = js.native
  }
}
