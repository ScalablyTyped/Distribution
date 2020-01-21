package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTestTestskip extends Event {
  var name: test_skip
  var test: TestEntry
}

object AnonNameTestTestskip {
  @scala.inline
  def apply(name: test_skip, test: TestEntry): AnonNameTestTestskip = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTestTestskip]
  }
}

