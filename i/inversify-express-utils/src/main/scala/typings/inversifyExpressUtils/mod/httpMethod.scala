package typings.inversifyExpressUtils.mod

import typings.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "httpMethod")
@js.native
object httpMethod extends js.Object {
  def apply(method: String, path: String, middleware: Middleware*): HandlerDecorator = js.native
}

