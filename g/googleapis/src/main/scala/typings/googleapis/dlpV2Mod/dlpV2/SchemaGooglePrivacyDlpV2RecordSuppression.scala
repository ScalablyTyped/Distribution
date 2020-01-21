package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to suppress records whose suppression conditions evaluate to
  * true.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordSuppression extends js.Object {
  /**
    * A condition that when it evaluates to true will result in the record
    * being evaluated to be suppressed from the transformed content.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.native
}

object SchemaGooglePrivacyDlpV2RecordSuppression {
  @scala.inline
  def apply(condition: SchemaGooglePrivacyDlpV2RecordCondition = null): SchemaGooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordSuppression]
  }
}

