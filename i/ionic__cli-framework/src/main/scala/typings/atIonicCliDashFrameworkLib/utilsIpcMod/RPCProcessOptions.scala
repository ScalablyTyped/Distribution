package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCProcessOptions extends js.Object {
  val name: js.UndefOr[java.lang.String] = js.undefined
  val timeout: js.UndefOr[scala.Double] = js.undefined
}

object RPCProcessOptions {
  @scala.inline
  def apply(name: java.lang.String = null, timeout: scala.Int | scala.Double = null): RPCProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCProcessOptions]
  }
}

