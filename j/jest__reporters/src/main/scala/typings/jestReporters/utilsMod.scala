package typings.jestReporters

import typings.jestReporters.typesMod.SummaryOptions
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def formatTestPath(config: GlobalConfig, testPath: String): String = js.native
  def formatTestPath(config: ProjectConfig, testPath: String): String = js.native
  def getSummary(aggregatedResults: AggregatedResult): String = js.native
  def getSummary(aggregatedResults: AggregatedResult, options: SummaryOptions): String = js.native
  def printDisplayName(config: ProjectConfig): String = js.native
  def relativePath(config: GlobalConfig, testPath: String): AnonBasename = js.native
  def relativePath(config: ProjectConfig, testPath: String): AnonBasename = js.native
  def trimAndFormatPath(pad: Double, config: GlobalConfig, testPath: String, columns: Double): String = js.native
  def trimAndFormatPath(pad: Double, config: ProjectConfig, testPath: String, columns: Double): String = js.native
  def wrapAnsiString(string: String, terminalWidth: Double): String = js.native
}

