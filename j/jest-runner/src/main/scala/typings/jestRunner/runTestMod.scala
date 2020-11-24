package typings.jestRunner

import typings.jestResolve.mod.ResolverType
import typings.jestRunner.jestRunnerStrings.`test-case-result`
import typings.jestRunner.jestRunnerStrings.`test-file-failure`
import typings.jestRunner.jestRunnerStrings.`test-file-start`
import typings.jestRunner.jestRunnerStrings.`test-file-success`
import typings.jestRunner.typesMod.TestFileEvent
import typings.jestRunner.typesMod.TestRunnerContext
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-runner/build/runTest", JSImport.Namespace)
@js.native
object runTestMod extends js.Object {
  
  def default(path: Path, globalConfig: GlobalConfig, config: ProjectConfig, resolver: ResolverType): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ResolverType,
    context: js.UndefOr[scala.Nothing],
    sendMessageToJest: TestFileEvent[
      /* keyof jest-runner.jest-runner/build/types.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result`
    ]
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ResolverType,
    context: TestRunnerContext
  ): js.Promise[TestResult] = js.native
  def default(
    path: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    resolver: ResolverType,
    context: TestRunnerContext,
    sendMessageToJest: TestFileEvent[
      /* keyof jest-runner.jest-runner/build/types.TestEvents */ `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result`
    ]
  ): js.Promise[TestResult] = js.native
}
