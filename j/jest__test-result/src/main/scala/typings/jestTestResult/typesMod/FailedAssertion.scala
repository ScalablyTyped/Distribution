package typings.jestTestResult.typesMod

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
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (!js.isUndefined(isNot)) __obj.updateDynamic("isNot")(isNot.asInstanceOf[js.Any])
    if (matcherName != null) __obj.updateDynamic("matcherName")(matcherName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(pass)) __obj.updateDynamic("pass")(pass.asInstanceOf[js.Any])
    if (!js.isUndefined(passed)) __obj.updateDynamic("passed")(passed.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAssertion]
  }
}

