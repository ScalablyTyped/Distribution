package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatusCause extends StObject {
  
  /**
    * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed. Fields may appear more than once in an array of causes due to fields having multiple errors. Optional. Examples: "name" - the field "name" on the current resource "items[0].name" - the field "name" on the first array entry in "items" +optional
    */
  var field: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human-readable description of the cause of the error. This field may be presented as-is to a reader. +optional
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A machine-readable description of the cause of the error. If this value is empty there is no information available. +optional
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatusCause {
  
  inline def apply(): SchemaStatusCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusCause]
  }
  
  extension [Self <: SchemaStatusCause](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
