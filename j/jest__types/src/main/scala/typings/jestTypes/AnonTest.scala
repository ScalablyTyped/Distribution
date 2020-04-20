package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTest extends Event {
  var name: test_fn_start
  var test: TestEntry
}

object AnonTest {
  @scala.inline
  def apply(name: test_fn_start, test: TestEntry): AnonTest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTest]
  }
}

