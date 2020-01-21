package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rule that adjusts the likelihood of findings within a certain proximity
  * of hotwords.
  */
@js.native
trait SchemaGooglePrivacyDlpV2HotwordRule extends js.Object {
  /**
    * Regular expression pattern defining what qualifies as a hotword.
    */
  var hotwordRegex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
  /**
    * Likelihood adjustment to apply to all matching findings.
    */
  var likelihoodAdjustment: js.UndefOr[SchemaGooglePrivacyDlpV2LikelihoodAdjustment] = js.native
  /**
    * Proximity of the finding within which the entire hotword must reside. The
    * total length of the window cannot exceed 1000 characters. Note that the
    * finding itself will be included in the window, so that hotwords may be
    * used to match substrings of the finding itself. For example, the
    * certainty of a phone number regex &quot;\(\d{3}\) \d{3}-\d{4}&quot; could
    * be adjusted upwards if the area code is known to be the local area code
    * of a company office using the hotword regex &quot;\(xxx\)&quot;, where
    * &quot;xxx&quot; is the area code in question.
    */
  var proximity: js.UndefOr[SchemaGooglePrivacyDlpV2Proximity] = js.native
}

object SchemaGooglePrivacyDlpV2HotwordRule {
  @scala.inline
  def apply(
    hotwordRegex: SchemaGooglePrivacyDlpV2Regex = null,
    likelihoodAdjustment: SchemaGooglePrivacyDlpV2LikelihoodAdjustment = null,
    proximity: SchemaGooglePrivacyDlpV2Proximity = null
  ): SchemaGooglePrivacyDlpV2HotwordRule = {
    val __obj = js.Dynamic.literal()
    if (hotwordRegex != null) __obj.updateDynamic("hotwordRegex")(hotwordRegex.asInstanceOf[js.Any])
    if (likelihoodAdjustment != null) __obj.updateDynamic("likelihoodAdjustment")(likelihoodAdjustment.asInstanceOf[js.Any])
    if (proximity != null) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HotwordRule]
  }
}

