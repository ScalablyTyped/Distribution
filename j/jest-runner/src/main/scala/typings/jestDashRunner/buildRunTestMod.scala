package typings.jestDashRunner

import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashResolve.jestDashResolveMod.^
import typings.jestDashRunner.buildTypesMod.TestRunnerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object buildRunTestMod extends js.Object {
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ^): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ^,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
}

