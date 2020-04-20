package typings.jestWatcher

import typings.jestWatcher.typesMod.FileChange
import typings.jestWatcher.typesMod.ShouldRunTestSuite
import typings.jestWatcher.typesMod.TestRunComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookSubscriber> */
trait ReadonlyJestHookSubscribe extends js.Object {
  def onFileChange(fn: FileChange): Unit
  def onTestRunComplete(fn: TestRunComplete): Unit
  def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit
}

object ReadonlyJestHookSubscribe {
  @scala.inline
  def apply(
    onFileChange: FileChange => Unit,
    onTestRunComplete: TestRunComplete => Unit,
    shouldRunTestSuite: ShouldRunTestSuite => Unit
  ): ReadonlyJestHookSubscribe = {
    val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
    __obj.asInstanceOf[ReadonlyJestHookSubscribe]
  }
}

