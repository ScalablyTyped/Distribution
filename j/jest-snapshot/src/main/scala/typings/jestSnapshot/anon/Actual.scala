package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actual extends js.Object {
  var actual: String
  var count: Double
  var expected: String | Null
  var key: String
  var pass: Boolean
}

object Actual {
  @scala.inline
  def apply(actual: String, count: Double, key: String, pass: Boolean, expected: String = null): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
}

