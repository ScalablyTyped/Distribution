package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateProtectedRangeRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `protectedRange` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The protected range to update with the new properties.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.undefined
}
object SchemaUpdateProtectedRangeRequest {
  
  inline def apply(): SchemaUpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProtectedRangeRequest]
  }
  
  extension [Self <: SchemaUpdateProtectedRangeRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setProtectedRange(value: SchemaProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    inline def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
