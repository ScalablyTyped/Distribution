package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEntry extends js.Object {
  var asyncError: Exception
  var duration: js.UndefOr[Double | Null] = js.undefined
  var errors: TestError
  var fn: js.UndefOr[TestFn] = js.undefined
  var invocations: Double
  var mode: TestMode
  var name: TestName
  var parent: DescribeBlock
  var startedAt: js.UndefOr[Double | Null] = js.undefined
  var status: js.UndefOr[TestStatus | Null] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object TestEntry {
  @scala.inline
  def apply(
    asyncError: Exception,
    errors: TestError,
    invocations: Double,
    mode: TestMode,
    name: TestName,
    parent: DescribeBlock,
    duration: js.UndefOr[Null | Double] = js.undefined,
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[js.Promise[js.Any] | Unit] = null,
    startedAt: js.UndefOr[Null | Double] = js.undefined,
    status: js.UndefOr[Null | TestStatus] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): TestEntry = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction1(fn))
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEntry]
  }
}

