package typings.atIopipeIopipe.atIopipeIopipeMod

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
    networkTimeout: Int | Double = null,
    timeoutWindow: Int | Double = null,
    token: String = null
  ): LibraryConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (networkTimeout != null) __obj.updateDynamic("networkTimeout")(networkTimeout.asInstanceOf[js.Any])
    if (timeoutWindow != null) __obj.updateDynamic("timeoutWindow")(timeoutWindow.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[LibraryConfig]
  }
}

