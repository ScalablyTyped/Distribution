package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAlt extends js.Object {
  var it: SkipOnlyTest
  var test: SkipOnlyTest
}

object TestAlt {
  @scala.inline
  def apply(it: SkipOnlyTest, test: SkipOnlyTest): TestAlt = {
    val __obj = js.Dynamic.literal(it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAlt]
  }
}

