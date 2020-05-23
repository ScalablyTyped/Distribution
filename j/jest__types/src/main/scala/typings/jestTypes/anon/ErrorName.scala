package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorName extends Event {
  var error: Exception
  var name: test_fn_failure
  var test: TestEntry
}

object ErrorName {
  @scala.inline
  def apply(error: Exception, name: test_fn_failure, test: TestEntry): ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorName]
  }
}

