package typings.jestWatcher.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHookSubscriber extends js.Object {
  def onFileChange(fn: FileChange): Unit = js.native
  def onTestRunComplete(fn: TestRunComplete): Unit = js.native
  def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit = js.native
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
  @scala.inline
  implicit class JestHookSubscriberOps[Self <: JestHookSubscriber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnFileChange(value: FileChange => Unit): Self = this.set("onFileChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTestRunComplete(value: TestRunComplete => Unit): Self = this.set("onTestRunComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldRunTestSuite(value: ShouldRunTestSuite => Unit): Self = this.set("shouldRunTestSuite", js.Any.fromFunction1(value))
  }
  
}

