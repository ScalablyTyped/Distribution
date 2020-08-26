package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEntry extends js.Object {
  var asyncError: Exception = js.native
  var duration: js.UndefOr[Double | Null] = js.native
  var errors: TestError = js.native
  var fn: js.UndefOr[TestFn] = js.native
  var invocations: Double = js.native
  var mode: TestMode = js.native
  var name: TestName = js.native
  var parent: DescribeBlock = js.native
  var startedAt: js.UndefOr[Double | Null] = js.native
  var status: js.UndefOr[TestStatus | Null] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object TestEntry {
  @scala.inline
  def apply(
    asyncError: Exception,
    errors: TestError,
    invocations: Double,
    mode: TestMode,
    name: TestName,
    parent: DescribeBlock
  ): TestEntry = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEntry]
  }
  @scala.inline
  implicit class TestEntryOps[Self <: TestEntry] (val x: Self) extends AnyVal {
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
    def setAsyncError(value: Exception): Self = this.set("asyncError", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: (js.Tuple2[js.UndefOr[Exception], Exception])*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: TestError): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvocations(value: Double): Self = this.set("invocations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: TestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: TestName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: DescribeBlock): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    @scala.inline
    def setFn(
      value: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit]
    ): Self = this.set("fn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setStartedAt(value: Double): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
    @scala.inline
    def setStartedAtNull: Self = this.set("startedAt", null)
    @scala.inline
    def setStatus(value: TestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

