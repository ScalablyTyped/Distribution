package typings.jestWatcher.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHookSubscriber extends js.Object {
  def onFileChange(fn: FileChange): Unit
  def onTestRunComplete(fn: TestRunComplete): Unit
  def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit
}

object JestHookSubscriber {
  @scala.inline
  def apply(
    onFileChange: FileChange => Unit,
    onTestRunComplete: TestRunComplete => Unit,
    shouldRunTestSuite: ShouldRunTestSuite => Unit
  ): JestHookSubscriber = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
  
    __obj.asInstanceOf[JestHookSubscriber]
  }
}

