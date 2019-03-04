package typings
package graphqlDashToolsLib.distGenerateSchemaErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaError
  extends nodeLib.Error {
  var message: java.lang.String
}

object SchemaError {
  @scala.inline
  def apply(message: java.lang.String, stack: java.lang.String = null): SchemaError = {
    val __obj = js.Dynamic.literal(message = message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SchemaError]
  }
}

