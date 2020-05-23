package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAlive extends js.Object {
  /** Set to true to force use of NOOP keepalive on servers also support IDLE. Default: false */
  var forceNoop: js.UndefOr[Boolean] = js.undefined
  /** This is the interval (in milliseconds) at which an IDLE command (for servers that support IDLE) is re-sent. Default: 300000 (5 mins) */
  var idleInterval: js.UndefOr[Double] = js.undefined
  /** This is the interval (in milliseconds) at which NOOPs are sent and the interval at which idleInterval is checked. Default: 10000 */
  var interval: js.UndefOr[Double] = js.undefined
}

object KeepAlive {
  @scala.inline
  def apply(
    forceNoop: js.UndefOr[Boolean] = js.undefined,
    idleInterval: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined
  ): KeepAlive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceNoop)) __obj.updateDynamic("forceNoop")(forceNoop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleInterval)) __obj.updateDynamic("idleInterval")(idleInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAlive]
  }
}

