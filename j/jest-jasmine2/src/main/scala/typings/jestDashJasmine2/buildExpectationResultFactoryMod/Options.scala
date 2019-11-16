package typings.jestDashJasmine2.buildExpectationResultFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var actual: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var expected: js.UndefOr[js.Any] = js.undefined
  var matcherName: String
  var message: js.UndefOr[String | Null] = js.undefined
  var passed: Boolean
}

object Options {
  @scala.inline
  def apply(
    matcherName: String,
    passed: Boolean,
    actual: js.Any = null,
    error: js.Any = null,
    expected: js.Any = null,
    message: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(matcherName = matcherName, passed = passed)
    if (actual != null) __obj.updateDynamic("actual")(actual)
    if (error != null) __obj.updateDynamic("error")(error)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Options]
  }
}

