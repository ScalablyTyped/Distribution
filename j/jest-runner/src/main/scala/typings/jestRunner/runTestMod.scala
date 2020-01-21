package typings.jestRunner

import typings.jestResolve.mod.^
import typings.jestRunner.typesMod.TestRunnerContext
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object runTestMod extends js.Object {
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ^): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ^,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
}

