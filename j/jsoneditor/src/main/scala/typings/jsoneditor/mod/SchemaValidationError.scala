package typings.jsoneditor.mod

import typings.ajv.distTypesMod.ErrorObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidationError extends StObject {
  
  var error: ErrorObject[String, Record[String, Any], Any]
  
  var node: Node
  
  var `type`: SchemaValidationErrorType
}
object SchemaValidationError {
  
  inline def apply(
    error: ErrorObject[String, Record[String, Any], Any],
    node: Node,
    `type`: SchemaValidationErrorType
  ): SchemaValidationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValidationError]
  }
  
  extension [Self <: SchemaValidationError](x: Self) {
    
    inline def setError(value: ErrorObject[String, Record[String, Any], Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setType(value: SchemaValidationErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
