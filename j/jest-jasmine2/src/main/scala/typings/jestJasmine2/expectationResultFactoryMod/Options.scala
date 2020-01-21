package typings.jestJasmine2.expectationResultFactoryMod

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
    val __obj = js.Dynamic.literal(matcherName = matcherName.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

