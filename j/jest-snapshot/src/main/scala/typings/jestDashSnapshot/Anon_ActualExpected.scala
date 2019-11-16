package typings.jestDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActualExpected extends js.Object {
  var actual: js.UndefOr[scala.Nothing] = js.undefined
  var expected: js.UndefOr[scala.Nothing] = js.undefined
  var name: String
  var pass: Boolean
  def message(): String
  def report(): String
}

object Anon_ActualExpected {
  @scala.inline
  def apply(
    message: () => String,
    name: String,
    pass: Boolean,
    report: () => String,
    actual: js.UndefOr[scala.Nothing] = js.undefined,
    expected: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ActualExpected = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), name = name, pass = pass, report = js.Any.fromFunction0(report))
    if (!js.isUndefined(actual)) __obj.updateDynamic("actual")(actual)
    if (!js.isUndefined(expected)) __obj.updateDynamic("expected")(expected)
    __obj.asInstanceOf[Anon_ActualExpected]
  }
}

