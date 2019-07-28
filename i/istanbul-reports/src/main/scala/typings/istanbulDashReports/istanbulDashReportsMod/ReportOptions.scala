package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashReports.Anon_BlockName
import typings.istanbulDashReports.Anon_MaxCols
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var clover: RootedOptions
  var cobertura: RootedOptions
  var html: HtmlOptions
  var json: Options
  var `json-summary`: Options
  var lcovonly: Options
  var none: RootedOptions
  var teamcity: Options with Anon_BlockName
  var text: Options with Anon_MaxCols
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
    lcovonly: Options,
    none: RootedOptions,
    teamcity: Options with Anon_BlockName,
    text: Options with Anon_MaxCols,
    `text-lcov`: Options,
    `text-summary`: Options
  ): ReportOptions = {
    val __obj = js.Dynamic.literal(clover = clover, cobertura = cobertura, html = html, json = json, lcovonly = lcovonly, none = none, teamcity = teamcity, text = text)
    __obj.updateDynamic("json-summary")(`json-summary`)
    __obj.updateDynamic("text-lcov")(`text-lcov`)
    __obj.updateDynamic("text-summary")(`text-summary`)
    __obj.asInstanceOf[ReportOptions]
  }
}

