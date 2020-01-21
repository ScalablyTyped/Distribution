package typings.iotaLibJs

import typings.iotaLibJs.mod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddress extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
}

object AnonAddress {
  @scala.inline
  def apply(address: String = null, inputs: js.Array[String] = null, security: Security = null): AnonAddress = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

