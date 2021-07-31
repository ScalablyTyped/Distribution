package typings.jsoneditor.mod

import typings.ajv.mod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidationError extends StObject {
  
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
  
  @scala.inline
  implicit class SchemaValidationErrorMutableBuilder[Self <: SchemaValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorObject): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SchemaValidationErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
