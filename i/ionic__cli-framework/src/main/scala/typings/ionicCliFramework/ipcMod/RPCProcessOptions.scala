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
  def apply(name: String = null, timeout: Int | Double = null): RPCProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCProcessOptions]
  }
}

