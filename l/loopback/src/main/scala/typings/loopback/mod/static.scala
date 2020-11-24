package typings.loopback.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("loopback", "static")
@js.native
object static extends js.Object {
  
  /**
    * Serve static assets of a LoopBack application
    * @param {string} root The root directory from which the static assets are to
    * be served.
    * @param {any} options Refer to
    *   [express documentation](expressjs.com/4x/api.html#express.static)
    *   for the full list of available options.
    * @header loopback.static(root, [options])
    */
  def apply(root: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(root: String, options: js.Any): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
