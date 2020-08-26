package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_retry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestTestEntry extends Event {
  var name: test_retry = js.native
  var test: TestEntry = js.native
}

object TestTestEntry {
  @scala.inline
  def apply(name: test_retry, test: TestEntry): TestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTestEntry]
  }
  @scala.inline
  implicit class TestTestEntryOps[Self <: TestTestEntry] (val x: Self) extends AnyVal {
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
    def setName(value: test_retry): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: TestEntry): Self = this.set("test", value.asInstanceOf[js.Any])
  }
  
}

