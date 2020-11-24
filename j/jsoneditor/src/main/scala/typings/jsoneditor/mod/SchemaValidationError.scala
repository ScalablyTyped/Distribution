package typings.jsoneditor.mod

import typings.ajv.mod.ErrorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaValidationError extends js.Object {
  
  var error: ErrorObject = js.native
  
  var node: Node = js.native
  
  var `type`: SchemaValidationErrorType = js.native
}
object SchemaValidationError {
  
  @scala.inline
  def apply(error: ErrorObject, node: Node, `type`: SchemaValidationErrorType): SchemaValidationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValidationError]
  }
  
  @scala.inline
  implicit class SchemaValidationErrorOps[Self <: SchemaValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: ErrorObject): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SchemaValidationErrorType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
