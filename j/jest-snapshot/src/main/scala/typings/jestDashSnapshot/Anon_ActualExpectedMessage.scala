package typings.jestDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActualExpectedMessage extends js.Object {
  var actual: js.UndefOr[scala.Nothing] = js.undefined
  var expected: js.UndefOr[scala.Nothing] = js.undefined
  var name: js.UndefOr[scala.Nothing] = js.undefined
  var pass: Boolean
  var report: js.UndefOr[scala.Nothing] = js.undefined
  def message(): String
}

object Anon_ActualExpectedMessage {
  @scala.inline
  def apply(
    message: () => String,
    pass: Boolean,
    actual: js.UndefOr[scala.Nothing] = js.undefined,
    expected: js.UndefOr[scala.Nothing] = js.undefined,
    name: js.UndefOr[scala.Nothing] = js.undefined,
    report: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ActualExpectedMessage = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
    if (!js.isUndefined(actual)) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(report)) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActualExpectedMessage]
  }
}

