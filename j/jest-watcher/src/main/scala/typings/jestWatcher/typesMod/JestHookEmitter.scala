package typings.jestWatcher.typesMod

import typings.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHookEmitter extends js.Object {
  def onFileChange(fs: JestHookExposedFS): Unit
  def onTestRunComplete(results: AggregatedResult): Unit
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] | Boolean
}

object JestHookEmitter {
  @scala.inline
  def apply(
    onFileChange: JestHookExposedFS => Unit,
    onTestRunComplete: AggregatedResult => Unit,
    shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean] | Boolean
  ): JestHookEmitter = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
    __obj.asInstanceOf[JestHookEmitter]
  }
}

