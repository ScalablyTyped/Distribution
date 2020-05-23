package typings.iopipeIopipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraryConfig extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var networkTimeout: js.UndefOr[Double] = js.undefined
  var timeoutWindow: js.UndefOr[Double] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object LibraryConfig {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    networkTimeout: js.UndefOr[Double] = js.undefined,
    timeoutWindow: js.UndefOr[Double] = js.undefined,
    token: String = null
  ): LibraryConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(networkTimeout)) __obj.updateDynamic("networkTimeout")(networkTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutWindow)) __obj.updateDynamic("timeoutWindow")(timeoutWindow.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryConfig]
  }
}

