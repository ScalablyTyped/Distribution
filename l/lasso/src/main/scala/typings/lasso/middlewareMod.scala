package typings.lasso

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  def serveStatic(): RequestHandler[ParamsDictionary] = js.native
  def serveStatic(options: Anon_Lasso): RequestHandler[ParamsDictionary] = js.native
}

