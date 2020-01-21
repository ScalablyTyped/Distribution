package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListForwardingAddresses method.
  */
@js.native
trait SchemaListForwardingAddressesResponse extends js.Object {
  /**
    * List of addresses that may be used for forwarding.
    */
  var forwardingAddresses: js.UndefOr[js.Array[SchemaForwardingAddress]] = js.native
}

object SchemaListForwardingAddressesResponse {
  @scala.inline
  def apply(forwardingAddresses: js.Array[SchemaForwardingAddress] = null): SchemaListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    if (forwardingAddresses != null) __obj.updateDynamic("forwardingAddresses")(forwardingAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListForwardingAddressesResponse]
  }
}

