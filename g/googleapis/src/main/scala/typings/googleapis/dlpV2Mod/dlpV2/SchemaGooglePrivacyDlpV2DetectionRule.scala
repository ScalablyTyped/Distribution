package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule for modifying a CustomInfoType to alter behavior under certain
  * circumstances, depending on the specific details of the rule. Not supported
  * for the `surrogate_type` custom info type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DetectionRule extends js.Object {
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.native
}

object SchemaGooglePrivacyDlpV2DetectionRule {
  @scala.inline
  def apply(hotwordRule: SchemaGooglePrivacyDlpV2HotwordRule = null): SchemaGooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    if (hotwordRule != null) __obj.updateDynamic("hotwordRule")(hotwordRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DetectionRule]
  }
}

