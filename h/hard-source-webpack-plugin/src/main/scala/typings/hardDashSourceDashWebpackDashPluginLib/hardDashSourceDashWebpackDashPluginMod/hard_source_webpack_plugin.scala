package typings
package hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hard_source_webpack_plugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): scala.Unit
}

object hard_source_webpack_plugin {
  @scala.inline
  def apply(apply: js.Function1[/* repeated */ js.Any, scala.Unit]): hard_source_webpack_plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    __obj.asInstanceOf[hard_source_webpack_plugin]
  }
}

