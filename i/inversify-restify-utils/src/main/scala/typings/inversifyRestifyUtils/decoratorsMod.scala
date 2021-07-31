package typings.inversifyRestifyUtils

import typings.inversifyRestifyUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyRestifyUtils.interfacesMod.interfaces.Middleware
import typings.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("inversify-restify-utils/dts/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Controller")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  @scala.inline
  def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Delete")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Get")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Head")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Method")(method.asInstanceOf[js.Any], options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Options")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Post")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  @scala.inline
  def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Put")(options.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
}
