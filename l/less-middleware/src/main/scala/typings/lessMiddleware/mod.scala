package typings.lessMiddleware

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("less-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Middleware created to allow processing of Less files for Connect JS framework
    * and by extension the Express JS framework
    */
  def apply(source: String): RequestHandler[ParamsDictionary] = js.native
  def apply(source: String, options: AnonCacheFile): RequestHandler[ParamsDictionary] = js.native
}

