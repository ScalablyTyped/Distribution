package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTest extends Event {
  var name: test_fn_success
  var test: TestEntry
}

object AnonNameTest {
  @scala.inline
  def apply(name: test_fn_success, test: TestEntry): AnonNameTest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameTest]
  }
}

