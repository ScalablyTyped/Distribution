package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a delegate. Delegates can read, send, and delete messages, as
  * well as view and add contacts, for the delegator&#39;s account. See
  * &quot;Set up mail delegation&quot; for more information about delegates.
  */
@js.native
trait SchemaDelegate extends js.Object {
  /**
    * The email address of the delegate.
    */
  var delegateEmail: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address has been verified and can act as a
    * delegate for the account. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}

object SchemaDelegate {
  @scala.inline
  def apply(): SchemaDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelegate]
  }
  @scala.inline
  implicit class SchemaDelegateOps[Self <: SchemaDelegate] (val x: Self) extends AnyVal {
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
    def setDelegateEmail(value: String): Self = this.set("delegateEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegateEmail: Self = this.set("delegateEmail", js.undefined)
    @scala.inline
    def setVerificationStatus(value: String): Self = this.set("verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationStatus: Self = this.set("verificationStatus", js.undefined)
  }
  
}

