package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAlt extends js.Object {
  var it: SkipOnlyTest = js.native
  var test: SkipOnlyTest = js.native
}

object TestAlt {
  @scala.inline
  def apply(it: SkipOnlyTest, test: SkipOnlyTest): TestAlt = {
    val __obj = js.Dynamic.literal(it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAlt]
  }
  @scala.inline
  implicit class TestAltOps[Self <: TestAlt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIt(value: SkipOnlyTest): Self = this.set("it", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: SkipOnlyTest): Self = this.set("test", value.asInstanceOf[js.Any])
  }
  
}

