package typings.jwtDashExpress.jwtDashExpressMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", "init")
@js.native
object init extends js.Object {
  def apply(secret: String): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: String, options: JWTExpressOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Function1[/* req */ Request[ParamsDictionary], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Function1[/* req */ Request[ParamsDictionary], String], options: JWTExpressOptions): RequestHandler[ParamsDictionary] = js.native
}

