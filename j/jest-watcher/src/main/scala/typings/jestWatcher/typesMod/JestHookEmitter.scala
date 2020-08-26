package typings.jestWatcher.typesMod

import typings.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHookEmitter extends js.Object {
  def onFileChange(fs: JestHookExposedFS): Unit = js.native
  def onTestRunComplete(results: AggregatedResult): Unit = js.native
  def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] | Boolean = js.native
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
  @scala.inline
  implicit class JestHookEmitterOps[Self <: JestHookEmitter] (val x: Self) extends AnyVal {
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
    def setOnFileChange(value: JestHookExposedFS => Unit): Self = this.set("onFileChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTestRunComplete(value: AggregatedResult => Unit): Self = this.set("onTestRunComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = this.set("shouldRunTestSuite", js.Any.fromFunction1(value))
  }
  
}

