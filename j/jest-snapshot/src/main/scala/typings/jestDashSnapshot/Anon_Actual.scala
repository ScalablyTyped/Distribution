package typings.jestDashSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends js.Object {
  var actual: String
  var count: Double
  var expected: String | Null
  var key: String
  var pass: Boolean
}

object Anon_Actual {
  @scala.inline
  def apply(actual: String, count: Double, key: String, pass: Boolean, expected: String = null): Anon_Actual = {
    val __obj = js.Dynamic.literal(actual = actual, count = count, key = key, pass = pass)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    __obj.asInstanceOf[Anon_Actual]
  }
}

