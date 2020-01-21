package typings.jsData.mod

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
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaValidationError]
  }
}

