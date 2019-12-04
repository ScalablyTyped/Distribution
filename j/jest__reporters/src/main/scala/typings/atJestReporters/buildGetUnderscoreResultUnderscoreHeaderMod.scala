package typings.atJestReporters

import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/get_result_header", JSImport.Namespace)
@js.native
object buildGetUnderscoreResultUnderscoreHeaderMod extends js.Object {
  def default(result: TestResult, globalConfig: GlobalConfig): String = js.native
  def default(result: TestResult, globalConfig: GlobalConfig, projectConfig: ProjectConfig): String = js.native
}

