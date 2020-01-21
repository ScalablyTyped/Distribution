package typings.jwtExpress.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", "init")
@js.native
object init extends js.Object {
  def apply(secret: String): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: String, options: JWTExpressOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Function1[/* req */ Request_[ParamsDictionary], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Function1[/* req */ Request_[ParamsDictionary], String], options: JWTExpressOptions): RequestHandler[ParamsDictionary] = js.native
}

