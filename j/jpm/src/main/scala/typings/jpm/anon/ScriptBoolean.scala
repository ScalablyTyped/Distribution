package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptBoolean extends js.Object {
  var script: js.UndefOr[Boolean] = js.undefined
}

object ScriptBoolean {
  @scala.inline
  def apply(script: js.UndefOr[Boolean] = js.undefined): ScriptBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBoolean]
  }
}

