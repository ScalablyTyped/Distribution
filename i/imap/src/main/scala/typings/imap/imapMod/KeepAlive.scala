package typings.imap.imapMod

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
    idleInterval: Int | Double = null,
    interval: Int | Double = null
  ): KeepAlive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceNoop)) __obj.updateDynamic("forceNoop")(forceNoop)
    if (idleInterval != null) __obj.updateDynamic("idleInterval")(idleInterval.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAlive]
  }
}

