package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addresses extends js.Object {
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  var approvees: js.UndefOr[js.Array[String]] = js.undefined
  var bundles: js.UndefOr[js.Array[String]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Addresses {
  @scala.inline
  def apply(
    addresses: js.Array[String] = null,
    approvees: js.Array[String] = null,
    bundles: js.Array[String] = null,
    tags: js.Array[String] = null
  ): Addresses = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (approvees != null) __obj.updateDynamic("approvees")(approvees.asInstanceOf[js.Any])
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresses]
  }
}

