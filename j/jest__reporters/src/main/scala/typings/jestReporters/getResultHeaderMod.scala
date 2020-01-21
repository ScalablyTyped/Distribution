package typings.jestReporters

import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/get_result_header", JSImport.Namespace)
@js.native
object getResultHeaderMod extends js.Object {
  def default(result: TestResult, globalConfig: GlobalConfig): String = js.native
  def default(result: TestResult, globalConfig: GlobalConfig, projectConfig: ProjectConfig): String = js.native
}

