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
  def apply(phoneNumber: String = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall]
  }
}

