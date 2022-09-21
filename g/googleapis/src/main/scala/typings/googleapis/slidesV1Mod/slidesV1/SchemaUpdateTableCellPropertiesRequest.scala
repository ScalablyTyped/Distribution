package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateTableCellPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableCellProperties` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field. For example to update the table cell background solid fill color, set `fields` to `"tableCellBackgroundFill.solidFill.color"`. To reset a property to its default value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The table cell properties to update.
    */
  var tableCellProperties: js.UndefOr[SchemaTableCellProperties] = js.undefined
  
  /**
    * The table range representing the subset of the table to which the updates are applied. If a table range is not specified, the updates will apply to the entire table.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.undefined
}
object SchemaUpdateTableCellPropertiesRequest {
  
  inline def apply(): SchemaUpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableCellPropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateTableCellPropertiesRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTableCellProperties(value: SchemaTableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
    
    inline def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
    
    inline def setTableRange(value: SchemaTableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
