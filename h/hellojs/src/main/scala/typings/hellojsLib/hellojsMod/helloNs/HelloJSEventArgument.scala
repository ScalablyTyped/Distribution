package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSEventArgument extends js.Object {
  var authResponse: js.UndefOr[HelloJSAuthResponse] = js.undefined
  var network: java.lang.String
}

object HelloJSEventArgument {
  @scala.inline
  def apply(network: java.lang.String, authResponse: HelloJSAuthResponse = null): HelloJSEventArgument = {
    val __obj = js.Dynamic.literal(network = network)
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse)
    __obj.asInstanceOf[HelloJSEventArgument]
  }
}

