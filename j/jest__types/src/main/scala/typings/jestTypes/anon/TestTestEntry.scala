package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_retry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestTestEntry extends Event {
  var name: test_retry
  var test: TestEntry
}

object TestTestEntry {
  @scala.inline
  def apply(name: test_retry, test: TestEntry): TestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTestEntry]
  }
}

