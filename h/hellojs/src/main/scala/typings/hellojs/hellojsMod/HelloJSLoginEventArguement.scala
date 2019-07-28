package typings.hellojs.hellojsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSLoginEventArguement extends js.Object {
  var authResponse: js.UndefOr[HelloJSAuthResponse] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var network: String
}

object HelloJSLoginEventArguement {
  @scala.inline
  def apply(network: String, authResponse: HelloJSAuthResponse = null, error: Error = null): HelloJSLoginEventArguement = {
    val __obj = js.Dynamic.literal(network = network)
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[HelloJSLoginEventArguement]
  }
}

