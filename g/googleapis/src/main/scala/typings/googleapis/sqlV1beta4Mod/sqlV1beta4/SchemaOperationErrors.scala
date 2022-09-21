package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationErrors extends StObject {
  
  /**
    * The list of errors encountered while processing this operation.
    */
  var errors: js.UndefOr[js.Array[SchemaOperationError]] = js.undefined
  
  /**
    * This is always *sql#operationErrors*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperationErrors {
  
  inline def apply(): SchemaOperationErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationErrors]
  }
  
  extension [Self <: SchemaOperationErrors](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaOperationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaOperationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
