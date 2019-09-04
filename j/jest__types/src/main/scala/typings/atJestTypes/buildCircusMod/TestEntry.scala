package typings.atJestTypes.buildCircusMod

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
    duration: Int | Double = null,
    fn: TestFn = null,
    startedAt: Int | Double = null,
    status: TestStatus = null,
    timeout: Int | Double = null
  ): TestEntry = {
    val __obj = js.Dynamic.literal(asyncError = asyncError, errors = errors.asInstanceOf[js.Any], invocations = invocations, mode = mode.asInstanceOf[js.Any], name = name, parent = parent)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEntry]
  }
}

