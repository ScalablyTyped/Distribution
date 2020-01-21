package typings.loopback.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loopback", "rewriteUserLiteral")
@js.native
object rewriteUserLiteral extends js.Object {
  /**
    * Rewrite the url to replace current user literal with the logged in user id
    */
  def apply(): RequestHandler[ParamsDictionary] = js.native
}

