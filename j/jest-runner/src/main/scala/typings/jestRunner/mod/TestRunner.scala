package typings.jestRunner.mod

import typings.emittery.mod.UnsubscribeFn
import typings.jestRunner.jestRunnerStrings.`test-case-result`
import typings.jestRunner.jestRunnerStrings.`test-file-failure`
import typings.jestRunner.jestRunnerStrings.`test-file-start`
import typings.jestRunner.jestRunnerStrings.`test-file-success`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunner extends js.Object {
  val __PRIVATE_UNSTABLE_API_supportsEventEmitters__ : Boolean = js.native
  val _context: js.Any = js.native
  var _createInBandTestRun: js.Any = js.native
  var _createParallelTestRun: js.Any = js.native
  val _globalConfig: js.Any = js.native
  val eventEmitter: js.Any = js.native
  val isSerial: js.UndefOr[Boolean] = js.native
  def on[Name_1 /* <: scala.Nothing */](eventName: Name_1, listener: js.Function0[Unit]): UnsubscribeFn = js.native
  def on[Name /* <: `test-file-start` | `test-file-success` | `test-file-failure` | `test-case-result` */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: jest-runner.jest-runner/build/types.TestEvents[Name] */ /* eventData */ js.Any, 
      Unit
    ]
  ): UnsubscribeFn = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onFailure: js.UndefOr[scala.Nothing],
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onFailure: typings.jestRunner.typesMod.OnTestFailure,
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: typings.jestRunner.typesMod.OnTestSuccess,
    onFailure: js.UndefOr[scala.Nothing],
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: js.UndefOr[scala.Nothing],
    onResult: typings.jestRunner.typesMod.OnTestSuccess,
    onFailure: typings.jestRunner.typesMod.OnTestFailure,
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: typings.jestRunner.typesMod.OnTestStart,
    onResult: js.UndefOr[scala.Nothing],
    onFailure: js.UndefOr[scala.Nothing],
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: typings.jestRunner.typesMod.OnTestStart,
    onResult: js.UndefOr[scala.Nothing],
    onFailure: typings.jestRunner.typesMod.OnTestFailure,
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: typings.jestRunner.typesMod.OnTestStart,
    onResult: typings.jestRunner.typesMod.OnTestSuccess,
    onFailure: js.UndefOr[scala.Nothing],
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
  def runTests(
    tests: js.Array[typings.jestRunner.typesMod.Test],
    watcher: typings.jestRunner.typesMod.TestWatcher,
    onStart: typings.jestRunner.typesMod.OnTestStart,
    onResult: typings.jestRunner.typesMod.OnTestSuccess,
    onFailure: typings.jestRunner.typesMod.OnTestFailure,
    options: typings.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}

