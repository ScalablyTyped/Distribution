package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameTestTestEntry extends Event {
  var name: test_start
  var test: TestEntry
}

object NameTestTestEntry {
  @scala.inline
  def apply(name: test_start, test: TestEntry): NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTestTestEntry]
  }
}

