package typings.keystonejsKeystone.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystonePrepareResult extends js.Object {
  var middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]
}

object KeystonePrepareResult {
  @scala.inline
  def apply(middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): KeystonePrepareResult = {
    val __obj = js.Dynamic.literal(middlewares = middlewares.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystonePrepareResult]
  }
}

