package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScriptBoolean extends js.Object {
  var script: js.UndefOr[Boolean] = js.undefined
}

object AnonScriptBoolean {
  @scala.inline
  def apply(script: js.UndefOr[Boolean] = js.undefined): AnonScriptBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScriptBoolean]
  }
}

