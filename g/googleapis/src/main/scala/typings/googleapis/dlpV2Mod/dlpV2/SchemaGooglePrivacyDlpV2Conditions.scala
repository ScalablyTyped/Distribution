package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of conditions.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Conditions extends js.Object {
  var conditions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Condition]] = js.native
}

object SchemaGooglePrivacyDlpV2Conditions {
  @scala.inline
  def apply(conditions: js.Array[SchemaGooglePrivacyDlpV2Condition] = null): SchemaGooglePrivacyDlpV2Conditions = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Conditions]
  }
}

