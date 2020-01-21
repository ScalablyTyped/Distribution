package typings.loopback.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "rest")
@js.native
object rest extends js.Object {
  /**
    * Expose models over REST
    * For example:
    * ```js
    * app.use(loopback.rest());
    * ```
    * For more information, see [Exposing models over a REST API](docs.strongloop.com/display/DOC/Exposing+models+over+a+REST+API).
    * @header loopback.rest(
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
}

