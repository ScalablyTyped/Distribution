package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance operation error.
  */
trait SchemaOperationError extends StObject {
  
  /**
    * Identifies the specific error that occurred.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * This is always sql#operationError.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information about the error encountered.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaOperationError {
  
  @scala.inline
  def apply(): SchemaOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationError]
  }
  
  @scala.inline
  implicit class SchemaOperationErrorMutableBuilder[Self <: SchemaOperationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
