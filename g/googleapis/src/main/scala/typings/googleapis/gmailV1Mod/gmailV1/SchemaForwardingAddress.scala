package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a forwarding address.
  */
@js.native
trait SchemaForwardingAddress extends js.Object {
  /**
    * An email address to which messages can be forwarded.
    */
  var forwardingEmail: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address has been verified and is usable for
    * forwarding. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}

object SchemaForwardingAddress {
  @scala.inline
  def apply(forwardingEmail: String = null, verificationStatus: String = null): SchemaForwardingAddress = {
    val __obj = js.Dynamic.literal()
    if (forwardingEmail != null) __obj.updateDynamic("forwardingEmail")(forwardingEmail.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaForwardingAddress]
  }
}

