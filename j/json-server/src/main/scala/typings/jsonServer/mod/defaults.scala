package typings.jsonServer.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-server", "defaults")
@js.native
object defaults extends js.Object {
  def apply(): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def apply(options: MiddlewaresOptions): js.Array[RequestHandler[ParamsDictionary]] = js.native
}

