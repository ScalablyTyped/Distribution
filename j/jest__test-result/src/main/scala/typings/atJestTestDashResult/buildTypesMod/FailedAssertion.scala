package typings.atJestTestDashResult.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedAssertion extends js.Object {
  var actual: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var expected: js.UndefOr[js.Any] = js.undefined
  var isNot: js.UndefOr[Boolean] = js.undefined
  var matcherName: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var pass: js.UndefOr[Boolean] = js.undefined
  var passed: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object FailedAssertion {
  @scala.inline
  def apply(
    actual: js.Any = null,
    error: js.Any = null,
    expected: js.Any = null,
    isNot: js.UndefOr[Boolean] = js.undefined,
    matcherName: String = null,
    message: String = null,
    pass: js.UndefOr[Boolean] = js.undefined,
    passed: js.UndefOr[Boolean] = js.undefined,
    stack: String = null
  ): FailedAssertion = {
    val __obj = js.Dynamic.literal()
    if (actual != null) __obj.updateDynamic("actual")(actual)
    if (error != null) __obj.updateDynamic("error")(error)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (!js.isUndefined(isNot)) __obj.updateDynamic("isNot")(isNot)
    if (matcherName != null) __obj.updateDynamic("matcherName")(matcherName)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(pass)) __obj.updateDynamic("pass")(pass)
    if (!js.isUndefined(passed)) __obj.updateDynamic("passed")(passed)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FailedAssertion]
  }
}

