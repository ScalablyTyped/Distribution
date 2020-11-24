package typings.jwtExpress.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jwt-express", "init")
@js.native
object init extends js.Object {
  
  def apply(secret: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(secret: String, options: JWTExpressOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(secret: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(
    secret: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String],
    options: JWTExpressOptions
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
