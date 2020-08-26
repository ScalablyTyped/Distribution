package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameTest extends Event {
  var name: test_fn_success = js.native
  var test: TestEntry = js.native
}

object NameTest {
  @scala.inline
  def apply(name: test_fn_success, test: TestEntry): NameTest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTest]
  }
  @scala.inline
  implicit class NameTestOps[Self <: NameTest] (val x: Self) extends AnyVal {
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
    def setName(value: test_fn_success): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: TestEntry): Self = this.set("test", value.asInstanceOf[js.Any])
  }
  
}

