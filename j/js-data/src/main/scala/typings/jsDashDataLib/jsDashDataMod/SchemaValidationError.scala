package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaValidationError extends js.Object {
  var actual: java.lang.String
  var expected: js.Any
  var path: java.lang.String
}

object SchemaValidationError {
  @scala.inline
  def apply(actual: java.lang.String, expected: js.Any, path: java.lang.String): SchemaValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actual")(actual)
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SchemaValidationError]
  }
}

