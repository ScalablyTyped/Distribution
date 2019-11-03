package typings.lessDashMiddleware

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("less-middleware", JSImport.Namespace)
@js.native
object lessDashMiddlewareMod extends js.Object {
  /**
    * Middleware created to allow processing of Less files for Connect JS framework
    * and by extension the Express JS framework
    */
  def apply(source: String): RequestHandler[ParamsDictionary] = js.native
  def apply(source: String, options: Anon_CacheFile): RequestHandler[ParamsDictionary] = js.native
}

