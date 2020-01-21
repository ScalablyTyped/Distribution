package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration description of the scanning process. When used with
  * redactContent only info_types and min_likelihood are currently used.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectConfig extends js.Object {
  /**
    * List of options defining data content to scan. If empty, text, images,
    * and other content will be included.
    */
  var contentOptions: js.UndefOr[js.Array[String]] = js.native
  /**
    * CustomInfoTypes provided by the user. See
    * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn
    * more.
    */
  var customInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CustomInfoType]] = js.native
  /**
    * When true, excludes type information of the findings.
    */
  var excludeInfoTypes: js.UndefOr[Boolean] = js.native
  /**
    * When true, a contextual quote from the data that triggered a finding is
    * included in the response; see Finding.quote.
    */
  var includeQuote: js.UndefOr[Boolean] = js.native
  /**
    * Restricts what info_types to look for. The values must correspond to
    * InfoType values returned by ListInfoTypes or listed at
    * https://cloud.google.com/dlp/docs/infotypes-reference.  When no InfoTypes
    * or CustomInfoTypes are specified in a request, the system may
    * automatically choose what detectors to run. By default this may be all
    * types, but may change over time as detectors are updated.  The special
    * InfoType name &quot;ALL_BASIC&quot; can be used to trigger all detectors,
    * but may change over time as new InfoTypes are added. If you need precise
    * control and predictability as to what detectors are run you should
    * specify specific InfoTypes listed in the reference.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  var limits: js.UndefOr[SchemaGooglePrivacyDlpV2FindingLimits] = js.native
  /**
    * Only returns findings equal or above this threshold. The default is
    * POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
    */
  var minLikelihood: js.UndefOr[String] = js.native
  /**
    * Set of rules to apply to the findings for this InspectConfig. Exclusion
    * rules, contained in the set are executed in the end, other rules are
    * executed in the order they are specified for each info type.
    */
  var ruleSet: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectionRuleSet]] = js.native
}

object SchemaGooglePrivacyDlpV2InspectConfig {
  @scala.inline
  def apply(
    contentOptions: js.Array[String] = null,
    customInfoTypes: js.Array[SchemaGooglePrivacyDlpV2CustomInfoType] = null,
    excludeInfoTypes: js.UndefOr[Boolean] = js.undefined,
    includeQuote: js.UndefOr[Boolean] = js.undefined,
    infoTypes: js.Array[SchemaGooglePrivacyDlpV2InfoType] = null,
    limits: SchemaGooglePrivacyDlpV2FindingLimits = null,
    minLikelihood: String = null,
    ruleSet: js.Array[SchemaGooglePrivacyDlpV2InspectionRuleSet] = null
  ): SchemaGooglePrivacyDlpV2InspectConfig = {
    val __obj = js.Dynamic.literal()
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (customInfoTypes != null) __obj.updateDynamic("customInfoTypes")(customInfoTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeInfoTypes)) __obj.updateDynamic("excludeInfoTypes")(excludeInfoTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(includeQuote)) __obj.updateDynamic("includeQuote")(includeQuote.asInstanceOf[js.Any])
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (minLikelihood != null) __obj.updateDynamic("minLikelihood")(minLikelihood.asInstanceOf[js.Any])
    if (ruleSet != null) __obj.updateDynamic("ruleSet")(ruleSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectConfig]
  }
}

