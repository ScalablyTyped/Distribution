package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAlive extends js.Object {
  /** Set to true to force use of NOOP keepalive on servers also support IDLE. Default: false */
  var forceNoop: js.UndefOr[scala.Boolean] = js.undefined
  /** This is the interval (in milliseconds) at which an IDLE command (for servers that support IDLE) is re-sent. Default: 300000 (5 mins) */
  var idleInterval: js.UndefOr[scala.Double] = js.undefined
  /** This is the interval (in milliseconds) at which NOOPs are sent and the interval at which idleInterval is checked. Default: 10000 */
  var interval: js.UndefOr[scala.Double] = js.undefined
}

