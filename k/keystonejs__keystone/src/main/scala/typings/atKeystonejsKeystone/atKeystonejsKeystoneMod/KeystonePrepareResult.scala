package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystonePrepareResult extends js.Object {
  var middlewares: js.Array[RequestHandler[ParamsDictionary]]
}

object KeystonePrepareResult {
  @scala.inline
  def apply(middlewares: js.Array[RequestHandler[ParamsDictionary]]): KeystonePrepareResult = {
    val __obj = js.Dynamic.literal(middlewares = middlewares.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeystonePrepareResult]
  }
}

