package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateDimensionGroupRequest extends StObject {
  
  /**
    * The group whose state should be updated. The range and depth of the group should specify a valid group on the sheet, and all other fields updated.
    */
  var dimensionGroup: js.UndefOr[SchemaDimensionGroup] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `dimensionGroup` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateDimensionGroupRequest {
  
  inline def apply(): SchemaUpdateDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDimensionGroupRequest]
  }
  
  extension [Self <: SchemaUpdateDimensionGroupRequest](x: Self) {
    
    inline def setDimensionGroup(value: SchemaDimensionGroup): Self = StObject.set(x, "dimensionGroup", value.asInstanceOf[js.Any])
    
    inline def setDimensionGroupUndefined: Self = StObject.set(x, "dimensionGroup", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
