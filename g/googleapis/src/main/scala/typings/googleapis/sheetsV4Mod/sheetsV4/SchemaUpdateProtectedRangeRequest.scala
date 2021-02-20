package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates an existing protected range with the specified protectedRangeId.
  */
@js.native
trait SchemaUpdateProtectedRangeRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `protectedRange` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The protected range to update with the new properties.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}
object SchemaUpdateProtectedRangeRequest {
  
  @scala.inline
  def apply(): SchemaUpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateProtectedRangeRequestMutableBuilder[Self <: SchemaUpdateProtectedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setProtectedRange(value: SchemaProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
