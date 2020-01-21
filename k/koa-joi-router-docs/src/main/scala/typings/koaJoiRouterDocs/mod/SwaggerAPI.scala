package typings.koaJoiRouterDocs.mod

import typings.koaJoiRouter.mod.Router
import typings.koaJoiRouterDocs.mod.koaJoiRouterDocs.RouterOptions
import typings.koaJoiRouterDocs.mod.koaJoiRouterDocs.SpecConfig
import typings.koaJoiRouterDocs.mod.koaJoiRouterDocs.SpecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-joi-router-docs", "SwaggerAPI")
@js.native
class SwaggerAPI () extends js.Object {
  def addJoiRouter(router: Router): js.Any = js.native
  def addJoiRouter(router: Router, options: RouterOptions): js.Any = js.native
  def generateSpec(config: SpecConfig): js.Object = js.native
  def generateSpec(config: SpecConfig, options: SpecOptions): js.Object = js.native
}

