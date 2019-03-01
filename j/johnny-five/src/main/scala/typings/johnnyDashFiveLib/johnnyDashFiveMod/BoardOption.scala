package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardOption extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var io: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var repl: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object BoardOption {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    id: scala.Double | java.lang.String = null,
    io: js.Any = null,
    port: java.lang.String | js.Any = null,
    repl: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): BoardOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (io != null) __obj.updateDynamic("io")(io)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(repl)) __obj.updateDynamic("repl")(repl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardOption]
  }
}

