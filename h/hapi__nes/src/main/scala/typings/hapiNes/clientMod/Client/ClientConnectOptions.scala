package typings.hapiNes.clientMod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConnectOptions extends js.Object {
  var auth: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
  var retries: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ClientConnectOptions {
  @scala.inline
  def apply(): ClientConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConnectOptions]
  }
  @scala.inline
  implicit class ClientConnectOptionsOps[Self <: ClientConnectOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: js.Any): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDelay: Self = this.set("maxDelay", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

