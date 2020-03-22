package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeOptions extends js.Object {
  var controller: Controller
  var domain: String
  var homeserverUrl: String
  var registration: AppServiceRegistration
  var suppressEcho: js.UndefOr[Boolean] = js.undefined
}

object BridgeOptions {
  @scala.inline
  def apply(
    controller: Controller,
    domain: String,
    homeserverUrl: String,
    registration: AppServiceRegistration,
    suppressEcho: js.UndefOr[Boolean] = js.undefined
  ): BridgeOptions = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], homeserverUrl = homeserverUrl.asInstanceOf[js.Any], registration = registration.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressEcho)) __obj.updateDynamic("suppressEcho")(suppressEcho.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeOptions]
  }
}

