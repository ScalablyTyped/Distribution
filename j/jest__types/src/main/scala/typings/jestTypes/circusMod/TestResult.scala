package typings.jestTypes.circusMod

import typings.jestTypes.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var duration: js.UndefOr[Double | Null] = js.undefined
  var errors: js.Array[FormattedError]
  var invocations: Double
  var location: js.UndefOr[Column | Null] = js.undefined
  var status: TestStatus
  var testPath: js.Array[TestName | BlockName]
}

object TestResult {
  @scala.inline
  def apply(
    errors: js.Array[FormattedError],
    invocations: Double,
    status: TestStatus,
    testPath: js.Array[TestName | BlockName],
    duration: js.UndefOr[Null | Double] = js.undefined,
    location: js.UndefOr[Null | Column] = js.undefined
  ): TestResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

