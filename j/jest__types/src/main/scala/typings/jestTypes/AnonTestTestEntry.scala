package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_retry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTestTestEntry extends Event {
  var name: test_retry
  var test: TestEntry
}

object AnonTestTestEntry {
  @scala.inline
  def apply(name: test_retry, test: TestEntry): AnonTestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTestTestEntry]
  }
}

