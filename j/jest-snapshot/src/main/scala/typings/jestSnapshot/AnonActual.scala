package typings.jestSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActual extends js.Object {
  var actual: String
  var count: Double
  var expected: String | Null
  var key: String
  var pass: Boolean
}

object AnonActual {
  @scala.inline
  def apply(actual: String, count: Double, key: String, pass: Boolean, expected: String = null): AnonActual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    if (expected != null) __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActual]
  }
}

