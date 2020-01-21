package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateStoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest extends js.Object {
  /**
    * Updated configuration for the storedInfoType. If not provided, a new
    * version of the storedInfoType will be created with the existing
    * configuration.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest {
  @scala.inline
  def apply(config: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig = null, updateMask: String = null): SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  }
}

