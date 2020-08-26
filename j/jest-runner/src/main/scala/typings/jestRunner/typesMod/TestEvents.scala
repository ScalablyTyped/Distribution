package typings.jestRunner.typesMod

import typings.jestTestResult.typesMod.AssertionResult
import typings.jestTestResult.typesMod.SerializableError
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEvents extends js.Object {
  var `test-case-result`: js.Tuple2[Path, AssertionResult] = js.native
  var `test-file-failure`: js.Tuple2[Test, SerializableError] = js.native
  var `test-file-start`: js.Array[Test] = js.native
  var `test-file-success`: js.Tuple2[Test, TestResult] = js.native
}

object TestEvents {
  @scala.inline
  def apply(
    `test-case-result`: js.Tuple2[Path, AssertionResult],
    `test-file-failure`: js.Tuple2[Test, SerializableError],
    `test-file-start`: js.Array[Test],
    `test-file-success`: js.Tuple2[Test, TestResult]
  ): TestEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("test-case-result")(`test-case-result`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-file-failure")(`test-file-failure`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-file-start")(`test-file-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-file-success")(`test-file-success`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEvents]
  }
  @scala.inline
  implicit class TestEventsOps[Self <: TestEvents] (val x: Self) extends AnyVal {
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
    def `setTest-case-result`(value: js.Tuple2[Path, AssertionResult]): Self = this.set("test-case-result", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTest-file-failure`(value: js.Tuple2[Test, SerializableError]): Self = this.set("test-file-failure", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTest-file-startVarargs`(value: Test*): Self = this.set("test-file-start", js.Array(value :_*))
    @scala.inline
    def `setTest-file-start`(value: js.Array[Test]): Self = this.set("test-file-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTest-file-success`(value: js.Tuple2[Test, TestResult]): Self = this.set("test-file-success", value.asInstanceOf[js.Any])
  }
  
}

