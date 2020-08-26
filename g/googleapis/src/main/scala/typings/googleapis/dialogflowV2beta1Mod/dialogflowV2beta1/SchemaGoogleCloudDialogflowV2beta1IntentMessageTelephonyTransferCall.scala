package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transfers the call in Telephony Gateway.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall extends js.Object {
  /**
    * Required. The phone number to transfer the call to in [E.164
    * format](https://en.wikipedia.org/wiki/E.164).  We currently only allow
    * transferring to US numbers (+1xxxyyyzzzz).
    */
  var phoneNumber: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall] (val x: Self) extends AnyVal {
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
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
  }
  
}

