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

