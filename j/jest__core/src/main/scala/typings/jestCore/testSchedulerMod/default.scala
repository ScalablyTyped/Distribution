package typings.jestCore.testSchedulerMod

import typings.jestReporters.typesMod.Reporter
import typings.jestRunner.mod.Test
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/TestScheduler", JSImport.Default)
@js.native
class default protected () extends TestScheduler {
  def this(globalConfig: GlobalConfig, options: TestSchedulerOptions, context: TestSchedulerContext) = this()
  /* CompleteClass */
  override var _addCustomReporters: js.Any = js.native
  /* CompleteClass */
  override var _bailIfNeeded: js.Any = js.native
  /* CompleteClass */
  override var _context: js.Any = js.native
  /* CompleteClass */
  override var _dispatcher: js.Any = js.native
  /**
    * Get properties of a reporter in an object
    * to make dealing with them less painful.
    */
  /* CompleteClass */
  override var _getReporterProps: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _partitionTests: js.Any = js.native
  /* CompleteClass */
  override var _setupDefaultReporters: js.Any = js.native
  /* CompleteClass */
  override var _setupReporters: js.Any = js.native
  /* CompleteClass */
  override var _shouldAddDefaultReporters: js.Any = js.native
  /* CompleteClass */
  override def addReporter(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def removeReporter(ReporterClass: js.Function): Unit = js.native
  /* CompleteClass */
  override def scheduleTests(tests: js.Array[Test], watcher: typings.jestCore.testWatcherMod.default): js.Promise[AggregatedResult] = js.native
}

