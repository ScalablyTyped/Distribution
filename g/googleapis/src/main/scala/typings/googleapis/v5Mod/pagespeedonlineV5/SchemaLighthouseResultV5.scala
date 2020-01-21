package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.AnonAccessibility
import typings.googleapis.AnonBenchmarkIndex
import typings.googleapis.AnonCodeMessage
import typings.googleapis.AnonDescriptionTitle
import typings.googleapis.AnonEmulatedFormFactor
import typings.googleapis.AnonRendererFormattedStrings
import typings.googleapis.AnonTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLighthouseResultV5 extends js.Object {
  /**
    * Map of audits in the LHR.
    */
  var audits: js.UndefOr[StringDictionary[SchemaLighthouseAuditResultV5]] = js.native
  /**
    * Map of categories in the LHR.
    */
  var categories: js.UndefOr[AnonAccessibility] = js.native
  /**
    * Map of category groups in the LHR.
    */
  var categoryGroups: js.UndefOr[StringDictionary[AnonDescriptionTitle]] = js.native
  /**
    * The configuration settings for this LHR.
    */
  var configSettings: js.UndefOr[AnonEmulatedFormFactor] = js.native
  /**
    * Environment settings that were used when making this LHR.
    */
  var environment: js.UndefOr[AnonBenchmarkIndex] = js.native
  /**
    * The time that this run was fetched.
    */
  var fetchTime: js.UndefOr[String] = js.native
  /**
    * The final resolved url that was audited.
    */
  var finalUrl: js.UndefOr[String] = js.native
  /**
    * The internationalization strings that are required to render the LHR.
    */
  var i18n: js.UndefOr[AnonRendererFormattedStrings] = js.native
  /**
    * The lighthouse version that was used to generate this LHR.
    */
  var lighthouseVersion: js.UndefOr[String] = js.native
  /**
    * The original requested url.
    */
  var requestedUrl: js.UndefOr[String] = js.native
  /**
    * List of all run warnings in the LHR. Will always output to at least `[]`.
    */
  var runWarnings: js.UndefOr[js.Array[_]] = js.native
  /**
    * A top-level error message that, if present, indicates a serious enough
    * problem that this Lighthouse result may need to be discarded.
    */
  var runtimeError: js.UndefOr[AnonCodeMessage] = js.native
  /**
    * Timing information for this LHR.
    */
  var timing: js.UndefOr[AnonTotal] = js.native
  /**
    * The user agent that was used to run this LHR.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object SchemaLighthouseResultV5 {
  @scala.inline
  def apply(
    audits: StringDictionary[SchemaLighthouseAuditResultV5] = null,
    categories: AnonAccessibility = null,
    categoryGroups: StringDictionary[AnonDescriptionTitle] = null,
    configSettings: AnonEmulatedFormFactor = null,
    environment: AnonBenchmarkIndex = null,
    fetchTime: String = null,
    finalUrl: String = null,
    i18n: AnonRendererFormattedStrings = null,
    lighthouseVersion: String = null,
    requestedUrl: String = null,
    runWarnings: js.Array[_] = null,
    runtimeError: AnonCodeMessage = null,
    timing: AnonTotal = null,
    userAgent: String = null
  ): SchemaLighthouseResultV5 = {
    val __obj = js.Dynamic.literal()
    if (audits != null) __obj.updateDynamic("audits")(audits.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (categoryGroups != null) __obj.updateDynamic("categoryGroups")(categoryGroups.asInstanceOf[js.Any])
    if (configSettings != null) __obj.updateDynamic("configSettings")(configSettings.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (fetchTime != null) __obj.updateDynamic("fetchTime")(fetchTime.asInstanceOf[js.Any])
    if (finalUrl != null) __obj.updateDynamic("finalUrl")(finalUrl.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (lighthouseVersion != null) __obj.updateDynamic("lighthouseVersion")(lighthouseVersion.asInstanceOf[js.Any])
    if (requestedUrl != null) __obj.updateDynamic("requestedUrl")(requestedUrl.asInstanceOf[js.Any])
    if (runWarnings != null) __obj.updateDynamic("runWarnings")(runWarnings.asInstanceOf[js.Any])
    if (runtimeError != null) __obj.updateDynamic("runtimeError")(runtimeError.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLighthouseResultV5]
  }
}

