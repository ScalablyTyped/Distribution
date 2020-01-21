package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTestTestdone extends Event {
  var name: test_done
  var test: TestEntry
}

object AnonNameTestTestdone {
  @scala.inline
  def apply(name: test_done, test: TestEntry): AnonNameTestTestdone = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTestTestdone]
  }
}

