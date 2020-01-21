package typings.jestSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActualExpectedMessageName extends js.Object {
  var actual: String
  var expected: String | Null
  var name: String
  var pass: Boolean
  def message(): String
  def report(): String
}

object AnonActualExpectedMessageName {
  @scala.inline
  def apply(
    actual: String,
    message: () => String,
    name: String,
    pass: Boolean,
    report: () => String,
    expected: String = null
  ): AnonActualExpectedMessageName = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], report = js.Any.fromFunction0(report))
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActualExpectedMessageName]
  }
}

