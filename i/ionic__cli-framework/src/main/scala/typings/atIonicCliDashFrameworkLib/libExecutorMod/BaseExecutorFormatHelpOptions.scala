package typings
package atIonicCliDashFrameworkLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExecutorFormatHelpOptions extends js.Object {
  var format: js.UndefOr[
    atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.terminal | atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.json
  ] = js.undefined
}

object BaseExecutorFormatHelpOptions {
  @scala.inline
  def apply(
    format: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.terminal | atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.json = null
  ): BaseExecutorFormatHelpOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExecutorFormatHelpOptions]
  }
}

