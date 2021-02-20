package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates properties of the named range with the specified namedRangeId.
  */
@js.native
trait SchemaUpdateNamedRangeRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `namedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The named range to update with the new properties.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}
object SchemaUpdateNamedRangeRequest {
  
  @scala.inline
  def apply(): SchemaUpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateNamedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateNamedRangeRequestMutableBuilder[Self <: SchemaUpdateNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setNamedRange(value: SchemaNamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
