package typings.jsoneditor.mod

import typings.ajv.mod.ErrorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaValidationError extends js.Object {
  var error: ErrorObject
  var node: Node
  var `type`: SchemaValidationErrorType
}

object SchemaValidationError {
  @scala.inline
  def apply(error: ErrorObject, node: Node, `type`: SchemaValidationErrorType): SchemaValidationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValidationError]
  }
}

