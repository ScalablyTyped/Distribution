package typings.jestDashRunner.jestDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunner extends js.Object {
  var _context: js.Any
  var _createInBandTestRun: js.Any
  var _createParallelTestRun: js.Any
  var _globalConfig: js.Any
  def runTests(
    tests: js.Array[typings.jestDashRunner.buildTypesMod.Test],
    watcher: typings.jestDashRunner.buildTypesMod.TestWatcher,
    onStart: typings.jestDashRunner.buildTypesMod.OnTestStart,
    onResult: typings.jestDashRunner.buildTypesMod.OnTestSuccess,
    onFailure: typings.jestDashRunner.buildTypesMod.OnTestFailure,
    options: typings.jestDashRunner.buildTypesMod.TestRunnerOptions
  ): js.Promise[Unit]
}

object TestRunner {
  @scala.inline
  def apply(
    _context: js.Any,
    _createInBandTestRun: js.Any,
    _createParallelTestRun: js.Any,
    _globalConfig: js.Any,
    runTests: (js.Array[typings.jestDashRunner.buildTypesMod.Test], typings.jestDashRunner.buildTypesMod.TestWatcher, typings.jestDashRunner.buildTypesMod.OnTestStart, typings.jestDashRunner.buildTypesMod.OnTestSuccess, typings.jestDashRunner.buildTypesMod.OnTestFailure, typings.jestDashRunner.buildTypesMod.TestRunnerOptions) => js.Promise[Unit]
  ): TestRunner = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _createInBandTestRun = _createInBandTestRun.asInstanceOf[js.Any], _createParallelTestRun = _createParallelTestRun.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], runTests = js.Any.fromFunction6(runTests))
  
    __obj.asInstanceOf[TestRunner]
  }
}

