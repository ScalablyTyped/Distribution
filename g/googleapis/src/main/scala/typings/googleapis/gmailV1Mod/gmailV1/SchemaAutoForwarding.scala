package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Auto-forwarding settings for an account.
  */
@js.native
trait SchemaAutoForwarding extends js.Object {
  /**
    * The state that a message should be left in after it has been forwarded.
    */
  var disposition: js.UndefOr[String] = js.native
  /**
    * Email address to which all incoming messages are forwarded. This email
    * address must be a verified member of the forwarding addresses.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether all incoming mail is automatically forwarded to another address.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAutoForwarding {
  @scala.inline
  def apply(): SchemaAutoForwarding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoForwarding]
  }
  @scala.inline
  implicit class SchemaAutoForwardingOps[Self <: SchemaAutoForwarding] (val x: Self) extends AnyVal {
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
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

