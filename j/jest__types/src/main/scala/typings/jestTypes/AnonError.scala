package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends Event {
  var error: Exception
  var name: test_fn_failure
  var test: TestEntry
}

object AnonError {
  @scala.inline
  def apply(error: Exception, name: test_fn_failure, test: TestEntry): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

