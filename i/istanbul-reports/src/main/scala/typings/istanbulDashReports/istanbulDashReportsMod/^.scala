package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typings.istanbulDashReports.Anon_BlockName
import typings.istanbulDashReports.Anon_MaxCols
import typings.istanbulDashReports.istanbulDashReportsStrings.`json-summary`
import typings.istanbulDashReports.istanbulDashReportsStrings.`text-lcov`
import typings.istanbulDashReports.istanbulDashReportsStrings.`text-summary`
import typings.istanbulDashReports.istanbulDashReportsStrings.clover
import typings.istanbulDashReports.istanbulDashReportsStrings.cobertura
import typings.istanbulDashReports.istanbulDashReportsStrings.html
import typings.istanbulDashReports.istanbulDashReportsStrings.json
import typings.istanbulDashReports.istanbulDashReportsStrings.lcov
import typings.istanbulDashReports.istanbulDashReportsStrings.lcovonly
import typings.istanbulDashReports.istanbulDashReportsStrings.none
import typings.istanbulDashReports.istanbulDashReportsStrings.teamcity
import typings.istanbulDashReports.istanbulDashReportsStrings.text
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("create")
  def create_clover(name: clover): Visitor[Node] = js.native
  @JSName("create")
  def create_clover(name: clover, options: Partial[RootedOptions]): Visitor[Node] = js.native
  @JSName("create")
  def create_cobertura(name: cobertura): Visitor[Node] = js.native
  @JSName("create")
  def create_cobertura(name: cobertura, options: Partial[RootedOptions]): Visitor[Node] = js.native
  @JSName("create")
  def create_html(name: html): Visitor[Node] = js.native
  @JSName("create")
  def create_html(name: html, options: Partial[HtmlOptions]): Visitor[Node] = js.native
  @JSName("create")
  def create_json(name: json): Visitor[Node] = js.native
  @JSName("create")
  def create_json(name: json, options: Partial[Options]): Visitor[Node] = js.native
  @JSName("create")
  def create_jsonsummary(name: `json-summary`): Visitor[Node] = js.native
  @JSName("create")
  def create_jsonsummary(name: `json-summary`, options: Partial[Options]): Visitor[Node] = js.native
  @JSName("create")
  def create_lcov(name: lcov): Visitor[Node] = js.native
  @JSName("create")
  def create_lcov(name: lcov, options: Partial[scala.Nothing]): Visitor[Node] = js.native
  @JSName("create")
  def create_lcovonly(name: lcovonly): Visitor[Node] = js.native
  @JSName("create")
  def create_lcovonly(name: lcovonly, options: Partial[Options]): Visitor[Node] = js.native
  @JSName("create")
  def create_none(name: none): Visitor[Node] = js.native
  @JSName("create")
  def create_none(name: none, options: Partial[RootedOptions]): Visitor[Node] = js.native
  @JSName("create")
  def create_teamcity(name: teamcity): Visitor[Node] = js.native
  @JSName("create")
  def create_teamcity(name: teamcity, options: Partial[Options with Anon_BlockName]): Visitor[Node] = js.native
  @JSName("create")
  def create_text(name: text): Visitor[Node] = js.native
  @JSName("create")
  def create_text(name: text, options: Partial[Options with Anon_MaxCols]): Visitor[Node] = js.native
  @JSName("create")
  def create_textlcov(name: `text-lcov`): Visitor[Node] = js.native
  @JSName("create")
  def create_textlcov(name: `text-lcov`, options: Partial[Options]): Visitor[Node] = js.native
  @JSName("create")
  def create_textsummary(name: `text-summary`): Visitor[Node] = js.native
  @JSName("create")
  def create_textsummary(name: `text-summary`, options: Partial[Options]): Visitor[Node] = js.native
}

