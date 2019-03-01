package typings
package istanbulDashReportsLib.istanbulDashReportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var clover: RootedOptions
  var cobertura: RootedOptions
  var html: HtmlOptions
  var json: Options
  var `json-summary`: Options
  var lcov: scala.Nothing
  var lcovonly: Options
  var none: RootedOptions
  var teamcity: Options with istanbulDashReportsLib.Anon_BlockName
  var text: Options with istanbulDashReportsLib.Anon_MaxCols
  var `text-lcov`: Options
  var `text-summary`: Options
}

object ReportOptions {
  @scala.inline
  def apply(
    clover: RootedOptions,
    cobertura: RootedOptions,
    html: HtmlOptions,
    json: Options,
    `json-summary`: Options,
    lcov: scala.Nothing,
    lcovonly: Options,
    none: RootedOptions,
    teamcity: Options with istanbulDashReportsLib.Anon_BlockName,
    text: Options with istanbulDashReportsLib.Anon_MaxCols,
    `text-lcov`: Options,
    `text-summary`: Options
  ): ReportOptions = {
    val __obj = js.Dynamic.literal(`json-summary` = `json-summary`, `text-lcov` = `text-lcov`, `text-summary` = `text-summary`)
    __obj.updateDynamic("clover")(clover)
    __obj.updateDynamic("cobertura")(cobertura)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("lcov")(lcov)
    __obj.updateDynamic("lcovonly")(lcovonly)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("teamcity")(teamcity)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ReportOptions]
  }
}

