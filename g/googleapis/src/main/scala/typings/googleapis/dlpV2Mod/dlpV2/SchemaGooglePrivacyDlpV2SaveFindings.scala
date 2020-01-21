package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If set, the detailed findings will be persisted to the specified
  * OutputStorageConfig. Only a single instance of this action can be
  * specified. Compatible with: Inspect, Risk
  */
@js.native
trait SchemaGooglePrivacyDlpV2SaveFindings extends js.Object {
  var outputConfig: js.UndefOr[SchemaGooglePrivacyDlpV2OutputStorageConfig] = js.native
}

object SchemaGooglePrivacyDlpV2SaveFindings {
  @scala.inline
  def apply(outputConfig: SchemaGooglePrivacyDlpV2OutputStorageConfig = null): SchemaGooglePrivacyDlpV2SaveFindings = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SaveFindings]
  }
}

