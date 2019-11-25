package typings.jestDashHasteDashMap.jestDashHasteDashMapMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateError extends Error {
  var mockPath1: String
  var mockPath2: String
}

object DuplicateError {
  @scala.inline
  def apply(message: String, mockPath1: String, mockPath2: String, name: String, stack: String = null): DuplicateError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], mockPath1 = mockPath1.asInstanceOf[js.Any], mockPath2 = mockPath2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateError]
  }
}

