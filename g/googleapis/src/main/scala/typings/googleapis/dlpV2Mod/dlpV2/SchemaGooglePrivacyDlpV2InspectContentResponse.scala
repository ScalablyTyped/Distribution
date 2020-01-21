package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of inspecting an item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectContentResponse extends js.Object {
  /**
    * The findings.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2InspectResult] = js.native
}

object SchemaGooglePrivacyDlpV2InspectContentResponse {
  @scala.inline
  def apply(result: SchemaGooglePrivacyDlpV2InspectResult = null): SchemaGooglePrivacyDlpV2InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectContentResponse]
  }
}

