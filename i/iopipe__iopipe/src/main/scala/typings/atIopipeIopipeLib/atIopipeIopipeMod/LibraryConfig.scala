package typings
package atIopipeIopipeLib.atIopipeIopipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryConfig extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var networkTimeout: js.UndefOr[scala.Double] = js.undefined
  var timeoutWindow: js.UndefOr[scala.Double] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object LibraryConfig {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    networkTimeout: scala.Int | scala.Double = null,
    timeoutWindow: scala.Int | scala.Double = null,
    token: java.lang.String = null
  ): LibraryConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (networkTimeout != null) __obj.updateDynamic("networkTimeout")(networkTimeout.asInstanceOf[js.Any])
    if (timeoutWindow != null) __obj.updateDynamic("timeoutWindow")(timeoutWindow.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[LibraryConfig]
  }
}

