package typings.googleapis.v5Mod.pagespeedonlineV5

import typings.googleapis.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiPagespeedResponseV5 extends js.Object {
  /**
    * The UTC timestamp of this analysis.
    */
  var analysisUTCTimestamp: js.UndefOr[String] = js.native
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Lighthouse response for the audit url as an object.
    */
  var lighthouseResult: js.UndefOr[SchemaLighthouseResultV5] = js.native
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
  /**
    * Metrics of the aggregated page loading experience of the origin
    */
  var originLoadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[Major] = js.native
}

object SchemaPagespeedApiPagespeedResponseV5 {
  @scala.inline
  def apply(
    analysisUTCTimestamp: String = null,
    captchaResult: String = null,
    id: String = null,
    kind: String = null,
    lighthouseResult: SchemaLighthouseResultV5 = null,
    loadingExperience: SchemaPagespeedApiLoadingExperienceV5 = null,
    originLoadingExperience: SchemaPagespeedApiLoadingExperienceV5 = null,
    version: Major = null
  ): SchemaPagespeedApiPagespeedResponseV5 = {
    val __obj = js.Dynamic.literal()
    if (analysisUTCTimestamp != null) __obj.updateDynamic("analysisUTCTimestamp")(analysisUTCTimestamp.asInstanceOf[js.Any])
    if (captchaResult != null) __obj.updateDynamic("captchaResult")(captchaResult.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lighthouseResult != null) __obj.updateDynamic("lighthouseResult")(lighthouseResult.asInstanceOf[js.Any])
    if (loadingExperience != null) __obj.updateDynamic("loadingExperience")(loadingExperience.asInstanceOf[js.Any])
    if (originLoadingExperience != null) __obj.updateDynamic("originLoadingExperience")(originLoadingExperience.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV5]
  }
}

