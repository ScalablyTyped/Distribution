package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rule that specifies conditions when findings of infoTypes specified in
  * `InspectionRuleSet` are removed from results.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ExclusionRule extends js.Object {
  /**
    * Dictionary which defines the rule.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.native
  /**
    * Set of infoTypes for which findings would affect this rule.
    */
  var excludeInfoTypes: js.UndefOr[SchemaGooglePrivacyDlpV2ExcludeInfoTypes] = js.native
  /**
    * How the rule is applied, see MatchingType documentation for details.
    */
  var matchingType: js.UndefOr[String] = js.native
  /**
    * Regular expression which defines the rule.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
}

object SchemaGooglePrivacyDlpV2ExclusionRule {
  @scala.inline
  def apply(
    dictionary: SchemaGooglePrivacyDlpV2Dictionary = null,
    excludeInfoTypes: SchemaGooglePrivacyDlpV2ExcludeInfoTypes = null,
    matchingType: String = null,
    regex: SchemaGooglePrivacyDlpV2Regex = null
  ): SchemaGooglePrivacyDlpV2ExclusionRule = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (excludeInfoTypes != null) __obj.updateDynamic("excludeInfoTypes")(excludeInfoTypes.asInstanceOf[js.Any])
    if (matchingType != null) __obj.updateDynamic("matchingType")(matchingType.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ExclusionRule]
  }
}

