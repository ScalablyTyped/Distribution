package typings.jestDashRunner.jestDashRunnerMod

import typings.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner", JSImport.Namespace)
@js.native
class ^ protected () extends TestRunner {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, context: typings.jestDashRunner.buildTypesMod.TestRunnerContext) = this()
  /* CompleteClass */
  override var _context: js.Any = js.native
  /* CompleteClass */
  override var _createInBandTestRun: js.Any = js.native
  /* CompleteClass */
  override var _createParallelTestRun: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override def runTests(
    tests: js.Array[typings.jestDashRunner.buildTypesMod.Test],
    watcher: typings.jestDashRunner.buildTypesMod.TestWatcher,
    onStart: typings.jestDashRunner.buildTypesMod.OnTestStart,
    onResult: typings.jestDashRunner.buildTypesMod.OnTestSuccess,
    onFailure: typings.jestDashRunner.buildTypesMod.OnTestFailure,
    options: typings.jestDashRunner.buildTypesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}

