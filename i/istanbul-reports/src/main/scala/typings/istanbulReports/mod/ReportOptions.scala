package typings.istanbulReports.mod

import typings.istanbulReports.OptionsblockNamestring
import typings.istanbulReports.OptionsmaxColsnumber
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
  var teamcity: OptionsblockNamestring
  var text: OptionsmaxColsnumber
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
    teamcity: OptionsblockNamestring,
    text: OptionsmaxColsnumber,
    `text-lcov`: Options,
    `text-summary`: Options
  ): ReportOptions = {
    val __obj = js.Dynamic.literal(clover = clover.asInstanceOf[js.Any], cobertura = cobertura.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lcovonly = lcovonly.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamcity = teamcity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("json-summary")(`json-summary`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-lcov")(`text-lcov`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-summary")(`text-summary`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
}

