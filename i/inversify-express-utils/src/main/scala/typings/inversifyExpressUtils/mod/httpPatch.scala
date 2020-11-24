package typings.inversifyExpressUtils.mod

import typings.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils", "httpPatch")
@js.native
object httpPatch extends js.Object {
  
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}
