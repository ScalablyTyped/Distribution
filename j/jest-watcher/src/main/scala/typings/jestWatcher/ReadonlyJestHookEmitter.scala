package typings.jestWatcher

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestWatcher.typesMod.JestHookExposedFS
import typings.jestWatcher.typesMod.TestSuiteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookEmitter> */
trait ReadonlyJestHookEmitter extends js.Object {
  def onFileChange(fs: JestHookExposedFS): Unit
  def onTestRunComplete(results: AggregatedResult): Unit
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean]
}

object ReadonlyJestHookEmitter {
  @scala.inline
  def apply(
    onFileChange: JestHookExposedFS => Unit,
    onTestRunComplete: AggregatedResult => Unit,
    shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean]
  ): ReadonlyJestHookEmitter = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
  
    __obj.asInstanceOf[ReadonlyJestHookEmitter]
  }
}

