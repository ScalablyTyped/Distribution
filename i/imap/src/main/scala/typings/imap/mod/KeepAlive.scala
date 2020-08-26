package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepAlive extends js.Object {
  /** Set to true to force use of NOOP keepalive on servers also support IDLE. Default: false */
  var forceNoop: js.UndefOr[Boolean] = js.native
  /** This is the interval (in milliseconds) at which an IDLE command (for servers that support IDLE) is re-sent. Default: 300000 (5 mins) */
  var idleInterval: js.UndefOr[Double] = js.native
  /** This is the interval (in milliseconds) at which NOOPs are sent and the interval at which idleInterval is checked. Default: 10000 */
  var interval: js.UndefOr[Double] = js.native
}

object KeepAlive {
  @scala.inline
  def apply(): KeepAlive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepAlive]
  }
  @scala.inline
  implicit class KeepAliveOps[Self <: KeepAlive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForceNoop(value: Boolean): Self = this.set("forceNoop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceNoop: Self = this.set("forceNoop", js.undefined)
    @scala.inline
    def setIdleInterval(value: Double): Self = this.set("idleInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleInterval: Self = this.set("idleInterval", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
  
}

