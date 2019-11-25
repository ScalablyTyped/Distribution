package typings.atJestCore.buildTestSchedulerMod

import typings.atJestReporters.buildTypesMod.Reporter
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.jestDashRunner.jestDashRunnerMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestScheduler extends js.Object {
  var _addCustomReporters: js.Any
  var _bailIfNeeded: js.Any
  var _context: js.Any
  var _dispatcher: js.Any
  /**
    * Get properties of a reporter in an object
    * to make dealing with them less painful.
    */
  var _getReporterProps: js.Any
  var _globalConfig: js.Any
  var _options: js.Any
  var _partitionTests: js.Any
  var _setupDefaultReporters: js.Any
  var _setupReporters: js.Any
  var _shouldAddDefaultReporters: js.Any
  def addReporter(reporter: Reporter): Unit
  def removeReporter(ReporterClass: js.Function): Unit
  def scheduleTests(tests: js.Array[Test], watcher: typings.atJestCore.buildTestWatcherMod.default): js.Promise[AggregatedResult]
}

object TestScheduler {
  @scala.inline
  def apply(
    _addCustomReporters: js.Any,
    _bailIfNeeded: js.Any,
    _context: js.Any,
    _dispatcher: js.Any,
    _getReporterProps: js.Any,
    _globalConfig: js.Any,
    _options: js.Any,
    _partitionTests: js.Any,
    _setupDefaultReporters: js.Any,
    _setupReporters: js.Any,
    _shouldAddDefaultReporters: js.Any,
    addReporter: Reporter => Unit,
    removeReporter: js.Function => Unit,
    scheduleTests: (js.Array[Test], typings.atJestCore.buildTestWatcherMod.default) => js.Promise[AggregatedResult]
  ): TestScheduler = {
    val __obj = js.Dynamic.literal(_addCustomReporters = _addCustomReporters.asInstanceOf[js.Any], _bailIfNeeded = _bailIfNeeded.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _dispatcher = _dispatcher.asInstanceOf[js.Any], _getReporterProps = _getReporterProps.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _partitionTests = _partitionTests.asInstanceOf[js.Any], _setupDefaultReporters = _setupDefaultReporters.asInstanceOf[js.Any], _setupReporters = _setupReporters.asInstanceOf[js.Any], _shouldAddDefaultReporters = _shouldAddDefaultReporters.asInstanceOf[js.Any], addReporter = js.Any.fromFunction1(addReporter), removeReporter = js.Any.fromFunction1(removeReporter), scheduleTests = js.Any.fromFunction2(scheduleTests))
  
    __obj.asInstanceOf[TestScheduler]
  }
}

