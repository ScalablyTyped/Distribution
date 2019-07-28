package typings.jsDashData.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaValidationError extends js.Object {
  var actual: String
  var expected: js.Any
  var path: String
}

object SchemaValidationError {
  @scala.inline
  def apply(actual: String, expected: js.Any, path: String): SchemaValidationError = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, path = path)
  
    __obj.asInstanceOf[SchemaValidationError]
  }
}

