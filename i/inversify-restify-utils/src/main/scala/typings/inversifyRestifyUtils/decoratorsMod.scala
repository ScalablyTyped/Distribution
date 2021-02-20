package typings.inversifyRestifyUtils

import typings.inversifyRestifyUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyRestifyUtils.interfacesMod.interfaces.Middleware
import typings.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("inversify-restify-utils/dts/decorators", "Controller")
  @js.native
  def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Delete")
  @js.native
  def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Get")
  @js.native
  def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Head")
  @js.native
  def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Method")
  @js.native
  def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Options")
  @js.native
  def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Patch")
  @js.native
  def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Post")
  @js.native
  def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils/dts/decorators", "Put")
  @js.native
  def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
}
