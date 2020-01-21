package typings.lasso

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  def serveStatic(): RequestHandler[ParamsDictionary] = js.native
  def serveStatic(options: AnonLasso): RequestHandler[ParamsDictionary] = js.native
}

