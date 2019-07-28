package typings.graphqlDashTools.distGenerateSchemaErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaError extends Error

object SchemaError {
  @scala.inline
  def apply(message: String, name: String, stack: String = null): SchemaError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SchemaError]
  }
}

