package typings.jestRunner.mod

import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner", JSImport.Namespace)
@js.native
class ^ protected () extends TestRunner {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, context: typings.jestRunner.typesMod.TestRunnerContext) = this()
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
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: typings.jestRunner.typesMod.OnTestStart,
    onResult: typings.jestRunner.typesMod.OnTestSuccess,
    onFailure: typings.jestRunner.typesMod.OnTestFailure,
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}

