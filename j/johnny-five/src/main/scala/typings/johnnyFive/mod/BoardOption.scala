package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardOption extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var io: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[String | js.Any] = js.undefined
  var repl: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object BoardOption {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    id: Double | String = null,
    io: js.Any = null,
    port: String | js.Any = null,
    repl: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): BoardOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (io != null) __obj.updateDynamic("io")(io.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(repl)) __obj.updateDynamic("repl")(repl.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardOption]
  }
}

