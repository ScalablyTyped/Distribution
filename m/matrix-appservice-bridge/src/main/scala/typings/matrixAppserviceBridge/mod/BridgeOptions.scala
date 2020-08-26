package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeOptions extends js.Object {
  var controller: Controller = js.native
  var domain: String = js.native
  var homeserverUrl: String = js.native
  var registration: AppServiceRegistration | String = js.native
  var suppressEcho: js.UndefOr[Boolean] = js.native
}

object BridgeOptions {
  @scala.inline
  def apply(
    controller: Controller,
    domain: String,
    homeserverUrl: String,
    registration: AppServiceRegistration | String
  ): BridgeOptions = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeOptions]
  }
  @scala.inline
  implicit class BridgeOptionsOps[Self <: BridgeOptions] (val x: Self) extends AnyVal {
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
    def setController(value: Controller): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomeserverUrl(value: String): Self = this.set("homeserverUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistration(value: AppServiceRegistration | String): Self = this.set("registration", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppressEcho(value: Boolean): Self = this.set("suppressEcho", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressEcho: Self = this.set("suppressEcho", js.undefined)
  }
  
}

