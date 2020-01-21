package typings.jestRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunner extends js.Object {
  var _context: js.Any
  var _createInBandTestRun: js.Any
  var _createParallelTestRun: js.Any
  var _globalConfig: js.Any
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: typings.jestRunner.typesMod.OnTestStart,
    onResult: typings.jestRunner.typesMod.OnTestSuccess,
    onFailure: typings.jestRunner.typesMod.OnTestFailure,
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit]
}

object TestRunner {
  @scala.inline
  def apply(
    _context: js.Any,
    _createInBandTestRun: js.Any,
    _createParallelTestRun: js.Any,
    _globalConfig: js.Any,
    runTests: (js.Array[typings.jestRunner.typesMod.Test], typings.jestRunner.typesMod.TestWatcher, typings.jestRunner.typesMod.OnTestStart, typings.jestRunner.typesMod.OnTestSuccess, typings.jestRunner.typesMod.OnTestFailure, typings.jestRunner.typesMod.TestRunnerOptions) => js.Promise[Unit]
  ): TestRunner = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _createInBandTestRun = _createInBandTestRun.asInstanceOf[js.Any], _createParallelTestRun = _createParallelTestRun.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], runTests = js.Any.fromFunction6(runTests))
  
    __obj.asInstanceOf[TestRunner]
  }
}

