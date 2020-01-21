package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSEventArgument extends js.Object {
  var authResponse: js.UndefOr[HelloJSAuthResponse] = js.undefined
  var network: String
}

object HelloJSEventArgument {
  @scala.inline
  def apply(network: String, authResponse: HelloJSAuthResponse = null): HelloJSEventArgument = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSEventArgument]
  }
}

