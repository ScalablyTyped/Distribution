package typings.iopipeIopipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibraryConfig extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var networkTimeout: js.UndefOr[Double] = js.native
  var timeoutWindow: js.UndefOr[Double] = js.native
  var token: js.UndefOr[String] = js.native
}

object LibraryConfig {
  @scala.inline
  def apply(): LibraryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryConfig]
  }
  @scala.inline
  implicit class LibraryConfigOps[Self <: LibraryConfig] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setNetworkTimeout(value: Double): Self = this.set("networkTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkTimeout: Self = this.set("networkTimeout", js.undefined)
    @scala.inline
    def setTimeoutWindow(value: Double): Self = this.set("timeoutWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutWindow: Self = this.set("timeoutWindow", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

