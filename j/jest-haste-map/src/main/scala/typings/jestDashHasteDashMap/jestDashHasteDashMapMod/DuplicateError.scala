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
    val __obj = js.Dynamic.literal(message = message, mockPath1 = mockPath1, mockPath2 = mockPath2, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[DuplicateError]
  }
}

