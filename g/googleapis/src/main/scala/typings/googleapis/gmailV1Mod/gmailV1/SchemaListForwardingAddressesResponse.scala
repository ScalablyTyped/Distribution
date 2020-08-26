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
  def apply(): SchemaListForwardingAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListForwardingAddressesResponse]
  }
  @scala.inline
  implicit class SchemaListForwardingAddressesResponseOps[Self <: SchemaListForwardingAddressesResponse] (val x: Self) extends AnyVal {
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
    def setForwardingAddressesVarargs(value: SchemaForwardingAddress*): Self = this.set("forwardingAddresses", js.Array(value :_*))
    @scala.inline
    def setForwardingAddresses(value: js.Array[SchemaForwardingAddress]): Self = this.set("forwardingAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingAddresses: Self = this.set("forwardingAddresses", js.undefined)
  }
  
}

