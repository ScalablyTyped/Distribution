package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.test_fn_failure
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.Exception
import typings.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends Event {
  var error: Exception
  var name: test_fn_failure
  var test: TestEntry
}

object Anon_Error {
  @scala.inline
  def apply(error: Exception, name: test_fn_failure, test: TestEntry): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Error]
  }
}

