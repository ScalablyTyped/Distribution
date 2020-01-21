package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTestTeststart extends Event {
  var name: test_start
  var test: TestEntry
}

object AnonNameTestTeststart {
  @scala.inline
  def apply(name: test_start, test: TestEntry): AnonNameTestTeststart = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTestTeststart]
  }
}

