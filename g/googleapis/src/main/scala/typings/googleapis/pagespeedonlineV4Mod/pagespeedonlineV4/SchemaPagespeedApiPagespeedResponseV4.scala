package typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.anon.Cms
import typings.googleapis.anon.Initialurl
import typings.googleapis.anon.LocaleRuleResults
import typings.googleapis.anon.Major
import typings.googleapis.anon.Pass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiPagespeedResponseV4 extends js.Object {
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each
    * PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: js.UndefOr[LocaleRuleResults] = js.native
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * List of rules that were specified in the request, but which the server
    * did not know how to instantiate.
    */
  var invalidRules: js.UndefOr[js.Array[String]] = js.native
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[Initialurl] = js.native
  /**
    * Summary statistics for the page, such as number of JavaScript bytes,
    * number of HTML bytes, etc.
    */
  var pageStats: js.UndefOr[Cms] = js.native
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx
    * indicates an error.
    */
  var responseCode: js.UndefOr[Double] = js.native
  /**
    * A map with one entry for each rule group in these results.
    */
  var ruleGroups: js.UndefOr[StringDictionary[Pass]] = js.native
  /**
    * Base64-encoded screenshot of the page that was analyzed.
    */
  var screenshot: js.UndefOr[SchemaPagespeedApiImageV4] = js.native
  /**
    * Additional base64-encoded screenshots of the page, in various partial
    * render states.
    */
  var snapshots: js.UndefOr[js.Array[SchemaPagespeedApiImageV4]] = js.native
  /**
    * Title of the page, as displayed in the browser&#39;s title bar.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[Major] = js.native
}

object SchemaPagespeedApiPagespeedResponseV4 {
  @scala.inline
  def apply(
    captchaResult: String = null,
    formattedResults: LocaleRuleResults = null,
    id: String = null,
    invalidRules: js.Array[String] = null,
    kind: String = null,
    loadingExperience: Initialurl = null,
    pageStats: Cms = null,
    responseCode: js.UndefOr[Double] = js.undefined,
    ruleGroups: StringDictionary[Pass] = null,
    screenshot: SchemaPagespeedApiImageV4 = null,
    snapshots: js.Array[SchemaPagespeedApiImageV4] = null,
    title: String = null,
    version: Major = null
  ): SchemaPagespeedApiPagespeedResponseV4 = {
    val __obj = js.Dynamic.literal()
    if (captchaResult != null) __obj.updateDynamic("captchaResult")(captchaResult.asInstanceOf[js.Any])
    if (formattedResults != null) __obj.updateDynamic("formattedResults")(formattedResults.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidRules != null) __obj.updateDynamic("invalidRules")(invalidRules.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loadingExperience != null) __obj.updateDynamic("loadingExperience")(loadingExperience.asInstanceOf[js.Any])
    if (pageStats != null) __obj.updateDynamic("pageStats")(pageStats.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCode)) __obj.updateDynamic("responseCode")(responseCode.get.asInstanceOf[js.Any])
    if (ruleGroups != null) __obj.updateDynamic("ruleGroups")(ruleGroups.asInstanceOf[js.Any])
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV4]
  }
}

