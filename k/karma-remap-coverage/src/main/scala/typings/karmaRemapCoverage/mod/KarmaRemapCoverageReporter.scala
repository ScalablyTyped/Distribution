package typings.karmaRemapCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// remapped reporter types to key-value pairs
/* Inlined std.Partial<std.Record<karma-coverage.karma.ReporterType, string | null | undefined>> */
trait KarmaRemapCoverageReporter extends js.Object {
  var cobertura: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var `in-memory`: js.UndefOr[String] = js.undefined
  var json: js.UndefOr[String] = js.undefined
  var `json-summary`: js.UndefOr[String] = js.undefined
  var lcov: js.UndefOr[String] = js.undefined
  var lcovonly: js.UndefOr[String] = js.undefined
  var none: js.UndefOr[String] = js.undefined
  var teamcity: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `text-summary`: js.UndefOr[String] = js.undefined
}

object KarmaRemapCoverageReporter {
  @scala.inline
  def apply(
    cobertura: String = null,
    html: String = null,
    `in-memory`: String = null,
    json: String = null,
    `json-summary`: String = null,
    lcov: String = null,
    lcovonly: String = null,
    none: String = null,
    teamcity: String = null,
    text: String = null,
    `text-summary`: String = null
  ): KarmaRemapCoverageReporter = {
    val __obj = js.Dynamic.literal()
    if (cobertura != null) __obj.updateDynamic("cobertura")(cobertura.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (`in-memory` != null) __obj.updateDynamic("in-memory")(`in-memory`.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (`json-summary` != null) __obj.updateDynamic("json-summary")(`json-summary`.asInstanceOf[js.Any])
    if (lcov != null) __obj.updateDynamic("lcov")(lcov.asInstanceOf[js.Any])
    if (lcovonly != null) __obj.updateDynamic("lcovonly")(lcovonly.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    if (teamcity != null) __obj.updateDynamic("teamcity")(teamcity.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-summary` != null) __obj.updateDynamic("text-summary")(`text-summary`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaRemapCoverageReporter]
  }
}

