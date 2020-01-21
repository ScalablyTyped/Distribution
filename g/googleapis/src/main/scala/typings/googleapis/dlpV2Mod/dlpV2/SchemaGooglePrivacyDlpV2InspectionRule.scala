package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single inspection rule to be applied to infoTypes, specified in
  * `InspectionRuleSet`.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectionRule extends js.Object {
  /**
    * Exclusion rule.
    */
  var exclusionRule: js.UndefOr[SchemaGooglePrivacyDlpV2ExclusionRule] = js.native
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.native
}

object SchemaGooglePrivacyDlpV2InspectionRule {
  @scala.inline
  def apply(
    exclusionRule: SchemaGooglePrivacyDlpV2ExclusionRule = null,
    hotwordRule: SchemaGooglePrivacyDlpV2HotwordRule = null
  ): SchemaGooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    if (exclusionRule != null) __obj.updateDynamic("exclusionRule")(exclusionRule.asInstanceOf[js.Any])
    if (hotwordRule != null) __obj.updateDynamic("hotwordRule")(hotwordRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRule]
  }
}

