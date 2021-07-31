package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates properties of the filter view.
  */
trait SchemaUpdateFilterViewRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `filter` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The new properties of the filter view.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.undefined
}
object SchemaUpdateFilterViewRequest {
  
  @scala.inline
  def apply(): SchemaUpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateFilterViewRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateFilterViewRequestMutableBuilder[Self <: SchemaUpdateFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaFilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
