package typings.iotaLibJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddresses extends js.Object {
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  var approvees: js.UndefOr[js.Array[String]] = js.undefined
  var bundles: js.UndefOr[js.Array[String]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAddresses {
  @scala.inline
  def apply(
    addresses: js.Array[String] = null,
    approvees: js.Array[String] = null,
    bundles: js.Array[String] = null,
    tags: js.Array[String] = null
  ): AnonAddresses = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (approvees != null) __obj.updateDynamic("approvees")(approvees.asInstanceOf[js.Any])
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddresses]
  }
}

