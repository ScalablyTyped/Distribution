package typings.lasso

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.lasso.anon.Lasso
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  def serveStatic(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def serveStatic(options: Lasso): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

