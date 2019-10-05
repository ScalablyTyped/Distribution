package typings.inversifyDashExpressDashUtils.inversifyDashExpressDashUtilsMod

import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.HandlerDecorator
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "httpPatch")
@js.native
object httpPatch extends js.Object {
  def apply(path: String, middleware: Middleware*): HandlerDecorator = js.native
}

