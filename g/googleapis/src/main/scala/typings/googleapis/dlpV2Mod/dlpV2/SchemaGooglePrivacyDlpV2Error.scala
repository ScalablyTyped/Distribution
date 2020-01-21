package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details information about an error encountered during job execution or the
  * results of an unsuccessful activation of the JobTrigger. Output only field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Error extends js.Object {
  var details: js.UndefOr[SchemaGoogleRpcStatus] = js.native
  /**
    * The times the error occurred.
    */
  var timestamps: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2Error {
  @scala.inline
  def apply(details: SchemaGoogleRpcStatus = null, timestamps: js.Array[String] = null): SchemaGooglePrivacyDlpV2Error = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Error]
  }
}

