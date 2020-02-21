package typings.karmaCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.karmaCoverage.karmaCoverageStrings.html
  - typings.karmaCoverage.karmaCoverageStrings.lcov
  - typings.karmaCoverage.karmaCoverageStrings.lcovonly
  - typings.karmaCoverage.karmaCoverageStrings.text
  - typings.karmaCoverage.karmaCoverageStrings.`text-summary`
  - typings.karmaCoverage.karmaCoverageStrings.cobertura
  - typings.karmaCoverage.karmaCoverageStrings.teamcity
  - typings.karmaCoverage.karmaCoverageStrings.json
  - typings.karmaCoverage.karmaCoverageStrings.`json-summary`
  - typings.karmaCoverage.karmaCoverageStrings.`in-memory`
  - typings.karmaCoverage.karmaCoverageStrings.none
*/
trait ReporterType extends js.Object

object ReporterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cobertura: typings.karmaCoverage.karmaCoverageStrings.cobertura = this.cast("cobertura")
  @scala.inline
  def html: typings.karmaCoverage.karmaCoverageStrings.html = this.cast("html")
  @scala.inline
  def `in-memory`: typings.karmaCoverage.karmaCoverageStrings.`in-memory` = this.cast("in-memory")
  @scala.inline
  def json: typings.karmaCoverage.karmaCoverageStrings.json = this.cast("json")
  @scala.inline
  def `json-summary`: typings.karmaCoverage.karmaCoverageStrings.`json-summary` = this.cast("json-summary")
  @scala.inline
  def lcov: typings.karmaCoverage.karmaCoverageStrings.lcov = this.cast("lcov")
  @scala.inline
  def lcovonly: typings.karmaCoverage.karmaCoverageStrings.lcovonly = this.cast("lcovonly")
  @scala.inline
  def none: typings.karmaCoverage.karmaCoverageStrings.none = this.cast("none")
  @scala.inline
  def teamcity: typings.karmaCoverage.karmaCoverageStrings.teamcity = this.cast("teamcity")
  @scala.inline
  def text: typings.karmaCoverage.karmaCoverageStrings.text = this.cast("text")
  @scala.inline
  def `text-summary`: typings.karmaCoverage.karmaCoverageStrings.`text-summary` = this.cast("text-summary")
}

