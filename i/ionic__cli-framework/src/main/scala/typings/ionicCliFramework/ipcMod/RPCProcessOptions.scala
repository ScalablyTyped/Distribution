package typings.ionicCliFramework.ipcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCProcessOptions extends js.Object {
  val name: js.UndefOr[String] = js.undefined
  val timeout: js.UndefOr[Double] = js.undefined
}

object RPCProcessOptions {
  @scala.inline
  def apply(name: String = null, timeout: js.UndefOr[Double] = js.undefined): RPCProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCProcessOptions]
  }
}

