package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Max findings configuration per infoType, per content item or long running
  * DlpJob.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeLimit extends js.Object {
  /**
    * Type of information the findings limit applies to. Only one limit per
    * info_type should be provided. If InfoTypeLimit does not have an
    * info_type, the DLP API applies the limit against all info_types that are
    * found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * Max findings limit for the given infoType.
    */
  var maxFindings: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeLimit {
  @scala.inline
  def apply(infoType: SchemaGooglePrivacyDlpV2InfoType = null, maxFindings: Int | Double = null): SchemaGooglePrivacyDlpV2InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (maxFindings != null) __obj.updateDynamic("maxFindings")(maxFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeLimit]
  }
}

